package typings.gapiClientFirestore.gapi.client.firestore

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapValue extends js.Object {
  /**
    * The map's fields.
    *
    * The map keys represent field names. Field names matching the regular
    * expression `__.&#42;__` are reserved. Reserved field names are forbidden except
    * in certain documented contexts. The map keys, represented as UTF-8, must
    * not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[Record[String, Value]] = js.native
}

object MapValue {
  @scala.inline
  def apply(): MapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapValue]
  }
  @scala.inline
  implicit class MapValueOps[Self <: MapValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFields(value: Record[String, Value]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

