package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRuntimeFieldsType extends StObject {
  
  var chars_max: long
  
  var chars_total: long
  
  var count: long
  
  var doc_max: long
  
  var doc_total: long
  
  var index_count: long
  
  var lang: js.Array[String]
  
  var lines_max: long
  
  var lines_total: long
  
  var name: Field
  
  var scriptless_count: long
  
  var shadowed_count: long
  
  var source_max: long
  
  var source_total: long
}
object XpackUsageRuntimeFieldsType {
  
  inline def apply(
    chars_max: long,
    chars_total: long,
    count: long,
    doc_max: long,
    doc_total: long,
    index_count: long,
    lang: js.Array[String],
    lines_max: long,
    lines_total: long,
    name: Field,
    scriptless_count: long,
    shadowed_count: long,
    source_max: long,
    source_total: long
  ): XpackUsageRuntimeFieldsType = {
    val __obj = js.Dynamic.literal(chars_max = chars_max.asInstanceOf[js.Any], chars_total = chars_total.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], doc_max = doc_max.asInstanceOf[js.Any], doc_total = doc_total.asInstanceOf[js.Any], index_count = index_count.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lines_max = lines_max.asInstanceOf[js.Any], lines_total = lines_total.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scriptless_count = scriptless_count.asInstanceOf[js.Any], shadowed_count = shadowed_count.asInstanceOf[js.Any], source_max = source_max.asInstanceOf[js.Any], source_total = source_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageRuntimeFieldsType]
  }
  
  extension [Self <: XpackUsageRuntimeFieldsType](x: Self) {
    
    inline def setChars_max(value: long): Self = StObject.set(x, "chars_max", value.asInstanceOf[js.Any])
    
    inline def setChars_total(value: long): Self = StObject.set(x, "chars_total", value.asInstanceOf[js.Any])
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDoc_max(value: long): Self = StObject.set(x, "doc_max", value.asInstanceOf[js.Any])
    
    inline def setDoc_total(value: long): Self = StObject.set(x, "doc_total", value.asInstanceOf[js.Any])
    
    inline def setIndex_count(value: long): Self = StObject.set(x, "index_count", value.asInstanceOf[js.Any])
    
    inline def setLang(value: js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value*))
    
    inline def setLines_max(value: long): Self = StObject.set(x, "lines_max", value.asInstanceOf[js.Any])
    
    inline def setLines_total(value: long): Self = StObject.set(x, "lines_total", value.asInstanceOf[js.Any])
    
    inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScriptless_count(value: long): Self = StObject.set(x, "scriptless_count", value.asInstanceOf[js.Any])
    
    inline def setShadowed_count(value: long): Self = StObject.set(x, "shadowed_count", value.asInstanceOf[js.Any])
    
    inline def setSource_max(value: long): Self = StObject.set(x, "source_max", value.asInstanceOf[js.Any])
    
    inline def setSource_total(value: long): Self = StObject.set(x, "source_total", value.asInstanceOf[js.Any])
  }
}
