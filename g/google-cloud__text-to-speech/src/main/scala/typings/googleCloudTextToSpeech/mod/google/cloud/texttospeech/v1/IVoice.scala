package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Voice. */
trait IVoice extends StObject {
  
  /** Voice languageCodes */
  var languageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Voice name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Voice naturalSampleRateHertz */
  var naturalSampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /** Voice ssmlGender */
  var ssmlGender: js.UndefOr[
    SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.SsmlVoiceGender * / any */ String) | Null
  ] = js.undefined
}
object IVoice {
  
  @scala.inline
  def apply(): IVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVoice]
  }
  
  @scala.inline
  implicit class IVoiceMutableBuilder[Self <: IVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodesNull: Self = StObject.set(x, "languageCodes", null)
    
    @scala.inline
    def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    @scala.inline
    def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalSampleRateHertzNull: Self = StObject.set(x, "naturalSampleRateHertz", null)
    
    @scala.inline
    def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
    
    @scala.inline
    def setSsmlGender(
      value: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.SsmlVoiceGender * / any */ String)
    ): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    @scala.inline
    def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
