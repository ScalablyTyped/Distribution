package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to perform some action on or in regards to an existing resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ProcessRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'include'.
    */
  var _include: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'nullify'.
    */
  var _nullify: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * cancel | poll | reprocess | status
    */
  var action: js.UndefOr[code] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Resource type(s) to exclude
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Resource type(s) to include
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Items to re-adjudicate
    */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.undefined
  
  /**
    * Remove history
    */
  var nullify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Selection period
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reference number/string
    */
  var reference: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the Request resource
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reference to the Response resource
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Party which is the target of the request
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object ProcessRequest {
  
  inline def apply(): ProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessRequest]
  }
  
  extension [Self <: ProcessRequest](x: Self) {
    
    inline def setAction(value: code): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    inline def setItem(value: js.Array[ProcessRequestItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ProcessRequestItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
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
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    inline def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_exclude(value: js.Array[Element]): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_excludeVarargs(value: Element*): Self = StObject.set(x, "_exclude", js.Array(value :_*))
    
    inline def set_include(value: js.Array[Element]): Self = StObject.set(x, "_include", value.asInstanceOf[js.Any])
    
    inline def set_includeUndefined: Self = StObject.set(x, "_include", js.undefined)
    
    inline def set_includeVarargs(value: Element*): Self = StObject.set(x, "_include", js.Array(value :_*))
    
    inline def set_nullify(value: Element): Self = StObject.set(x, "_nullify", value.asInstanceOf[js.Any])
    
    inline def set_nullifyUndefined: Self = StObject.set(x, "_nullify", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
