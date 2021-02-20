package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource served on the REST interface
  */
@js.native
trait CapabilityStatementRestResource extends BackboneElement {
  
  /**
    * Contains extended information for property 'conditionalCreate'.
    */
  var _conditionalCreate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'conditionalDelete'.
    */
  var _conditionalDelete: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'conditionalRead'.
    */
  var _conditionalRead: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'conditionalUpdate'.
    */
  var _conditionalUpdate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'readHistory'.
    */
  var _readHistory: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'referencePolicy'.
    */
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'searchInclude'.
    */
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'searchRevInclude'.
    */
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'updateCreate'.
    */
  var _updateCreate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.native
  
  /**
    * If allows/uses conditional create
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.native
  
  /**
    * not-supported | single | multiple - how conditional delete is supported
    */
  var conditionalDelete: js.UndefOr[code] = js.native
  
  /**
    * not-supported | modified-since | not-match | full-support
    */
  var conditionalRead: js.UndefOr[code] = js.native
  
  /**
    * If allows/uses conditional update
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional information about the use of the resource type
    */
  var documentation: js.UndefOr[markdown] = js.native
  
  /**
    * What operations are supported?
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction] = js.native
  
  /**
    * Base System profile for all uses of resource
    */
  var profile: js.UndefOr[Reference] = js.native
  
  /**
    * Whether vRead can return past versions
    */
  var readHistory: js.UndefOr[Boolean] = js.native
  
  /**
    * literal | logical | resolves | enforced | local
    */
  var referencePolicy: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * _include values supported by the server
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Search parameters supported by implementation
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  
  /**
    * _revinclude values supported by the server
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A resource type that is supported
    */
  var `type`: code = js.native
  
  /**
    * If update can commit to a new identity
    */
  var updateCreate: js.UndefOr[Boolean] = js.native
  
  /**
    * no-version | versioned | versioned-update
    */
  var versioning: js.UndefOr[code] = js.native
}
object CapabilityStatementRestResource {
  
  @scala.inline
  def apply(interaction: js.Array[CapabilityStatementRestResourceInteraction], `type`: code): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestResourceMutableBuilder[Self <: CapabilityStatementRestResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionalCreate(value: Boolean): Self = StObject.set(x, "conditionalCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalCreateUndefined: Self = StObject.set(x, "conditionalCreate", js.undefined)
    
    @scala.inline
    def setConditionalDelete(value: code): Self = StObject.set(x, "conditionalDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalDeleteUndefined: Self = StObject.set(x, "conditionalDelete", js.undefined)
    
    @scala.inline
    def setConditionalRead(value: code): Self = StObject.set(x, "conditionalRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalReadUndefined: Self = StObject.set(x, "conditionalRead", js.undefined)
    
    @scala.inline
    def setConditionalUpdate(value: Boolean): Self = StObject.set(x, "conditionalUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalUpdateUndefined: Self = StObject.set(x, "conditionalUpdate", js.undefined)
    
    @scala.inline
    def setDocumentation(value: markdown): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setInteraction(value: js.Array[CapabilityStatementRestResourceInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionVarargs(value: CapabilityStatementRestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setReadHistory(value: Boolean): Self = StObject.set(x, "readHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadHistoryUndefined: Self = StObject.set(x, "readHistory", js.undefined)
    
    @scala.inline
    def setReferencePolicy(value: js.Array[code]): Self = StObject.set(x, "referencePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePolicyUndefined: Self = StObject.set(x, "referencePolicy", js.undefined)
    
    @scala.inline
    def setReferencePolicyVarargs(value: code*): Self = StObject.set(x, "referencePolicy", js.Array(value :_*))
    
    @scala.inline
    def setSearchInclude(value: js.Array[String]): Self = StObject.set(x, "searchInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchIncludeUndefined: Self = StObject.set(x, "searchInclude", js.undefined)
    
    @scala.inline
    def setSearchIncludeVarargs(value: String*): Self = StObject.set(x, "searchInclude", js.Array(value :_*))
    
    @scala.inline
    def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    @scala.inline
    def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value :_*))
    
    @scala.inline
    def setSearchRevInclude(value: js.Array[String]): Self = StObject.set(x, "searchRevInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchRevIncludeUndefined: Self = StObject.set(x, "searchRevInclude", js.undefined)
    
    @scala.inline
    def setSearchRevIncludeVarargs(value: String*): Self = StObject.set(x, "searchRevInclude", js.Array(value :_*))
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCreate(value: Boolean): Self = StObject.set(x, "updateCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCreateUndefined: Self = StObject.set(x, "updateCreate", js.undefined)
    
    @scala.inline
    def setVersioning(value: code): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    @scala.inline
    def set_conditionalCreate(value: Element): Self = StObject.set(x, "_conditionalCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conditionalCreateUndefined: Self = StObject.set(x, "_conditionalCreate", js.undefined)
    
    @scala.inline
    def set_conditionalDelete(value: Element): Self = StObject.set(x, "_conditionalDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conditionalDeleteUndefined: Self = StObject.set(x, "_conditionalDelete", js.undefined)
    
    @scala.inline
    def set_conditionalRead(value: Element): Self = StObject.set(x, "_conditionalRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conditionalReadUndefined: Self = StObject.set(x, "_conditionalRead", js.undefined)
    
    @scala.inline
    def set_conditionalUpdate(value: Element): Self = StObject.set(x, "_conditionalUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conditionalUpdateUndefined: Self = StObject.set(x, "_conditionalUpdate", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_readHistory(value: Element): Self = StObject.set(x, "_readHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_readHistoryUndefined: Self = StObject.set(x, "_readHistory", js.undefined)
    
    @scala.inline
    def set_referencePolicy(value: js.Array[Element]): Self = StObject.set(x, "_referencePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_referencePolicyUndefined: Self = StObject.set(x, "_referencePolicy", js.undefined)
    
    @scala.inline
    def set_referencePolicyVarargs(value: Element*): Self = StObject.set(x, "_referencePolicy", js.Array(value :_*))
    
    @scala.inline
    def set_searchInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_searchIncludeUndefined: Self = StObject.set(x, "_searchInclude", js.undefined)
    
    @scala.inline
    def set_searchIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchInclude", js.Array(value :_*))
    
    @scala.inline
    def set_searchRevInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchRevInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_searchRevIncludeUndefined: Self = StObject.set(x, "_searchRevInclude", js.undefined)
    
    @scala.inline
    def set_searchRevIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchRevInclude", js.Array(value :_*))
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_updateCreate(value: Element): Self = StObject.set(x, "_updateCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateCreateUndefined: Self = StObject.set(x, "_updateCreate", js.undefined)
    
    @scala.inline
    def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
