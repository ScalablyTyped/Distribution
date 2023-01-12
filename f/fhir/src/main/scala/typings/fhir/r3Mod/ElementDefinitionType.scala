package typings.fhir.r3Mod

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
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  var _targetProfile: js.UndefOr[Element] = js.undefined
  
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
    */
  var aggregation: js.UndefOr[js.Array[contained | referenced | bundled]] = js.undefined
  
  /**
    * If the element is a reference to another resource, this element contains "Reference", and the targetProfile element defines what resources can be referenced. The targetProfile may be a reference to the general definition of a resource (e.g. http://hl7.org/fhir/StructureDefinition/Patient). There would be one pair of type/code for each allowed target resource type.
    */
  var code: String
  
  /**
    * Identifies a profile structure or implementation Guide that SHALL hold for the datatype this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a profile structure or implementation Guide that SHALL hold for the target of the reference this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
    */
  var targetProfile: js.UndefOr[String] = js.undefined
  
  /**
    * The base specification never makes a rule as to which form is allowed, but implementation guides may do this.
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
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setTargetProfile(value: String): Self = StObject.set(x, "targetProfile", value.asInstanceOf[js.Any])
    
    inline def setTargetProfileUndefined: Self = StObject.set(x, "targetProfile", js.undefined)
    
    inline def setVersioning(value: either | independent | specific): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    inline def set_aggregation(value: js.Array[Element]): Self = StObject.set(x, "_aggregation", value.asInstanceOf[js.Any])
    
    inline def set_aggregationUndefined: Self = StObject.set(x, "_aggregation", js.undefined)
    
    inline def set_aggregationVarargs(value: Element*): Self = StObject.set(x, "_aggregation", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_targetProfile(value: Element): Self = StObject.set(x, "_targetProfile", value.asInstanceOf[js.Any])
    
    inline def set_targetProfileUndefined: Self = StObject.set(x, "_targetProfile", js.undefined)
    
    inline def set_versioning(value: Element): Self = StObject.set(x, "_versioning", value.asInstanceOf[js.Any])
    
    inline def set_versioningUndefined: Self = StObject.set(x, "_versioning", js.undefined)
  }
}
