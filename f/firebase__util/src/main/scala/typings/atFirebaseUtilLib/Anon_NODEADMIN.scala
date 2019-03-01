package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NODEADMIN extends js.Object {
  var NODE_ADMIN: scala.Boolean
  var NODE_CLIENT: scala.Boolean
  var SDK_VERSION: java.lang.String
}

object Anon_NODEADMIN {
  @scala.inline
  def apply(NODE_ADMIN: scala.Boolean, NODE_CLIENT: scala.Boolean, SDK_VERSION: java.lang.String): Anon_NODEADMIN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NODE_ADMIN")(NODE_ADMIN)
    __obj.updateDynamic("NODE_CLIENT")(NODE_CLIENT)
    __obj.updateDynamic("SDK_VERSION")(SDK_VERSION)
    __obj.asInstanceOf[Anon_NODEADMIN]
  }
}

