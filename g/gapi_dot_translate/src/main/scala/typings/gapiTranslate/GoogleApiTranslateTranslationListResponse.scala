package typings.gapiTranslate

import typings.gapiTranslate.anon.Translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiTranslateTranslationListResponse extends StObject {
  
  var data: Translations
}
object GoogleApiTranslateTranslationListResponse {
  
  inline def apply(data: Translations): GoogleApiTranslateTranslationListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateTranslationListResponse]
  }
  
  extension [Self <: GoogleApiTranslateTranslationListResponse](x: Self) {
    
    inline def setData(value: Translations): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
