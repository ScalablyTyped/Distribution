package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A plain JavaScript object to describe a language. */
trait LanguageObject extends StObject {
  
  var id: Double
}
object LanguageObject {
  
  inline def apply(id: Double): LanguageObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageObject] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
