package typings
package atFeathersjsAuthenticationDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyKey extends js.Object {
  var bodyKey: java.lang.String
  var name: java.lang.String
}

object Anon_BodyKey {
  @scala.inline
  def apply(bodyKey: java.lang.String, name: java.lang.String): Anon_BodyKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodyKey")(bodyKey)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_BodyKey]
  }
}

