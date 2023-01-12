package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  
  inline def apply(): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputAudioConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInputAudioConfig] (val x: Self) extends AnyVal {
    
    inline def setAudioEncoding(
      value: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.AudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    inline def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    inline def setEnableWordInfo(value: Boolean): Self = StObject.set(x, "enableWordInfo", value.asInstanceOf[js.Any])
    
    inline def setEnableWordInfoNull: Self = StObject.set(x, "enableWordInfo", null)
    
    inline def setEnableWordInfoUndefined: Self = StObject.set(x, "enableWordInfo", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setModelVariant(
      value: SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SpeechModelVariant * / any */ String)
    ): Self = StObject.set(x, "modelVariant", value.asInstanceOf[js.Any])
    
    inline def setModelVariantNull: Self = StObject.set(x, "modelVariant", null)
    
    inline def setModelVariantUndefined: Self = StObject.set(x, "modelVariant", js.undefined)
    
    inline def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    inline def setPhraseHintsNull: Self = StObject.set(x, "phraseHints", null)
    
    inline def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    inline def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value*))
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    inline def setSingleUtteranceNull: Self = StObject.set(x, "singleUtterance", null)
    
    inline def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
    
    inline def setSpeechContexts(value: js.Array[ISpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    inline def setSpeechContextsNull: Self = StObject.set(x, "speechContexts", null)
    
    inline def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    inline def setSpeechContextsVarargs(value: ISpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value*))
  }
}
