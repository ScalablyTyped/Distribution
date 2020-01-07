package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s email address.
  */
@js.native
trait Schema$EmailAddress extends js.Object {
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
}

object Schema$EmailAddress {
  @scala.inline
  def apply(emailAddress: String = null): Schema$EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EmailAddress]
  }
}

