package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var client_id: String
  var client_secret: String
  var grant_type: String
  var scope: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(client_id: String, client_secret: String, grant_type: String, scope: String = null): Credentials = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, grant_type = grant_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Credentials]
  }
}

