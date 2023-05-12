package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyAssociatedParty
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * A categorization other than role for the associated party.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Name of associated party.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Suggestions of a better attribute name are appreciated
    */
  var party: js.UndefOr[Reference] = js.undefined
  
  /**
    * The cardinality is 0..* due to the fact that an associated party may be intermittently active in a given role over multiple time periods.
    */
  var period: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * Type of association.
    */
  var role: CodeableConcept
}
object ResearchStudyAssociatedParty {
  
  inline def apply(role: CodeableConcept): ResearchStudyAssociatedParty = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudyAssociatedParty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyAssociatedParty] (val x: Self) extends AnyVal {
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPeriod(value: js.Array[Period]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriodVarargs(value: Period*): Self = StObject.set(x, "period", js.Array(value*))
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
