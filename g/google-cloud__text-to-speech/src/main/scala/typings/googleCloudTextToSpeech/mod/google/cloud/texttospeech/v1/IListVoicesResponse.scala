package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListVoicesResponse. */
@js.native
trait IListVoicesResponse extends StObject {
  
  /** ListVoicesResponse voices */
  var voices: js.UndefOr[js.Array[IVoice] | Null] = js.native
}
object IListVoicesResponse {
  
  @scala.inline
  def apply(): IListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListVoicesResponse]
  }
  
  @scala.inline
  implicit class IListVoicesResponseMutableBuilder[Self <: IListVoicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoices(value: js.Array[IVoice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicesNull: Self = StObject.set(x, "voices", null)
    
    @scala.inline
    def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
    
    @scala.inline
    def setVoicesVarargs(value: IVoice*): Self = StObject.set(x, "voices", js.Array(value :_*))
  }
}
