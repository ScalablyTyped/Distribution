package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an enterprise admin who can manage the enterprise in the
  * managed Google Play store.
  */
@js.native
trait SchemaAdministrator extends js.Object {
  /**
    * The admin&#39;s email address.
    */
  var email: js.UndefOr[String] = js.native
}

object SchemaAdministrator {
  @scala.inline
  def apply(email: String = null): SchemaAdministrator = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministrator]
  }
}

