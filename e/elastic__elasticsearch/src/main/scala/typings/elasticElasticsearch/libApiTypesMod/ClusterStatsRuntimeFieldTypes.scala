package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsRuntimeFieldTypes extends StObject {
  
  var chars_max: integer
  
  var chars_total: integer
  
  var count: integer
  
  var doc_max: integer
  
  var doc_total: integer
  
  var index_count: integer
  
  var lang: js.Array[String]
  
  var lines_max: integer
  
  var lines_total: integer
  
  var name: Name
  
  var scriptless_count: integer
  
  var shadowed_count: integer
  
  var source_max: integer
  
  var source_total: integer
}
object ClusterStatsRuntimeFieldTypes {
  
  inline def apply(
    chars_max: integer,
    chars_total: integer,
    count: integer,
    doc_max: integer,
    doc_total: integer,
    index_count: integer,
    lang: js.Array[String],
    lines_max: integer,
    lines_total: integer,
    name: Name,
    scriptless_count: integer,
    shadowed_count: integer,
    source_max: integer,
    source_total: integer
  ): ClusterStatsRuntimeFieldTypes = {
    val __obj = js.Dynamic.literal(chars_max = chars_max.asInstanceOf[js.Any], chars_total = chars_total.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], doc_max = doc_max.asInstanceOf[js.Any], doc_total = doc_total.asInstanceOf[js.Any], index_count = index_count.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lines_max = lines_max.asInstanceOf[js.Any], lines_total = lines_total.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scriptless_count = scriptless_count.asInstanceOf[js.Any], shadowed_count = shadowed_count.asInstanceOf[js.Any], source_max = source_max.asInstanceOf[js.Any], source_total = source_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsRuntimeFieldTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsRuntimeFieldTypes] (val x: Self) extends AnyVal {
    
    inline def setChars_max(value: integer): Self = StObject.set(x, "chars_max", value.asInstanceOf[js.Any])
    
    inline def setChars_total(value: integer): Self = StObject.set(x, "chars_total", value.asInstanceOf[js.Any])
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDoc_max(value: integer): Self = StObject.set(x, "doc_max", value.asInstanceOf[js.Any])
    
    inline def setDoc_total(value: integer): Self = StObject.set(x, "doc_total", value.asInstanceOf[js.Any])
    
    inline def setIndex_count(value: integer): Self = StObject.set(x, "index_count", value.asInstanceOf[js.Any])
    
    inline def setLang(value: js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value*))
    
    inline def setLines_max(value: integer): Self = StObject.set(x, "lines_max", value.asInstanceOf[js.Any])
    
    inline def setLines_total(value: integer): Self = StObject.set(x, "lines_total", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScriptless_count(value: integer): Self = StObject.set(x, "scriptless_count", value.asInstanceOf[js.Any])
    
    inline def setShadowed_count(value: integer): Self = StObject.set(x, "shadowed_count", value.asInstanceOf[js.Any])
    
    inline def setSource_max(value: integer): Self = StObject.set(x, "source_max", value.asInstanceOf[js.Any])
    
    inline def setSource_total(value: integer): Self = StObject.set(x, "source_total", value.asInstanceOf[js.Any])
  }
}
