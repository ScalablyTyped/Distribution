package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource served on the REST interface
  */
trait CapabilityStatementRestResource
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'conditionalCreate'.
    */
  var _conditionalCreate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'conditionalDelete'.
    */
  var _conditionalDelete: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'conditionalRead'.
    */
  var _conditionalRead: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'conditionalUpdate'.
    */
  var _conditionalUpdate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'readHistory'.
    */
  var _readHistory: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'referencePolicy'.
    */
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'searchInclude'.
    */
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'searchRevInclude'.
    */
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'updateCreate'.
    */
  var _updateCreate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * If allows/uses conditional create
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * not-supported | single | multiple - how conditional delete is supported
    */
  var conditionalDelete: js.UndefOr[code] = js.undefined
  
  /**
    * not-supported | modified-since | not-match | full-support
    */
  var conditionalRead: js.UndefOr[code] = js.undefined
  
  /**
    * If allows/uses conditional update
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional information about the use of the resource type
    */
  var documentation: js.UndefOr[markdown] = js.undefined
  
  /**
    * What operations are supported?
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction]
  
  /**
    * Base System profile for all uses of resource
    */
  var profile: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether vRead can return past versions
    */
  var readHistory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * literal | logical | resolves | enforced | local
    */
  var referencePolicy: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * _include values supported by the server
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Search parameters supported by implementation
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  
  /**
    * _revinclude values supported by the server
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A resource type that is supported
    */
  var `type`: code
  
  /**
    * If update can commit to a new identity
    */
  var updateCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * no-version | versioned | versioned-update
    */
  var versioning: js.UndefOr[code] = js.undefined
}
object CapabilityStatementRestResource {
  
  inline def apply(interaction: js.Array[CapabilityStatementRestResourceInteraction], `type`: code): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  
  extension [Self <: CapabilityStatementRestResource](x: Self) {
    
    inline def setConditionalCreate(value: Boolean): Self = StObject.set(x, "conditionalCreate", value.asInstanceOf[js.Any])
    
    inline def setConditionalCreateUndefined: Self = StObject.set(x, "conditionalCreate", js.undefined)
    
    inline def setConditionalDelete(value: code): Self = StObject.set(x, "conditionalDelete", value.asInstanceOf[js.Any])
    
    inline def setConditionalDeleteUndefined: Self = StObject.set(x, "conditionalDelete", js.undefined)
    
    inline def setConditionalRead(value: code): Self = StObject.set(x, "conditionalRead", value.asInstanceOf[js.Any])
    
    inline def setConditionalReadUndefined: Self = StObject.set(x, "conditionalRead", js.undefined)
    
    inline def setConditionalUpdate(value: Boolean): Self = StObject.set(x, "conditionalUpdate", value.asInstanceOf[js.Any])
    
    inline def setConditionalUpdateUndefined: Self = StObject.set(x, "conditionalUpdate", js.undefined)
    
    inline def setDocumentation(value: markdown): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setInteraction(value: js.Array[CapabilityStatementRestResourceInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionVarargs(value: CapabilityStatementRestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value :_*))
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setReadHistory(value: Boolean): Self = StObject.set(x, "readHistory", value.asInstanceOf[js.Any])
    
    inline def setReadHistoryUndefined: Self = StObject.set(x, "readHistory", js.undefined)
    
    inline def setReferencePolicy(value: js.Array[code]): Self = StObject.set(x, "referencePolicy", value.asInstanceOf[js.Any])
    
    inline def setReferencePolicyUndefined: Self = StObject.set(x, "referencePolicy", js.undefined)
    
    inline def setReferencePolicyVarargs(value: code*): Self = StObject.set(x, "referencePolicy", js.Array(value :_*))
    
    inline def setSearchInclude(value: js.Array[String]): Self = StObject.set(x, "searchInclude", value.asInstanceOf[js.Any])
    
    inline def setSearchIncludeUndefined: Self = StObject.set(x, "searchInclude", js.undefined)
    
    inline def setSearchIncludeVarargs(value: String*): Self = StObject.set(x, "searchInclude", js.Array(value :_*))
    
    inline def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value :_*))
    
    inline def setSearchRevInclude(value: js.Array[String]): Self = StObject.set(x, "searchRevInclude", value.asInstanceOf[js.Any])
    
    inline def setSearchRevIncludeUndefined: Self = StObject.set(x, "searchRevInclude", js.undefined)
    
    inline def setSearchRevIncludeVarargs(value: String*): Self = StObject.set(x, "searchRevInclude", js.Array(value :_*))
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateCreate(value: Boolean): Self = StObject.set(x, "updateCreate", value.asInstanceOf[js.Any])
    
    inline def setUpdateCreateUndefined: Self = StObject.set(x, "updateCreate", js.undefined)
    
    inline def setVersioning(value: code): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    inline def set_conditionalCreate(value: Element): Self = StObject.set(x, "_conditionalCreate", value.asInstanceOf[js.Any])
    
    inline def set_conditionalCreateUndefined: Self = StObject.set(x, "_conditionalCreate", js.undefined)
    
    inline def set_conditionalDelete(value: Element): Self = StObject.set(x, "_conditionalDelete", value.asInstanceOf[js.Any])
    
    inline def set_conditionalDeleteUndefined: Self = StObject.set(x, "_conditionalDelete", js.undefined)
    
    inline def set_conditionalRead(value: Element): Self = StObject.set(x, "_conditionalRead", value.asInstanceOf[js.Any])
    
    inline def set_conditionalReadUndefined: Self = StObject.set(x, "_conditionalRead", js.undefined)
    
    inline def set_conditionalUpdate(value: Element): Self = StObject.set(x, "_conditionalUpdate", value.asInstanceOf[js.Any])
    
    inline def set_conditionalUpdateUndefined: Self = StObject.set(x, "_conditionalUpdate", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_readHistory(value: Element): Self = StObject.set(x, "_readHistory", value.asInstanceOf[js.Any])
    
    inline def set_readHistoryUndefined: Self = StObject.set(x, "_readHistory", js.undefined)
    
    inline def set_referencePolicy(value: js.Array[Element]): Self = StObject.set(x, "_referencePolicy", value.asInstanceOf[js.Any])
    
    inline def set_referencePolicyUndefined: Self = StObject.set(x, "_referencePolicy", js.undefined)
    
    inline def set_referencePolicyVarargs(value: Element*): Self = StObject.set(x, "_referencePolicy", js.Array(value :_*))
    
    inline def set_searchInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchInclude", value.asInstanceOf[js.Any])
    
    inline def set_searchIncludeUndefined: Self = StObject.set(x, "_searchInclude", js.undefined)
    
    inline def set_searchIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchInclude", js.Array(value :_*))
    
    inline def set_searchRevInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchRevInclude", value.asInstanceOf[js.Any])
    
    inline def set_searchRevIncludeUndefined: Self = StObject.set(x, "_searchRevInclude", js.undefined)
    
    inline def set_searchRevIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchRevInclude", js.Array(value :_*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_updateCreate(value: Element): Self = StObject.set(x, "_updateCreate", value.asInstanceOf[js.Any])
    
    inline def set_updateCreateUndefined: Self = StObject.set(x, "_updateCreate", js.undefined)
    
    inline def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    inline def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
