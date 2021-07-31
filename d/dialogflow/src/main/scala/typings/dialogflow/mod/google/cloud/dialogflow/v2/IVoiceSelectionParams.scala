package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a VoiceSelectionParams. */
trait IVoiceSelectionParams extends StObject {
  
  /** VoiceSelectionParams name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** VoiceSelectionParams ssmlGender */
  var ssmlGender: js.UndefOr[
    SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String) | Null
  ] = js.undefined
}
object IVoiceSelectionParams {
  
  @scala.inline
  def apply(): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
  
  @scala.inline
  implicit class IVoiceSelectionParamsMutableBuilder[Self <: IVoiceSelectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSsmlGender(
      value: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String)
    ): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    @scala.inline
    def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
