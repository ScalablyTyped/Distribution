package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheme extends StObject {
  
  var scheme: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Scheme {
  
  inline def apply(): Scheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheme]
  }
  
  extension [Self <: Scheme](x: Self) {
    
    inline def setScheme(value: String | js.Array[String]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSchemeVarargs(value: String*): Self = StObject.set(x, "scheme", js.Array(value*))
  }
}
