package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphVertexDefinition extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var field: Field
  
  var include: js.UndefOr[js.Array[GraphVertexInclude]] = js.undefined
  
  var min_doc_count: js.UndefOr[long] = js.undefined
  
  var shard_min_doc_count: js.UndefOr[long] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object GraphVertexDefinition {
  
  inline def apply(field: Field): GraphVertexDefinition = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphVertexDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphVertexDefinition] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: js.Array[GraphVertexInclude]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: GraphVertexInclude*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setMin_doc_count(value: long): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setShard_min_doc_count(value: long): Self = StObject.set(x, "shard_min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setShard_min_doc_countUndefined: Self = StObject.set(x, "shard_min_doc_count", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
