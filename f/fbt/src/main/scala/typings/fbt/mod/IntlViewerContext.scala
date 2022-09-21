package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntlViewerContext extends StObject {
  
  var GENDER: IntlVariationsGender
  
  var locale: String
}
object IntlViewerContext {
  
  inline def apply(GENDER: IntlVariationsGender, locale: String): IntlViewerContext = {
    val __obj = js.Dynamic.literal(GENDER = GENDER.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlViewerContext]
  }
  
  extension [Self <: IntlViewerContext](x: Self) {
    
    inline def setGENDER(value: IntlVariationsGender): Self = StObject.set(x, "GENDER", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
