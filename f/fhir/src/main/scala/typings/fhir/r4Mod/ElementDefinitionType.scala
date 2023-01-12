package typings.fhir.r4Mod

import typings.fhir.fhirStrings.bundled
import typings.fhir.fhirStrings.contained
import typings.fhir.fhirStrings.either
import typings.fhir.fhirStrings.independent
import typings.fhir.fhirStrings.referenced
import typings.fhir.fhirStrings.specific
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionType
  extends StObject
     with Element {
  
  var _aggregation: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _targetProfile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * See [Aggregation Rules](elementdefinition.html#aggregation) for further clarification.
    */
  var aggregation: js.UndefOr[js.Array[contained | referenced | bundled]] = js.undefined
  
  /**
    * If the element is a reference to another resource, this element contains "Reference", and the targetProfile element defines what resources can be referenced. The targetProfile may be a reference to the general definition of a resource (e.g. http://hl7.org/fhir/StructureDefinition/Patient).
    */
  var code: String
  
  /**
    * It is possible to profile  backbone element (e.g. part of a resource), using the [profile-element](extension-elementdefinition-profile-element.html) extension.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Used when the type is "Reference" or "canonical", and identifies a profile structure or implementation Guide that applies to the target of the reference this element refers to. If any profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the target resource SHALL conform to at least one profile defined in the implementation guide.
    */
  var targetProfile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The base specification never makes a rule as to which form is allowed, but implementation guides may do this. See [Aggregation Rules](elementdefinition.html#aggregation) for further clarification.
    */
  var versioning: js.UndefOr[either | independent | specific] = js.undefined
}
object ElementDefinitionType {
  
  inline def apply(code: String): ElementDefinitionType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionType] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: js.Array[contained | referenced | bundled]): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setAggregationVarargs(value: (contained | referenced | bundled)*): Self = StObject.set(x, "aggregation", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setTargetProfile(value: js.Array[String]): Self = StObject.set(x, "targetProfile", value.asInstanceOf[js.Any])
    
    inline def setTargetProfileUndefined: Self = StObject.set(x, "targetProfile", js.undefined)
    
    inline def setTargetProfileVarargs(value: String*): Self = StObject.set(x, "targetProfile", js.Array(value*))
    
    inline def setVersioning(value: either | independent | specific): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    inline def set_aggregation(value: js.Array[Element]): Self = StObject.set(x, "_aggregation", value.asInstanceOf[js.Any])
    
    inline def set_aggregationUndefined: Self = StObject.set(x, "_aggregation", js.undefined)
    
    inline def set_aggregationVarargs(value: Element*): Self = StObject.set(x, "_aggregation", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value*))
    
    inline def set_targetProfile(value: js.Array[Element]): Self = StObject.set(x, "_targetProfile", value.asInstanceOf[js.Any])
    
    inline def set_targetProfileUndefined: Self = StObject.set(x, "_targetProfile", js.undefined)
    
    inline def set_targetProfileVarargs(value: Element*): Self = StObject.set(x, "_targetProfile", js.Array(value*))
    
    inline def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    inline def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
