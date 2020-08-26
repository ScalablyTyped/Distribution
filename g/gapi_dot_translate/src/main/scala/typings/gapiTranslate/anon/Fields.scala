package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The text to detect
    */
  var q: js.Array[String] = js.native
}

object Fields {
  @scala.inline
  def apply(q: js.Array[String]): Fields = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def setQVarargs(value: String*): Self = this.set("q", js.Array(value :_*))
    @scala.inline
    def setQ(value: js.Array[String]): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

