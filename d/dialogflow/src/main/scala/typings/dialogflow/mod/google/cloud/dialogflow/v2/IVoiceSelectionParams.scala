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
  
  inline def apply(): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
  
  extension [Self <: IVoiceSelectionParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmlGender(
      value: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String)
    ): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
