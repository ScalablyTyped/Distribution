package typings.atFeathersjsAuthenticationDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  var cookie: String
  var entity: String
  var header: String
  var jwtStrategy: String
  var path: String
  var service: String
  var storageKey: String
  var timeout: Double
}

object Anon_Cookie {
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
  ): Anon_Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie, entity = entity, header = header, jwtStrategy = jwtStrategy, path = path, service = service, storageKey = storageKey, timeout = timeout)
  
    __obj.asInstanceOf[Anon_Cookie]
  }
}

