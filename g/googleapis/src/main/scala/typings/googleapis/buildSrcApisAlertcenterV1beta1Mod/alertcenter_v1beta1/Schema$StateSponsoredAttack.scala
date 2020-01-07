package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A state-sponsored attack alert. Derived from audit logs.
  */
@js.native
trait Schema$StateSponsoredAttack extends js.Object {
  /**
    * The email of the user this incident was created for.
    */
  var email: js.UndefOr[String] = js.native
}

object Schema$StateSponsoredAttack {
  @scala.inline
  def apply(email: String = null): Schema$StateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StateSponsoredAttack]
  }
}

