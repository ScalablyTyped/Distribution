package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OutputAudioConfig. */
trait IOutputAudioConfig extends StObject {
  
  /** OutputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.OutputAudioEncoding * / any */ String) | Null
  ] = js.undefined
  
  /** OutputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /** OutputAudioConfig synthesizeSpeechConfig */
  var synthesizeSpeechConfig: js.UndefOr[ISynthesizeSpeechConfig | Null] = js.undefined
}
object IOutputAudioConfig {
  
  inline def apply(): IOutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOutputAudioConfig]
  }
  
  extension [Self <: IOutputAudioConfig](x: Self) {
    
    inline def setAudioEncoding(
      value: OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.OutputAudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    inline def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSynthesizeSpeechConfig(value: ISynthesizeSpeechConfig): Self = StObject.set(x, "synthesizeSpeechConfig", value.asInstanceOf[js.Any])
    
    inline def setSynthesizeSpeechConfigNull: Self = StObject.set(x, "synthesizeSpeechConfig", null)
    
    inline def setSynthesizeSpeechConfigUndefined: Self = StObject.set(x, "synthesizeSpeechConfig", js.undefined)
  }
}
