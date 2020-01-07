package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan authentication configuration.
  */
@js.native
trait Schema$Authentication extends js.Object {
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[Schema$CustomAccount] = js.native
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[Schema$GoogleAccount] = js.native
}

object Schema$Authentication {
  @scala.inline
  def apply(customAccount: Schema$CustomAccount = null, googleAccount: Schema$GoogleAccount = null): Schema$Authentication = {
    val __obj = js.Dynamic.literal()
    if (customAccount != null) __obj.updateDynamic("customAccount")(customAccount.asInstanceOf[js.Any])
    if (googleAccount != null) __obj.updateDynamic("googleAccount")(googleAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Authentication]
  }
}

