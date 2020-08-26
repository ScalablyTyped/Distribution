package typings.feathersjsAuthenticationClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var cookie: String = js.native
  var entity: String = js.native
  var header: String = js.native
  var jwtStrategy: String = js.native
  var path: String = js.native
  var service: String = js.native
  var storageKey: String = js.native
  var timeout: Double = js.native
}

object Cookie {
  @scala.inline
  def apply(
    cookie: String,
    entity: String,
    header: String,
    jwtStrategy: String,
    path: String,
    service: String,
    storageKey: String,
    timeout: Double
  ): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jwtStrategy = jwtStrategy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
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
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setJwtStrategy(value: String): Self = this.set("jwtStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

