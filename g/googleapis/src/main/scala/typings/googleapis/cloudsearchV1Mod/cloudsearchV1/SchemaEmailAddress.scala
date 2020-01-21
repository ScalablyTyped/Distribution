package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s email address.
  */
@js.native
trait SchemaEmailAddress extends js.Object {
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
}

object SchemaEmailAddress {
  @scala.inline
  def apply(emailAddress: String = null): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmailAddress]
  }
}

