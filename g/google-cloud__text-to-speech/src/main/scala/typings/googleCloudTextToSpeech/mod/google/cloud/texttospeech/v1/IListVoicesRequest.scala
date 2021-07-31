package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListVoicesRequest. */
trait IListVoicesRequest extends StObject {
  
  /** ListVoicesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object IListVoicesRequest {
  
  @scala.inline
  def apply(): IListVoicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListVoicesRequest]
  }
  
  @scala.inline
  implicit class IListVoicesRequestMutableBuilder[Self <: IListVoicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
