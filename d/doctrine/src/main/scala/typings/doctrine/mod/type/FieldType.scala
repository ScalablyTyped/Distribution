package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldType extends Type_ {
  var key: String = js.native
  var `type`: typings.doctrine.doctrineStrings.FieldType = js.native
  var value: js.UndefOr[Type_] = js.native
}

object FieldType {
  @scala.inline
  def apply(key: String, `type`: typings.doctrine.doctrineStrings.FieldType): FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  @scala.inline
  implicit class FieldTypeOps[Self <: FieldType] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.FieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Type_): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

