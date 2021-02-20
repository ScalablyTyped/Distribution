package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-child`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NthChild
  extends NthSelectorAtom
     with NthSelector
     with Selector {
  
  @JSName("type")
  var type_NthChild: `nth-child` = js.native
}
object NthChild {
  
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-child`): NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthChild]
  }
  
  @scala.inline
  implicit class NthChildMutableBuilder[Self <: NthChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `nth-child`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
