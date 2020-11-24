package typings.esquery.mod

import typings.esquery.esqueryStrings.descendant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descendant
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Descendant: descendant = js.native
}
object Descendant {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: descendant): Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descendant]
  }
  
  @scala.inline
  implicit class DescendantOps[Self <: Descendant] (val x: Self) extends AnyVal {
    
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
    def setType(value: descendant): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
