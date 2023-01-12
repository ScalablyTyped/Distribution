package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinarySelectorAtom
  extends StObject
     with SubjectSelectorAtom {
  
  var left: SubjectSelector
  
  var right: SubjectSelector
  
  @JSName("type")
  var type_BinarySelectorAtom: child | sibling | adjacent | descendant
}
object BinarySelectorAtom {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector, `type`: child | sibling | adjacent | descendant): BinarySelectorAtom = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelectorAtom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinarySelectorAtom] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: SubjectSelector): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: SubjectSelector): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: child | sibling | adjacent | descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
