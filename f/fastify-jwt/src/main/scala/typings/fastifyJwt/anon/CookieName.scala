package typings.fastifyJwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieName extends js.Object {
  
  var cookieName: String = js.native
}
object CookieName {
  
  @scala.inline
  def apply(cookieName: String): CookieName = {
    val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieName]
  }
  
  @scala.inline
  implicit class CookieNameOps[Self <: CookieName] (val x: Self) extends AnyVal {
    
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
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
  }
}
