package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: String
  
  var csrf: Boolean
  
  var limit: Double
  
  var whiteList: String | js.RegExp | (js.Array[String | js.RegExp])
}
object Callback {
  
  inline def apply(
    callback: String,
    csrf: Boolean,
    limit: Double,
    whiteList: String | js.RegExp | (js.Array[String | js.RegExp])
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCsrf(value: Boolean): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setWhiteList(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
    
    inline def setWhiteListVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "whiteList", js.Array(value*))
  }
}
