package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryInput. */
trait IQueryInput extends StObject {
  
  /** QueryInput audioConfig */
  var audioConfig: js.UndefOr[IInputAudioConfig | Null] = js.undefined
  
  /** QueryInput event */
  var event: js.UndefOr[IEventInput | Null] = js.undefined
  
  /** QueryInput text */
  var text: js.UndefOr[ITextInput | Null] = js.undefined
}
object IQueryInput {
  
  inline def apply(): IQueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQueryInput] (val x: Self) extends AnyVal {
    
    inline def setAudioConfig(value: IInputAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setEvent(value: IEventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setText(value: ITextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
