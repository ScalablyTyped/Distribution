package typings.feathersjsAuthenticationClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookie extends js.Object {
  var cookie: String
  var entity: String
  var header: String
  var jwtStrategy: String
  var path: String
  var service: String
  var storageKey: String
  var timeout: Double
}

object AnonCookie {
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
  ): AnonCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jwtStrategy = jwtStrategy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCookie]
  }
}

