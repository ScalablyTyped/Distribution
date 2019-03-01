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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("jwtStrategy")(jwtStrategy)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("storageKey")(storageKey)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_Cookie]
  }
}

