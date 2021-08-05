package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data type and Profile for this element
  */
trait ElementDefinitionType
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'aggregation'.
    */
  var _aggregation: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'targetProfile'.
    */
  var _targetProfile: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.undefined
  
  /**
    * contained | referenced | bundled - how aggregated
    */
  var aggregation: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * Data type or Resource (reference to definition)
    */
  var code: uri
  
  /**
    * Profile (StructureDefinition) to apply (or IG)
    */
  var profile: js.UndefOr[uri] = js.undefined
  
  /**
    * Profile (StructureDefinition) to apply to reference target (or IG)
    */
  var targetProfile: js.UndefOr[uri] = js.undefined
  
  /**
    * either | independent | specific
    */
  var versioning: js.UndefOr[code] = js.undefined
}
object ElementDefinitionType {
  
  inline def apply(code: uri): ElementDefinitionType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionType]
  }
  
  extension [Self <: ElementDefinitionType](x: Self) {
    
    inline def setAggregation(value: js.Array[code]): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setAggregationVarargs(value: code*): Self = StObject.set(x, "aggregation", js.Array(value :_*))
    
    inline def setCode(value: uri): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: uri): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setTargetProfile(value: uri): Self = StObject.set(x, "targetProfile", value.asInstanceOf[js.Any])
    
    inline def setTargetProfileUndefined: Self = StObject.set(x, "targetProfile", js.undefined)
    
    inline def setVersioning(value: code): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    inline def set_aggregation(value: js.Array[Element]): Self = StObject.set(x, "_aggregation", value.asInstanceOf[js.Any])
    
    inline def set_aggregationUndefined: Self = StObject.set(x, "_aggregation", js.undefined)
    
    inline def set_aggregationVarargs(value: Element*): Self = StObject.set(x, "_aggregation", js.Array(value :_*))
    
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
