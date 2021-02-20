package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of a medical-related component of a medical device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceComponent extends DomainResource {
  
  /**
    * Contains extended information for property 'lastSystemChange'.
    */
  var _lastSystemChange: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'measurementPrinciple'.
    */
  var _measurementPrinciple: js.UndefOr[Element] = js.native
  
  /**
    * Instance id assigned by the software stack
    */
  var identifier: Identifier = js.native
  
  /**
    * Language code for the human-readable text strings produced by the device
    */
  var languageCode: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Recent system change timestamp
    */
  var lastSystemChange: js.UndefOr[instant] = js.native
  
  /**
    * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
    */
  var measurementPrinciple: js.UndefOr[code] = js.native
  
  /**
    * Current operational status of the component, for example On, Off or Standby
    */
  var operationalStatus: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Current supported parameter group
    */
  var parameterGroup: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Parent resource link
    */
  var parent: js.UndefOr[Reference] = js.native
  
  /**
    * Specification details such as Component Revisions, or Serial Numbers
    */
  var productionSpecification: js.UndefOr[js.Array[DeviceComponentProductionSpecification]] = js.native
  
  /**
    * Top-level device resource link
    */
  var source: js.UndefOr[Reference] = js.native
  
  /**
    * What kind of component it is
    */
  var `type`: CodeableConcept = js.native
}
object DeviceComponent {
  
  @scala.inline
  def apply(identifier: Identifier, `type`: CodeableConcept): DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComponent]
  }
  
  @scala.inline
  implicit class DeviceComponentMutableBuilder[Self <: DeviceComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCode(value: CodeableConcept): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLastSystemChange(value: instant): Self = StObject.set(x, "lastSystemChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSystemChangeUndefined: Self = StObject.set(x, "lastSystemChange", js.undefined)
    
    @scala.inline
    def setMeasurementPrinciple(value: code): Self = StObject.set(x, "measurementPrinciple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementPrincipleUndefined: Self = StObject.set(x, "measurementPrinciple", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    @scala.inline
    def setOperationalStatusVarargs(value: CodeableConcept*): Self = StObject.set(x, "operationalStatus", js.Array(value :_*))
    
    @scala.inline
    def setParameterGroup(value: CodeableConcept): Self = StObject.set(x, "parameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupUndefined: Self = StObject.set(x, "parameterGroup", js.undefined)
    
    @scala.inline
    def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProductionSpecification(value: js.Array[DeviceComponentProductionSpecification]): Self = StObject.set(x, "productionSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductionSpecificationUndefined: Self = StObject.set(x, "productionSpecification", js.undefined)
    
    @scala.inline
    def setProductionSpecificationVarargs(value: DeviceComponentProductionSpecification*): Self = StObject.set(x, "productionSpecification", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastSystemChange(value: Element): Self = StObject.set(x, "_lastSystemChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastSystemChangeUndefined: Self = StObject.set(x, "_lastSystemChange", js.undefined)
    
    @scala.inline
    def set_measurementPrinciple(value: Element): Self = StObject.set(x, "_measurementPrinciple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_measurementPrincipleUndefined: Self = StObject.set(x, "_measurementPrinciple", js.undefined)
  }
}
