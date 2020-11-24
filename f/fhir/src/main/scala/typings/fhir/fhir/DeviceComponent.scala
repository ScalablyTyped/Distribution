package typings.fhir.fhir

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
  implicit class DeviceComponentOps[Self <: DeviceComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastSystemChange(value: Element): Self = this.set("_lastSystemChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lastSystemChange: Self = this.set("_lastSystemChange", js.undefined)
    
    @scala.inline
    def set_measurementPrinciple(value: Element): Self = this.set("_measurementPrinciple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_measurementPrinciple: Self = this.set("_measurementPrinciple", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: CodeableConcept): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLastSystemChange(value: instant): Self = this.set("lastSystemChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSystemChange: Self = this.set("lastSystemChange", js.undefined)
    
    @scala.inline
    def setMeasurementPrinciple(value: code): Self = this.set("measurementPrinciple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementPrinciple: Self = this.set("measurementPrinciple", js.undefined)
    
    @scala.inline
    def setOperationalStatusVarargs(value: CodeableConcept*): Self = this.set("operationalStatus", js.Array(value :_*))
    
    @scala.inline
    def setOperationalStatus(value: js.Array[CodeableConcept]): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    
    @scala.inline
    def setParameterGroup(value: CodeableConcept): Self = this.set("parameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroup: Self = this.set("parameterGroup", js.undefined)
    
    @scala.inline
    def setParent(value: Reference): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProductionSpecificationVarargs(value: DeviceComponentProductionSpecification*): Self = this.set("productionSpecification", js.Array(value :_*))
    
    @scala.inline
    def setProductionSpecification(value: js.Array[DeviceComponentProductionSpecification]): Self = this.set("productionSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionSpecification: Self = this.set("productionSpecification", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
