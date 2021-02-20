package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to perform some action on or in regards to an existing resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ProcessRequest extends DomainResource {
  
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'include'.
    */
  var _include: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'nullify'.
    */
  var _nullify: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * cancel | poll | reprocess | status
    */
  var action: js.UndefOr[code] = js.native
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * Resource type(s) to exclude
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Resource type(s) to include
    */
  var include: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Items to re-adjudicate
    */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.native
  
  /**
    * Remove history
    */
  var nullify: js.UndefOr[Boolean] = js.native
  
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  
  /**
    * Selection period
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.native
  
  /**
    * Reference number/string
    */
  var reference: js.UndefOr[String] = js.native
  
  /**
    * Reference to the Request resource
    */
  var request: js.UndefOr[Reference] = js.native
  
  /**
    * Reference to the Response resource
    */
  var response: js.UndefOr[Reference] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Party which is the target of the request
    */
  var target: js.UndefOr[Reference] = js.native
}
object ProcessRequest {
  
  @scala.inline
  def apply(): ProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessRequest]
  }
  
  @scala.inline
  implicit class ProcessRequestMutableBuilder[Self <: ProcessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: code): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[ProcessRequestItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ProcessRequestItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    @scala.inline
    def setNullify(value: Boolean): Self = StObject.set(x, "nullify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullifyUndefined: Self = StObject.set(x, "nullify", js.undefined)
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_exclude(value: js.Array[Element]): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    @scala.inline
    def set_excludeVarargs(value: Element*): Self = StObject.set(x, "_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_include(value: js.Array[Element]): Self = StObject.set(x, "_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_includeUndefined: Self = StObject.set(x, "_include", js.undefined)
    
    @scala.inline
    def set_includeVarargs(value: Element*): Self = StObject.set(x, "_include", js.Array(value :_*))
    
    @scala.inline
    def set_nullify(value: Element): Self = StObject.set(x, "_nullify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nullifyUndefined: Self = StObject.set(x, "_nullify", js.undefined)
    
    @scala.inline
    def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
