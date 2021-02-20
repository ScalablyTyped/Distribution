package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-last-child`
import org.scalablytyped.runtime.StObject
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
  implicit class NthLastChildMutableBuilder[Self <: NthLastChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `nth-last-child`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
