package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-last-child`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthLastChild
  extends StObject
     with NthSelectorAtom
     with NthSelector
     with Selector {
  
  @JSName("type")
  var type_NthLastChild: `nth-last-child`
}
object NthLastChild {
  
  inline def apply(index: NumericLiteral): NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[NthLastChild]
  }
  
  extension [Self <: NthLastChild](x: Self) {
    
    inline def setType(value: `nth-last-child`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
