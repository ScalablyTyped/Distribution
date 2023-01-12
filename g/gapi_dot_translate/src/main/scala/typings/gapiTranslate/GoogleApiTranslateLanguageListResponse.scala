package typings.gapiTranslate

import typings.gapiTranslate.anon.Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiTranslateLanguageListResponse extends StObject {
  
  var data: Languages
}
object GoogleApiTranslateLanguageListResponse {
  
  inline def apply(data: Languages): GoogleApiTranslateLanguageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateLanguageListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleApiTranslateLanguageListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Languages): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
