package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListVoicesResponse. */
trait IListVoicesResponse extends StObject {
  
  /** ListVoicesResponse voices */
  var voices: js.UndefOr[js.Array[IVoice] | Null] = js.undefined
}
object IListVoicesResponse {
  
  inline def apply(): IListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListVoicesResponse]
  }
  
  extension [Self <: IListVoicesResponse](x: Self) {
    
    inline def setVoices(value: js.Array[IVoice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    inline def setVoicesNull: Self = StObject.set(x, "voices", null)
    
    inline def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
    
    inline def setVoicesVarargs(value: IVoice*): Self = StObject.set(x, "voices", js.Array(value*))
  }
}
