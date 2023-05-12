package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAssociation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * Current anatomical location of the device in/on subject.
    */
  var bodyStructure: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the relationship between the device and subject.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reference to the devices associated with the patient or group.
    */
  var device: Reference
  
  /**
    * Instance identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The details about the device when it is in use to describe its operation.
    */
  var operation: js.UndefOr[js.Array[DeviceAssociationOperation]] = js.undefined
  
  /**
    * Begin and end dates and times for the device association.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceAssociation: typings.fhir.fhirStrings.DeviceAssociation
  
  /**
    * Indicates the state of the Device association.
    */
  var status: CodeableConcept
  
  /**
    * The reasons given for the current association status.
    */
  var statusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The individual, group of individuals or device that the device is on or associated with.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object DeviceAssociation {
  
  inline def apply(device: Reference, status: CodeableConcept): DeviceAssociation = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceAssociation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAssociation] (val x: Self) extends AnyVal {
    
    inline def setBodyStructure(value: Reference): Self = StObject.set(x, "bodyStructure", value.asInstanceOf[js.Any])
    
    inline def setBodyStructureUndefined: Self = StObject.set(x, "bodyStructure", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOperation(value: js.Array[DeviceAssociationOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: DeviceAssociationOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceAssociation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "statusReason", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
