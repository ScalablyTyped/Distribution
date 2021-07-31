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
  
  @scala.inline
  def apply(api: String, id: String): DPlayerDanmaku = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmaku]
  }
  
  @scala.inline
  implicit class DPlayerDanmakuMutableBuilder[Self <: DPlayerDanmaku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddition(value: js.Array[String]): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionUndefined: Self = StObject.set(x, "addition", js.undefined)
    
    @scala.inline
    def setAdditionVarargs(value: String*): Self = StObject.set(x, "addition", js.Array(value :_*))
    
    @scala.inline
    def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setUnlimited(value: Boolean): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
