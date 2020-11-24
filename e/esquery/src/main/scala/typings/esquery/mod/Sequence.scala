package typings.esquery.mod

import typings.esquery.esqueryStrings.compound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Sequence: compound = js.native
}
object Sequence {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: compound): Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  
  @scala.inline
  implicit class SequenceOps[Self <: Sequence] (val x: Self) extends AnyVal {
    
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
    def setType(value: compound): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
