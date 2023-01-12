package typings.fhir.r2Mod

import typings.fhir.fhirStrings.bundled
import typings.fhir.fhirStrings.contained
import typings.fhir.fhirStrings.referenced
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionType
  extends StObject
     with Element {
  
  var _aggregation: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
    */
  var aggregation: js.UndefOr[js.Array[contained | referenced | bundled]] = js.undefined
  
  /**
    * Name of Data type or Resource that is a(or the) type used for this element.
    */
  var code: String
  
  /**
    * Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
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
    
    inline def set_aggregation(value: js.Array[Element]): Self = StObject.set(x, "_aggregation", value.asInstanceOf[js.Any])
    
    inline def set_aggregationUndefined: Self = StObject.set(x, "_aggregation", js.undefined)
    
    inline def set_aggregationVarargs(value: Element*): Self = StObject.set(x, "_aggregation", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value*))
  }
}
