package typings.esquery.mod

import typings.esquery.esqueryStrings.descendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descendant
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Descendant: descendant
}
object Descendant {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector): Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("descendant")
    __obj.asInstanceOf[Descendant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descendant] (val x: Self) extends AnyVal {
    
    inline def setType(value: descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
