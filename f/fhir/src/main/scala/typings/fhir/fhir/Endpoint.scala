package typings.fhir.fhir

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
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: uri): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionType(value: Coding): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadTypeVarargs(value: CodeableConcept*): Self = this.set("payloadType", js.Array(value :_*))
    
    @scala.inline
    def setPayloadType(value: js.Array[CodeableConcept]): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_address(value: Element): Self = this.set("_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_address: Self = this.set("_address", js.undefined)
    
    @scala.inline
    def set_headerVarargs(value: Element*): Self = this.set("_header", js.Array(value :_*))
    
    @scala.inline
    def set_header(value: js.Array[Element]): Self = this.set("_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_header: Self = this.set("_header", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_payloadMimeTypeVarargs(value: Element*): Self = this.set("_payloadMimeType", js.Array(value :_*))
    
    @scala.inline
    def set_payloadMimeType(value: js.Array[Element]): Self = this.set("_payloadMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_payloadMimeType: Self = this.set("_payloadMimeType", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPayloadMimeTypeVarargs(value: code*): Self = this.set("payloadMimeType", js.Array(value :_*))
    
    @scala.inline
    def setPayloadMimeType(value: js.Array[code]): Self = this.set("payloadMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadMimeType: Self = this.set("payloadMimeType", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
