package typings.fhir.mod

import typings.fhir.fhirStrings.acoustical
import typings.fhir.fhirStrings.biological
import typings.fhir.fhirStrings.chemical
import typings.fhir.fhirStrings.electrical
import typings.fhir.fhirStrings.impedance
import typings.fhir.fhirStrings.manual
import typings.fhir.fhirStrings.mechanical
import typings.fhir.fhirStrings.nuclear
import typings.fhir.fhirStrings.optical
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.thermal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceComponent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _lastSystemChange: js.UndefOr[Element] = js.undefined
  
  var _measurementPrinciple: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the local assigned unique identification by the software. For example: handle ID.
    */
  var identifier: Identifier
  
  /**
    * Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
    */
  var languageCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the timestamp for the most recent system change which includes device configuration or setting change.
    */
  var lastSystemChange: String
  
  /**
    * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
    */
  var measurementPrinciple: js.UndefOr[
    other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual
  ] = js.undefined
  
  /**
    * Indicates current operational status of the device. For example: On, Off, Standby, etc.
    */
  var operationalStatus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
    */
  var parameterGroup: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the link to the parent resource. For example: Channel is linked to its VMD parent.
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the production specification such as component revision, serial number, etc.
    */
  var productionSpecification: js.UndefOr[js.Array[DeviceComponentProductionSpecification]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceComponent: typings.fhir.fhirStrings.DeviceComponent
  
  /**
    * Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the specific component type as defined in the object-oriented or metric nomenclature partition.
    */
  var `type`: CodeableConcept
}
object DeviceComponent {
  
  inline def apply(identifier: Identifier, lastSystemChange: String, `type`: CodeableConcept): DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], lastSystemChange = lastSystemChange.asInstanceOf[js.Any], resourceType = "DeviceComponent")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComponent]
  }
  
  extension [Self <: DeviceComponent](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: CodeableConcept): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLastSystemChange(value: String): Self = StObject.set(x, "lastSystemChange", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPrinciple(
      value: other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual
    ): Self = StObject.set(x, "measurementPrinciple", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPrincipleUndefined: Self = StObject.set(x, "measurementPrinciple", js.undefined)
    
    inline def setOperationalStatus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setOperationalStatusVarargs(value: CodeableConcept*): Self = StObject.set(x, "operationalStatus", js.Array(value*))
    
    inline def setParameterGroup(value: CodeableConcept): Self = StObject.set(x, "parameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "parameterGroup", js.undefined)
    
    inline def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProductionSpecification(value: js.Array[DeviceComponentProductionSpecification]): Self = StObject.set(x, "productionSpecification", value.asInstanceOf[js.Any])
    
    inline def setProductionSpecificationUndefined: Self = StObject.set(x, "productionSpecification", js.undefined)
    
    inline def setProductionSpecificationVarargs(value: DeviceComponentProductionSpecification*): Self = StObject.set(x, "productionSpecification", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceComponent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_lastSystemChange(value: Element): Self = StObject.set(x, "_lastSystemChange", value.asInstanceOf[js.Any])
    
    inline def set_lastSystemChangeUndefined: Self = StObject.set(x, "_lastSystemChange", js.undefined)
    
    inline def set_measurementPrinciple(value: Element): Self = StObject.set(x, "_measurementPrinciple", value.asInstanceOf[js.Any])
    
    inline def set_measurementPrincipleUndefined: Self = StObject.set(x, "_measurementPrinciple", js.undefined)
  }
}
