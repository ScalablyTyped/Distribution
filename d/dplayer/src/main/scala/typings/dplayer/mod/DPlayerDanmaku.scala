package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerDanmaku extends js.Object {
  
  var addition: js.UndefOr[js.Array[String]] = js.native
  
  var api: String = js.native
  
  var bottom: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var maximum: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var unlimited: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object DPlayerDanmaku {
  
  @scala.inline
  def apply(api: String, id: String): DPlayerDanmaku = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmaku]
  }
  
  @scala.inline
  implicit class DPlayerDanmakuOps[Self <: DPlayerDanmaku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionVarargs(value: String*): Self = this.set("addition", js.Array(value :_*))
    
    @scala.inline
    def setAddition(value: js.Array[String]): Self = this.set("addition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddition: Self = this.set("addition", js.undefined)
    
    @scala.inline
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setMaximum(value: String): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUnlimited(value: Boolean): Self = this.set("unlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlimited: Self = this.set("unlimited", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
