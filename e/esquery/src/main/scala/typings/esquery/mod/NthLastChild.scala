package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-last-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NthLastChild
  extends NthSelectorAtom
     with NthSelector
     with Selector {
  
  @JSName("type")
  var type_NthLastChild: `nth-last-child` = js.native
}
object NthLastChild {
  
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-last-child`): NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthLastChild]
  }
  
  @scala.inline
  implicit class NthLastChildOps[Self <: NthLastChild] (val x: Self) extends AnyVal {
    
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
    def setType(value: `nth-last-child`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
