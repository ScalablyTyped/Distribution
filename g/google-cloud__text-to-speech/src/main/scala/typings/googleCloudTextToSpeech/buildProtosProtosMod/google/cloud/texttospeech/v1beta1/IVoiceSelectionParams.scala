package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a VoiceSelectionParams. */
trait IVoiceSelectionParams extends StObject {
  
  /** VoiceSelectionParams customVoice */
  var customVoice: js.UndefOr[ICustomVoiceParams | Null] = js.undefined
  
  /** VoiceSelectionParams languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** VoiceSelectionParams name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** VoiceSelectionParams ssmlGender */
  var ssmlGender: js.UndefOr[
    SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.SsmlVoiceGender * / any */ String) | Null
  ] = js.undefined
}
object IVoiceSelectionParams {
  
  inline def apply(): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVoiceSelectionParams] (val x: Self) extends AnyVal {
    
    inline def setCustomVoice(value: ICustomVoiceParams): Self = StObject.set(x, "customVoice", value.asInstanceOf[js.Any])
    
    inline def setCustomVoiceNull: Self = StObject.set(x, "customVoice", null)
    
    inline def setCustomVoiceUndefined: Self = StObject.set(x, "customVoice", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmlGender(
      value: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.SsmlVoiceGender * / any */ String)
    ): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
