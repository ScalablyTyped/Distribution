package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetTrainedModels
  extends StObject
     with Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var decompress_definition: js.UndefOr[Boolean] = js.undefined
  
  var for_export: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var include: js.UndefOr[String] = js.undefined
  
  var include_model_definition: js.UndefOr[Boolean] = js.undefined
  
  var model_id: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var tags: js.UndefOr[String | js.Array[String]] = js.undefined
}
object MlGetTrainedModels {
  
  @scala.inline
  def apply(): MlGetTrainedModels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModels]
  }
  
  @scala.inline
  implicit class MlGetTrainedModelsMutableBuilder[Self <: MlGetTrainedModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setDecompress_definition(value: Boolean): Self = StObject.set(x, "decompress_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompress_definitionUndefined: Self = StObject.set(x, "decompress_definition", js.undefined)
    
    @scala.inline
    def setFor_export(value: Boolean): Self = StObject.set(x, "for_export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFor_exportUndefined: Self = StObject.set(x, "for_export", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setInclude_model_definition(value: Boolean): Self = StObject.set(x, "include_model_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_model_definitionUndefined: Self = StObject.set(x, "include_model_definition", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTags(value: String | js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
