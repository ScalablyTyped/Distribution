package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.ip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingIpProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[String] = js.undefined
  
  var `type`: ip
}
object MappingIpProperty {
  
  inline def apply(): MappingIpProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip")
    __obj.asInstanceOf[MappingIpProperty]
  }
  
  extension [Self <: MappingIpProperty](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNull_value(value: String): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: ip): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
