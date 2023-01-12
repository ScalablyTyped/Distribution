package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dense_vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDenseVectorProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var dims: integer
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingDenseVectorIndexOptions] = js.undefined
  
  var similarity: js.UndefOr[String] = js.undefined
  
  var `type`: dense_vector
}
object MappingDenseVectorProperty {
  
  inline def apply(dims: integer): MappingDenseVectorProperty = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dense_vector")
    __obj.asInstanceOf[MappingDenseVectorProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDenseVectorProperty] (val x: Self) extends AnyVal {
    
    inline def setDims(value: integer): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingDenseVectorIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setSimilarity(value: String): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "similarity", js.undefined)
    
    inline def setType(value: dense_vector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
