package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectorAtom
  extends StObject
     with SubjectSelectorAtom {
  
  var selectors: js.Array[SubjectSelector]
}
object MultiSelectorAtom {
  
  inline def apply(selectors: js.Array[SubjectSelector], `type`: String): MultiSelectorAtom = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectorAtom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiSelectorAtom] (val x: Self) extends AnyVal {
    
    inline def setSelectors(value: js.Array[SubjectSelector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: SubjectSelector*): Self = StObject.set(x, "selectors", js.Array(value*))
  }
}
