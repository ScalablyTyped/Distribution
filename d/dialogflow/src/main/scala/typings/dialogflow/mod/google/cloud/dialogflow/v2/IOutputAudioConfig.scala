package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OutputAudioConfig. */
trait IOutputAudioConfig extends StObject {
  
  /** OutputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.OutputAudioEncoding * / any */ String) | Null
  ] = js.undefined
  
  /** OutputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /** OutputAudioConfig synthesizeSpeechConfig */
  var synthesizeSpeechConfig: js.UndefOr[ISynthesizeSpeechConfig | Null] = js.undefined
}
object IOutputAudioConfig {
  
  @scala.inline
  def apply(): IOutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOutputAudioConfig]
  }
  
  @scala.inline
  implicit class IOutputAudioConfigMutableBuilder[Self <: IOutputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(
      value: OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.OutputAudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSynthesizeSpeechConfig(value: ISynthesizeSpeechConfig): Self = StObject.set(x, "synthesizeSpeechConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynthesizeSpeechConfigNull: Self = StObject.set(x, "synthesizeSpeechConfig", null)
    
    @scala.inline
    def setSynthesizeSpeechConfigUndefined: Self = StObject.set(x, "synthesizeSpeechConfig", js.undefined)
  }
}
