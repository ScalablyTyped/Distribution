package typings.fhir.r5Mod

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
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  var _readHistory: js.UndefOr[Element] = js.undefined
  
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _supportedProfile: js.UndefOr[js.Array[Element]] = js.undefined
  
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
    * In general, a Resource will only appear in a CapabilityStatement if the server actually has some capabilities - e.g. there is at least one interaction supported. However interactions can be omitted to support summarization (_summary = true).
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestResourceInteraction]] = js.undefined
  
  /**
    * Operations linked from CapabilityStatement.rest.resource.operation must have OperationDefinition.type = true or OperationDefinition.instance = true.
    * If an operation that is listed in multiple CapabilityStatement.rest.resource.operation (e.g. for different resource types), then clients should understand that the operation is only supported on the specified resource types, and that may be a subset of those listed in OperationDefinition.resource.
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestResourceOperation]] = js.undefined
  
  /**
    * The profile applies to all  resources of this type - i.e. it is the superset of what is supported by the system.
    */
  var profile: js.UndefOr[String] = js.undefined
  
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
    * The search parameters should include the control search parameters such as _sort, _count, etc. that also apply to this resource (though many will be listed at [CapabilityStatement.rest.searchParam](capabilitystatement-definitions.html#CapabilityStatement.rest.searchParam)). The behavior of some search parameters may be further described by other code or extension elements, or narrative within the capability statement or linked [SearchParameter](searchparameter.html#) definitions.
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  
  /**
    * If this list is empty, the server does not support reverse includes.
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Supported profiles are different than the profile that applies to a particular resource in .rest.resource.profile. The resource profile is a general statement of what features of the resource are supported overall by the system - the sum total of the facilities it supports. A supported profile is a deeper statement about the functionality of the data and services provided by the server (or used by the client). A typical case is a laboratory system that produces a set of different reports - this is the list of types of data that it publishes. A key aspect of declaring profiles here is the question of how the client converts knowledge that the server publishes this data into working with the data; the client can inspect individual resources to determine whether they conform to a particular profile, but how does it find the ones that do? It does so by searching using the _profile parameter, so any resources listed here must be valid values for the _profile resource (using the identifier in the target profile).
    */
  var supportedProfile: js.UndefOr[js.Array[String]] = js.undefined
  
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
  
  inline def apply(`type`: String): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatementRestResource] (val x: Self) extends AnyVal {
    
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
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: CapabilityStatementRestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setOperation(value: js.Array[CapabilityStatementRestResourceOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: CapabilityStatementRestResourceOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
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
    
    inline def setSupportedProfile(value: js.Array[String]): Self = StObject.set(x, "supportedProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportedProfileUndefined: Self = StObject.set(x, "supportedProfile", js.undefined)
    
    inline def setSupportedProfileVarargs(value: String*): Self = StObject.set(x, "supportedProfile", js.Array(value*))
    
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
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
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
    
    inline def set_supportedProfile(value: js.Array[Element]): Self = StObject.set(x, "_supportedProfile", value.asInstanceOf[js.Any])
    
    inline def set_supportedProfileUndefined: Self = StObject.set(x, "_supportedProfile", js.undefined)
    
    inline def set_supportedProfileVarargs(value: Element*): Self = StObject.set(x, "_supportedProfile", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_updateCreate(value: Element): Self = StObject.set(x, "_updateCreate", value.asInstanceOf[js.Any])
    
    inline def set_updateCreateUndefined: Self = StObject.set(x, "_updateCreate", js.undefined)
    
    inline def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    inline def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
