package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.off
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _address: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * For rest-hook, and websocket, the end-point must be an http: or https: URL; for email, a mailto: url, for sms, a tel: url, and for message the endpoint can be in any form of url the server understands (usually, http: or mllp:). The URI is allowed to be relative; in which case, it is relative to the server end-point (since there may be more than one, clients should avoid using relative URIs)
    * This address will be to the service base, without any parameters, or sub-services or resources tacked on.
    * E.g. for a WADO-RS endpoint, the url should be "https://pacs.hospital.org/wado-rs"
    * and not "https://pacs.hospital.org/wado-rs/studies/1.2.250.1.59.40211.12345678.678910/series/1.2.250.1.59.40211.789001276.14556172.67789/instances/...".
    */
  var address: String
  
  /**
    * For additional connectivity details for the protocol, extensions will be used at this point, as in the XDS example. If there are multiple payload types or mimetypes they are all applicable for all connection types, and all have the same status.
    */
  var connectionType: js.Array[CodeableConcept]
  
  /**
    * Contact details for a human to contact about the endpoint. The primary use of this for system administrator troubleshooting.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The description of the endpoint and what it is for (typically used as supplemental information in an endpoint directory describing its usage/purpose).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The type of environment(s) exposed at this endpoint (dev, prod, test, etc.).
    */
  var environmentType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Exactly what these mean depends on the channel type. The can convey additional information to the recipient and/or meet security requirements.
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This property is not typically used when searching for Endpoint resources for usage. The typical usage is via the reference from an applicable Organization/Location/Practitioner resource, which is where the context is provided. Multiple Locations may reference a single endpoint, and don't have to be within the same organization resource, but most likely within the same organizational hierarchy.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * A friendly name that this endpoint can be referred to with.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Note that not all mimetypes or types will be listed under the one endpoint resource, there may be multiple instances that information for cases where other header data such as the endpoint address, active status/period etc. is different.
    */
  var payload: js.UndefOr[js.Array[EndpointPayload]] = js.undefined
  
  /**
    * Temporary downtimes or other short-term changes in availability would not be represented in this property.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Endpoint: typings.fhir.fhirStrings.Endpoint
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the endpoint as not currently valid. Temporary downtimes or other unexpected short-term changes in availability would not be represented in this property.
    */
  var status: active | suspended | error | off | `entered-in-error`
}
object Endpoint {
  
  inline def apply(
    address: String,
    connectionType: js.Array[CodeableConcept],
    status: active | suspended | error | off | `entered-in-error`
  ): Endpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], resourceType = "Endpoint", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "connectionType", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "environmentType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTypeUndefined: Self = StObject.set(x, "environmentType", js.undefined)
    
    inline def setEnvironmentTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "environmentType", js.Array(value*))
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayload(value: js.Array[EndpointPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: EndpointPayload*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Endpoint): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | suspended | error | off | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    inline def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    inline def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    inline def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
