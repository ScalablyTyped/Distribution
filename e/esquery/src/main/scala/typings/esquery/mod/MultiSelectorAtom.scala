package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectorAtom extends SubjectSelectorAtom {
  
  var selectors: js.Array[SubjectSelector] = js.native
}
object MultiSelectorAtom {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: String): MultiSelectorAtom = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectorAtom]
  }
  
  @scala.inline
  implicit class MultiSelectorAtomMutableBuilder[Self <: MultiSelectorAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectors(value: js.Array[SubjectSelector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: SubjectSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
