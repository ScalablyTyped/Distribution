package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The technical details of an endpoint that can be used for electronic services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Endpoint extends DomainResource {
  
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'payloadMimeType'.
    */
  var _payloadMimeType: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * The technical base address for connecting to this endpoint
    */
  var address: uri = js.native
  
  /**
    * Protocol/Profile/Standard to be used with this endpoint connection
    */
  var connectionType: Coding = js.native
  
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.native
  
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Identifies this endpoint across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  
  /**
    * A name that this endpoint can be identified by
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Mimetype to send. If not specified, the content could be anything (including no payload, if the connectionType defined this)
    */
  var payloadMimeType: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)
    */
  var payloadType: js.Array[CodeableConcept] = js.native
  
  /**
    * Interval the endpoint is expected to be operational
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * active | suspended | error | off | entered-in-error | test
    */
  var status: code = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(address: uri, connectionType: Coding, payloadType: js.Array[CodeableConcept], status: code): Endpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: uri): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionType(value: Coding): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayloadMimeType(value: js.Array[code]): Self = StObject.set(x, "payloadMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadMimeTypeUndefined: Self = StObject.set(x, "payloadMimeType", js.undefined)
    
    @scala.inline
    def setPayloadMimeTypeVarargs(value: code*): Self = StObject.set(x, "payloadMimeType", js.Array(value :_*))
    
    @scala.inline
    def setPayloadType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "payloadType", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
    
    @scala.inline
    def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    @scala.inline
    def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value :_*))
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_payloadMimeType(value: js.Array[Element]): Self = StObject.set(x, "_payloadMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_payloadMimeTypeUndefined: Self = StObject.set(x, "_payloadMimeType", js.undefined)
    
    @scala.inline
    def set_payloadMimeTypeVarargs(value: Element*): Self = StObject.set(x, "_payloadMimeType", js.Array(value :_*))
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
