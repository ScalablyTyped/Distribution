package typings.esquery.mod

import typings.esquery.esqueryStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Negation
  extends StObject
     with MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Negation: not
}
object Negation {
  
  inline def apply(selectors: js.Array[SubjectSelector]): Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not")
    __obj.asInstanceOf[Negation]
  }
  
  extension [Self <: Negation](x: Self) {
    
    inline def setType(value: not): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
