package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectSelectorAtom
  extends StObject
     with Atom {
  
  var subject: js.UndefOr[Boolean] = js.undefined
}
object SubjectSelectorAtom {
  
  inline def apply(`type`: String): SubjectSelectorAtom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectSelectorAtom]
  }
  
  extension [Self <: SubjectSelectorAtom](x: Self) {
    
    inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
