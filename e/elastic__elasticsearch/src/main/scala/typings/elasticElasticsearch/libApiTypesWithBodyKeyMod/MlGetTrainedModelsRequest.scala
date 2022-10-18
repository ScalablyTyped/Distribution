package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetTrainedModelsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var decompress_definition: js.UndefOr[Boolean] = js.undefined
  
  var exclude_generated: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var include: js.UndefOr[MlInclude] = js.undefined
  
  var model_id: js.UndefOr[Id] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
}
object MlGetTrainedModelsRequest {
  
  inline def apply(): MlGetTrainedModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModelsRequest]
  }
  
  extension [Self <: MlGetTrainedModelsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setDecompress_definition(value: Boolean): Self = StObject.set(x, "decompress_definition", value.asInstanceOf[js.Any])
    
    inline def setDecompress_definitionUndefined: Self = StObject.set(x, "decompress_definition", js.undefined)
    
    inline def setExclude_generated(value: Boolean): Self = StObject.set(x, "exclude_generated", value.asInstanceOf[js.Any])
    
    inline def setExclude_generatedUndefined: Self = StObject.set(x, "exclude_generated", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setInclude(value: MlInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
