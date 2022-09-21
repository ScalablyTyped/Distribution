package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`full-support`
import typings.fhir.fhirStrings.`modified-since`
import typings.fhir.fhirStrings.`no-version`
import typings.fhir.fhirStrings.`not-match`
import typings.fhir.fhirStrings.`not-supported`
import typings.fhir.fhirStrings.`versioned-update`
import typings.fhir.fhirStrings.enforced
import typings.fhir.fhirStrings.literal
import typings.fhir.fhirStrings.local
import typings.fhir.fhirStrings.logical
import typings.fhir.fhirStrings.multiple
import typings.fhir.fhirStrings.resolves
import typings.fhir.fhirStrings.single
import typings.fhir.fhirStrings.versioned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRestResource
  extends StObject
     with BackboneElement {
  
  var _conditionalCreate: js.UndefOr[Element] = js.undefined
  
  var _conditionalDelete: js.UndefOr[Element] = js.undefined
  
  var _conditionalRead: js.UndefOr[Element] = js.undefined
  
  var _conditionalUpdate: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _readHistory: js.UndefOr[Element] = js.undefined
  
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _updateCreate: js.UndefOr[Element] = js.undefined
  
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * Conditional Create is mainly appropriate for interface engine scripts converting from other formats, such as v2.
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Conditional Delete is mainly appropriate for interface engine scripts converting from other formats, such as v2.
    */
  var conditionalDelete: js.UndefOr[`not-supported` | single | multiple] = js.undefined
  
  /**
    * Conditional Read is mainly appropriate for interface engine scripts converting from other formats, such as v2.
    */
  var conditionalRead: js.UndefOr[`not-supported` | `modified-since` | `not-match` | `full-support`] = js.undefined
  
  /**
    * Conditional Update is mainly appropriate for interface engine scripts converting from other formats, such as v2.
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional information about the resource type used by the system.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a restful operation supported by the solution.
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction]
  
  /**
    * The profile applies to all  resources of this type - i.e. it is the superset of what is supported by the system.
    */
  var profile: js.UndefOr[Reference] = js.undefined
  
  /**
    * It is useful to support the vRead operation for current operations, even if past versions aren't available.
    */
  var readHistory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of flags that defines how references are supported.
    */
  var referencePolicy: js.UndefOr[js.Array[literal | logical | resolves | enforced | local]] = js.undefined
  
  /**
    * If this list is empty, the server does not support includes.
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  
  /**
    * If this list is empty, the server does not support reverse includes.
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A type of resource exposed via the restful interface.
    */
  var `type`: String
  
  /**
    * Allowing the clients to create new identities on the server means that the system administrator needs to have confidence that the clients do not create clashing identities between them. Obviously, if there is only one client, this won't happen. While creating identities on the client means that the clients need to be managed, it's much more convenient for many scenarios if such management can be put in place.
    */
  var updateCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a server supports versionIds correctly, it SHOULD support vread too, but is not required to do so.
    */
  var versioning: js.UndefOr[`no-version` | versioned | `versioned-update`] = js.undefined
}
object CapabilityStatementRestResource {
  
  inline def apply(interaction: js.Array[CapabilityStatementRestResourceInteraction], `type`: String): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  
  extension [Self <: CapabilityStatementRestResource](x: Self) {
    
    inline def setConditionalCreate(value: Boolean): Self = StObject.set(x, "conditionalCreate", value.asInstanceOf[js.Any])
    
    inline def setConditionalCreateUndefined: Self = StObject.set(x, "conditionalCreate", js.undefined)
    
    inline def setConditionalDelete(value: `not-supported` | single | multiple): Self = StObject.set(x, "conditionalDelete", value.asInstanceOf[js.Any])
    
    inline def setConditionalDeleteUndefined: Self = StObject.set(x, "conditionalDelete", js.undefined)
    
    inline def setConditionalRead(value: `not-supported` | `modified-since` | `not-match` | `full-support`): Self = StObject.set(x, "conditionalRead", value.asInstanceOf[js.Any])
    
    inline def setConditionalReadUndefined: Self = StObject.set(x, "conditionalRead", js.undefined)
    
    inline def setConditionalUpdate(value: Boolean): Self = StObject.set(x, "conditionalUpdate", value.asInstanceOf[js.Any])
    
    inline def setConditionalUpdateUndefined: Self = StObject.set(x, "conditionalUpdate", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setInteraction(value: js.Array[CapabilityStatementRestResourceInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionVarargs(value: CapabilityStatementRestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setReadHistory(value: Boolean): Self = StObject.set(x, "readHistory", value.asInstanceOf[js.Any])
    
    inline def setReadHistoryUndefined: Self = StObject.set(x, "readHistory", js.undefined)
    
    inline def setReferencePolicy(value: js.Array[literal | logical | resolves | enforced | local]): Self = StObject.set(x, "referencePolicy", value.asInstanceOf[js.Any])
    
    inline def setReferencePolicyUndefined: Self = StObject.set(x, "referencePolicy", js.undefined)
    
    inline def setReferencePolicyVarargs(value: (literal | logical | resolves | enforced | local)*): Self = StObject.set(x, "referencePolicy", js.Array(value*))
    
    inline def setSearchInclude(value: js.Array[String]): Self = StObject.set(x, "searchInclude", value.asInstanceOf[js.Any])
    
    inline def setSearchIncludeUndefined: Self = StObject.set(x, "searchInclude", js.undefined)
    
    inline def setSearchIncludeVarargs(value: String*): Self = StObject.set(x, "searchInclude", js.Array(value*))
    
    inline def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
    inline def setSearchRevInclude(value: js.Array[String]): Self = StObject.set(x, "searchRevInclude", value.asInstanceOf[js.Any])
    
    inline def setSearchRevIncludeUndefined: Self = StObject.set(x, "searchRevInclude", js.undefined)
    
    inline def setSearchRevIncludeVarargs(value: String*): Self = StObject.set(x, "searchRevInclude", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateCreate(value: Boolean): Self = StObject.set(x, "updateCreate", value.asInstanceOf[js.Any])
    
    inline def setUpdateCreateUndefined: Self = StObject.set(x, "updateCreate", js.undefined)
    
    inline def setVersioning(value: `no-version` | versioned | `versioned-update`): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
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
    
    inline def set_referencePolicyVarargs(value: Element*): Self = StObject.set(x, "_referencePolicy", js.Array(value*))
    
    inline def set_searchInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchInclude", value.asInstanceOf[js.Any])
    
    inline def set_searchIncludeUndefined: Self = StObject.set(x, "_searchInclude", js.undefined)
    
    inline def set_searchIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchInclude", js.Array(value*))
    
    inline def set_searchRevInclude(value: js.Array[Element]): Self = StObject.set(x, "_searchRevInclude", value.asInstanceOf[js.Any])
    
    inline def set_searchRevIncludeUndefined: Self = StObject.set(x, "_searchRevInclude", js.undefined)
    
    inline def set_searchRevIncludeVarargs(value: Element*): Self = StObject.set(x, "_searchRevInclude", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_updateCreate(value: Element): Self = StObject.set(x, "_updateCreate", value.asInstanceOf[js.Any])
    
    inline def set_updateCreateUndefined: Self = StObject.set(x, "_updateCreate", js.undefined)
    
    inline def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    inline def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
