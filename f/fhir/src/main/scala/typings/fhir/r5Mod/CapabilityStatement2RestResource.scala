package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatement2RestResource
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  var _supportedProfile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional information about the resource type used by the system.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * A statement that affirms support for a feature, in this context.
    */
  var feature: js.UndefOr[js.Array[CapabilityStatement2RestFeature]] = js.undefined
  
  /**
    * In general, a Resource will only appear in a CapabilityStatement2 if the server actually has some capabilities - e.g. there is at least one interaction supported. However interactions can be omitted to support summarization (_summary = true).
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatement2RestResourceInteraction]] = js.undefined
  
  /**
    * Operations linked from CapabilityStatement2.rest.resource.operation must have OperationDefinition.type = true or OperationDefinition.instance = true.
    * If an operation that is listed in multiple CapabilityStatement2.rest.resource.operation (e.g. for different resource types), then clients should understand that the operation is only supported on the specified resource types, and that may be a subset of those listed in OperationDefinition.resource.
    */
  var operation: js.UndefOr[js.Array[CapabilityStatement2RestResourceOperation]] = js.undefined
  
  /**
    * The profile applies to all  resources of this type - i.e. it is the superset of what is supported by the system.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    * The search parameters should include the control search parameters such as _sort, _count, etc. that also apply to this resource (though many will be listed at [CapabilityStatement2.rest.searchParam](capabilitystatement2-definitions.html#CapabilityStatement2.rest.searchParam)). The behavior of some search parameters may be further described by other code or extension elements, or narrative within the capability statement or linked [SearchParameter](searchparameter.html#) definitions.
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatement2RestResourceSearchParam]] = js.undefined
  
  /**
    * Supported profiles are different than the profile that applies to a particular resource in .rest.resource.profile. The resource profile is a general statement of what features of the resource are supported overall by the system - the sum total of the facilities it supports. A supported profile is a deeper statement about the functionality of the data and services provided by the server (or used by the client). A typical case is a laboratory system that produces a set of different reports - this is the list of types of data that it publishes. A key aspect of declaring profiles here is the question of how the client converts knowledge that the server publishes this data into working with the data; the client can inspect individual resources to determine whether they conform to a particular profile, but how does it find the ones that do? It does so by searching using the _profile parameter, so any resources listed here must be valid values for the _profile resource (using the identifier in the target profile).
    */
  var supportedProfile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A type of resource exposed via the restful interface.
    */
  var `type`: String
}
object CapabilityStatement2RestResource {
  
  inline def apply(`type`: String): CapabilityStatement2RestResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement2RestResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatement2RestResource] (val x: Self) extends AnyVal {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFeature(value: js.Array[CapabilityStatement2RestFeature]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setFeatureVarargs(value: CapabilityStatement2RestFeature*): Self = StObject.set(x, "feature", js.Array(value*))
    
    inline def setInteraction(value: js.Array[CapabilityStatement2RestResourceInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: CapabilityStatement2RestResourceInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setOperation(value: js.Array[CapabilityStatement2RestResourceOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: CapabilityStatement2RestResourceOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSearchParam(value: js.Array[CapabilityStatement2RestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatement2RestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
    inline def setSupportedProfile(value: js.Array[String]): Self = StObject.set(x, "supportedProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportedProfileUndefined: Self = StObject.set(x, "supportedProfile", js.undefined)
    
    inline def setSupportedProfileVarargs(value: String*): Self = StObject.set(x, "supportedProfile", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_supportedProfile(value: js.Array[Element]): Self = StObject.set(x, "_supportedProfile", value.asInstanceOf[js.Any])
    
    inline def set_supportedProfileUndefined: Self = StObject.set(x, "_supportedProfile", js.undefined)
    
    inline def set_supportedProfileVarargs(value: Element*): Self = StObject.set(x, "_supportedProfile", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
