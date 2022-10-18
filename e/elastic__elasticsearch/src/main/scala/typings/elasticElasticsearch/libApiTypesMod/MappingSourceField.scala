package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingSourceField extends StObject {
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var compress_threshold: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  
  var includes: js.UndefOr[js.Array[String]] = js.undefined
}
object MappingSourceField {
  
  inline def apply(): MappingSourceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingSourceField]
  }
  
  extension [Self <: MappingSourceField](x: Self) {
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setCompress_threshold(value: String): Self = StObject.set(x, "compress_threshold", value.asInstanceOf[js.Any])
    
    inline def setCompress_thresholdUndefined: Self = StObject.set(x, "compress_threshold", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
  }
}
