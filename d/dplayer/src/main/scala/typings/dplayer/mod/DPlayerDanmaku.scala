package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerDanmaku extends StObject {
  
  var addition: js.UndefOr[js.Array[String]] = js.undefined
  
  var api: String
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var maximum: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var unlimited: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object DPlayerDanmaku {
  
  inline def apply(api: String, id: String): DPlayerDanmaku = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmaku]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DPlayerDanmaku] (val x: Self) extends AnyVal {
    
    inline def setAddition(value: js.Array[String]): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
    
    inline def setAdditionUndefined: Self = StObject.set(x, "addition", js.undefined)
    
    inline def setAdditionVarargs(value: String*): Self = StObject.set(x, "addition", js.Array(value*))
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUnlimited(value: Boolean): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
