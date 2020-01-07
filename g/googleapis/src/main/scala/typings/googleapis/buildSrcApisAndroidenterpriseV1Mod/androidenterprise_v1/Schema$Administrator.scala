package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an enterprise admin who can manage the enterprise in the
  * managed Google Play store.
  */
@js.native
trait Schema$Administrator extends js.Object {
  /**
    * The admin&#39;s email address.
    */
  var email: js.UndefOr[String] = js.native
}

object Schema$Administrator {
  @scala.inline
  def apply(email: String = null): Schema$Administrator = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Administrator]
  }
}

