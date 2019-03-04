package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var grant_type: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    grant_type: java.lang.String,
    scope: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, grant_type = grant_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Credentials]
  }
}

