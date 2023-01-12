package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`no-version`
import typings.fhir.fhirStrings.`not-supported`
import typings.fhir.fhirStrings.`versioned-update`
import typings.fhir.fhirStrings.multiple
import typings.fhir.fhirStrings.single
import typings.fhir.fhirStrings.versioned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestResource
  extends StObject
     with BackboneElement {
  
  var _conditionalCreate: js.UndefOr[Element] = js.undefined
  
  var _conditionalDelete: js.UndefOr[Element] = js.undefined
  
  var _conditionalUpdate: js.UndefOr[Element] = js.undefined
  
  var _readHistory: js.UndefOr[Element] = js.undefined
  
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _updateCreate: js.UndefOr[Element] = js.undefined
  
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * A flag that indicates that the server supports conditional create.
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A code that indicates how the server supports conditional delete.
    */
  var conditionalDelete: js.UndefOr[`not-supported` | single | multiple] = js.undefined
  
  /**
    * A flag that indicates that the server supports conditional update.
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies a restful operation supported by the solution.
    */
  var interaction: js.Array[ConformanceRestResourceInteraction]
  
  /**
    * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
    */
  var profile: js.UndefOr[Reference] = js.undefined
  
  /**
    * A flag for whether the server is able to return past versions as part of the vRead operation.
    */
  var readHistory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of _include values supported by the server.
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
    */
  var searchParam: js.UndefOr[js.Array[ConformanceRestResourceSearchParam]] = js.undefined
  
  /**
    * A list of _revinclude (reverse include) values supported by the server.
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A type of resource exposed via the restful interface.
    */
  var `type`: String
  
  /**
    * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
    */
  var updateCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
    */
  var versioning: js.UndefOr[`no-version` | versioned | `versioned-update`] = js.undefined
}
object ConformanceRestResource {
  
  inline def apply(interaction: js.Array[ConformanceRestResourceInteraction], `type`: String): ConformanceRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRestResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConformanceRestResource] (val x: Self) extends AnyVal {
    
    inline def setConditionalCreate(value: Boolean): Self = StObject.set(x, "conditionalCreate", value.asInstanceOf[js.Any])
    
    inline def setConditionalCreateUndefined: Self = StObject.set(x, "conditionalCreate", js.undefined)
    
    inline def setConditionalDelete(value: `not-supported` | single | multiple): Self = StObject.set(x, "conditionalDelete", value.asInstanceOf[js.Any])
    
    inline def setConditionalDeleteUndefined: Self = StObject.set(x, "conditionalDelete", js.undefined)
    
    inline def setConditionalUpdate(value: Boolean): Self = StObject.set(x, "conditionalUpdate", value.asInstanceOf[js.Any])
    
    inline def setConditionalUpdateUndefined: Self = StObject.set(x, "conditionalUpdate", js.undefined)
    
    inline def setInteraction(value: js.Array[ConformanceRestResourceInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionVarargs(value: ConformanceRestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setReadHistory(value: Boolean): Self = StObject.set(x, "readHistory", value.asInstanceOf[js.Any])
    
    inline def setReadHistoryUndefined: Self = StObject.set(x, "readHistory", js.undefined)
    
    inline def setSearchInclude(value: js.Array[String]): Self = StObject.set(x, "searchInclude", value.asInstanceOf[js.Any])
    
    inline def setSearchIncludeUndefined: Self = StObject.set(x, "searchInclude", js.undefined)
    
    inline def setSearchIncludeVarargs(value: String*): Self = StObject.set(x, "searchInclude", js.Array(value*))
    
    inline def setSearchParam(value: js.Array[ConformanceRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: ConformanceRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
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
    
    inline def set_conditionalUpdate(value: Element): Self = StObject.set(x, "_conditionalUpdate", value.asInstanceOf[js.Any])
    
    inline def set_conditionalUpdateUndefined: Self = StObject.set(x, "_conditionalUpdate", js.undefined)
    
    inline def set_readHistory(value: Element): Self = StObject.set(x, "_readHistory", value.asInstanceOf[js.Any])
    
    inline def set_readHistoryUndefined: Self = StObject.set(x, "_readHistory", js.undefined)
    
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
