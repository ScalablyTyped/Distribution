package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechResponse. */
trait ISynthesizeSpeechResponse extends StObject {
  
  /** SynthesizeSpeechResponse audioContent */
  var audioContent: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object ISynthesizeSpeechResponse {
  
  inline def apply(): ISynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechResponse]
  }
  
  extension [Self <: ISynthesizeSpeechResponse](x: Self) {
    
    inline def setAudioContent(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    inline def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
    
    inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
  }
}
