package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryInput. */
@js.native
trait IQueryInput extends StObject {
  
  /** QueryInput audioConfig */
  var audioConfig: js.UndefOr[IInputAudioConfig | Null] = js.native
  
  /** QueryInput event */
  var event: js.UndefOr[IEventInput | Null] = js.native
  
  /** QueryInput text */
  var text: js.UndefOr[ITextInput | Null] = js.native
}
object IQueryInput {
  
  @scala.inline
  def apply(): IQueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryInput]
  }
  
  @scala.inline
  implicit class IQueryInputMutableBuilder[Self <: IQueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioConfig(value: IInputAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    @scala.inline
    def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    @scala.inline
    def setEvent(value: IEventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNull: Self = StObject.set(x, "event", null)
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setText(value: ITextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
