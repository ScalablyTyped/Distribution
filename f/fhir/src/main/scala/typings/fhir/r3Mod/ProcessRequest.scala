package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancel
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.poll
import typings.fhir.fhirStrings.reprocess
import typings.fhir.fhirStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _action: js.UndefOr[Element] = js.undefined
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _exclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _include: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _nullify: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
    */
  var action: js.UndefOr[cancel | poll | reprocess | status] = js.undefined
  
  /**
    * The date when this resource was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Names of resource types to exclude.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ProcessRequest business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Names of resource types to include.
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
    */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.undefined
  
  /**
    * If true remove all history excluding audit.
    */
  var nullify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The organization which is responsible for the action speccified in this request.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * A period of time during which the fulfilling resources would have been created.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The practitioner who is responsible for the action specified in this request.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to supply which authenticates the process.
    */
  var reference: js.UndefOr[String] = js.undefined
  
  /**
    * Reference of resource which is the target or subject of this action.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ProcessRequest: typings.fhir.fhirStrings.ProcessRequest
  
  /**
    * Reference of a prior response to resource which is the target or subject of this action.
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
  
  /**
    * The organization which is the target of the request.
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object ProcessRequest {
  
  inline def apply(): ProcessRequest = {
    val __obj = js.Dynamic.literal(resourceType = "ProcessRequest")
    __obj.asInstanceOf[ProcessRequest]
  }
  
  extension [Self <: ProcessRequest](x: Self) {
    
    inline def setAction(value: cancel | poll | reprocess | status): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setItem(value: js.Array[ProcessRequestItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ProcessRequestItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setNullify(value: Boolean): Self = StObject.set(x, "nullify", value.asInstanceOf[js.Any])
    
    inline def setNullifyUndefined: Self = StObject.set(x, "nullify", js.undefined)
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ProcessRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    inline def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_exclude(value: js.Array[Element]): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_excludeVarargs(value: Element*): Self = StObject.set(x, "_exclude", js.Array(value*))
    
    inline def set_include(value: js.Array[Element]): Self = StObject.set(x, "_include", value.asInstanceOf[js.Any])
    
    inline def set_includeUndefined: Self = StObject.set(x, "_include", js.undefined)
    
    inline def set_includeVarargs(value: Element*): Self = StObject.set(x, "_include", js.Array(value*))
    
    inline def set_nullify(value: Element): Self = StObject.set(x, "_nullify", value.asInstanceOf[js.Any])
    
    inline def set_nullifyUndefined: Self = StObject.set(x, "_nullify", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
