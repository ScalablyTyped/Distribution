package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google service account
  */
@js.native
trait Schema$GoogleServiceAccount extends js.Object {
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.native
}

object Schema$GoogleServiceAccount {
  @scala.inline
  def apply(accountEmail: String = null): Schema$GoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleServiceAccount]
  }
}

