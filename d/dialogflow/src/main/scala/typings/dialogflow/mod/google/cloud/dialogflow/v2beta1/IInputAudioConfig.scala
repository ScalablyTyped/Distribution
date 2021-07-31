package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an InputAudioConfig. */
trait IInputAudioConfig extends StObject {
  
  /** InputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.AudioEncoding * / any */ String) | Null
  ] = js.undefined
  
  /** InputAudioConfig enableWordInfo */
  var enableWordInfo: js.UndefOr[Boolean | Null] = js.undefined
  
  /** InputAudioConfig languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** InputAudioConfig model */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /** InputAudioConfig modelVariant */
  var modelVariant: js.UndefOr[
    SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SpeechModelVariant * / any */ String) | Null
  ] = js.undefined
  
  /** InputAudioConfig phraseHints */
  var phraseHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** InputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /** InputAudioConfig singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
  
  /** InputAudioConfig speechContexts */
  var speechContexts: js.UndefOr[js.Array[ISpeechContext] | Null] = js.undefined
}
object IInputAudioConfig {
  
  @scala.inline
  def apply(): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputAudioConfig]
  }
  
  @scala.inline
  implicit class IInputAudioConfigMutableBuilder[Self <: IInputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(
      value: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.AudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setEnableWordInfo(value: Boolean): Self = StObject.set(x, "enableWordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWordInfoNull: Self = StObject.set(x, "enableWordInfo", null)
    
    @scala.inline
    def setEnableWordInfoUndefined: Self = StObject.set(x, "enableWordInfo", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNull: Self = StObject.set(x, "model", null)
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setModelVariant(
      value: SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SpeechModelVariant * / any */ String)
    ): Self = StObject.set(x, "modelVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVariantNull: Self = StObject.set(x, "modelVariant", null)
    
    @scala.inline
    def setModelVariantUndefined: Self = StObject.set(x, "modelVariant", js.undefined)
    
    @scala.inline
    def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhraseHintsNull: Self = StObject.set(x, "phraseHints", null)
    
    @scala.inline
    def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    @scala.inline
    def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value :_*))
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUtteranceNull: Self = StObject.set(x, "singleUtterance", null)
    
    @scala.inline
    def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
    
    @scala.inline
    def setSpeechContexts(value: js.Array[ISpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechContextsNull: Self = StObject.set(x, "speechContexts", null)
    
    @scala.inline
    def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    @scala.inline
    def setSpeechContextsVarargs(value: ISpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value :_*))
  }
}
