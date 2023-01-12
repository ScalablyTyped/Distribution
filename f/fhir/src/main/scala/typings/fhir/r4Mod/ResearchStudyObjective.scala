package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyObjective
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Unique, human-readable label for this objective of the study.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of study objective.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ResearchStudyObjective {
  
  inline def apply(): ResearchStudyObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchStudyObjective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyObjective] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
