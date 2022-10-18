package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatMlTrainedModelsRequest
  extends StObject
     with CatCatRequestBase {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  @JSName("h")
  var h_CatMlTrainedModelsRequest: js.UndefOr[CatCatTrainedModelsColumns] = js.undefined
  
  var model_id: js.UndefOr[Id] = js.undefined
  
  @JSName("s")
  var s_CatMlTrainedModelsRequest: js.UndefOr[CatCatTrainedModelsColumns] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object CatMlTrainedModelsRequest {
  
  inline def apply(): CatMlTrainedModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlTrainedModelsRequest]
  }
  
  extension [Self <: CatMlTrainedModelsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setH(value: CatCatTrainedModelsColumns): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: CatCatTrainedModelsColumn*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setS(value: CatCatTrainedModelsColumns): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: CatCatTrainedModelsColumn*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
