package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListVoicesRequest. */
trait IListVoicesRequest extends StObject {
  
  /** ListVoicesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object IListVoicesRequest {
  
  inline def apply(): IListVoicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListVoicesRequest]
  }
  
  extension [Self <: IListVoicesRequest](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
