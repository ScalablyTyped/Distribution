package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyComparisonGroup
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * A succinct description of the path through the study that would be followed by a subject adhering to this comparisonGroup.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Interventions or exposures in this comparisonGroup or cohort.
    */
  var intendedExposure: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows the comparisonGroup for the study and the comparisonGroup for the subject to be linked easily.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique, human-readable label for this comparisonGroup of the study.
    */
  var name: String
  
  /**
    * Group of participants who were enrolled in study comparisonGroup.
    */
  var observedGroup: js.UndefOr[Reference] = js.undefined
  
  /**
    * Categorization of study comparisonGroup, e.g. experimental, active comparator, placebo comparater.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ResearchStudyComparisonGroup {
  
  inline def apply(name: String): ResearchStudyComparisonGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudyComparisonGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyComparisonGroup] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIntendedExposure(value: js.Array[Reference]): Self = StObject.set(x, "intendedExposure", value.asInstanceOf[js.Any])
    
    inline def setIntendedExposureUndefined: Self = StObject.set(x, "intendedExposure", js.undefined)
    
    inline def setIntendedExposureVarargs(value: Reference*): Self = StObject.set(x, "intendedExposure", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObservedGroup(value: Reference): Self = StObject.set(x, "observedGroup", value.asInstanceOf[js.Any])
    
    inline def setObservedGroupUndefined: Self = StObject.set(x, "observedGroup", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
