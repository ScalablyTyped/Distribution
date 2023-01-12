package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDatafeedResponse[TDocument] extends StObject {
  
  var data: js.Array[TDocument]
}
object MlPreviewDatafeedResponse {
  
  inline def apply[TDocument](data: js.Array[TDocument]): MlPreviewDatafeedResponse[TDocument] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDatafeedResponse[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPreviewDatafeedResponse[?], TDocument] (val x: Self & MlPreviewDatafeedResponse[TDocument]) extends AnyVal {
    
    inline def setData(value: js.Array[TDocument]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: TDocument*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
