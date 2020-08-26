package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionType extends Type_ {
  var elements: js.Array[Type_] = js.native
  var `type`: typings.doctrine.doctrineStrings.UnionType = js.native
}

object UnionType {
  @scala.inline
  def apply(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.UnionType): UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionType]
  }
  @scala.inline
  implicit class UnionTypeOps[Self <: UnionType] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: Type_ *): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Type_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.UnionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

