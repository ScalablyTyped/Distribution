package typings
package atFeathersjsAuthenticationDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  var cookie: java.lang.String
  var entity: java.lang.String
  var header: java.lang.String
  var jwtStrategy: java.lang.String
  var path: java.lang.String
  var service: java.lang.String
  var storageKey: java.lang.String
  var timeout: scala.Double
}

object Anon_Cookie {
  @scala.inline
  def apply(
    cookie: java.lang.String,
    entity: java.lang.String,
    header: java.lang.String,
    jwtStrategy: java.lang.String,
    path: java.lang.String,
    service: java.lang.String,
    storageKey: java.lang.String,
    timeout: scala.Double
  ): Anon_Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie, entity = entity, header = header, jwtStrategy = jwtStrategy, path = path, service = service, storageKey = storageKey, timeout = timeout)
  
    __obj.asInstanceOf[Anon_Cookie]
  }
}

