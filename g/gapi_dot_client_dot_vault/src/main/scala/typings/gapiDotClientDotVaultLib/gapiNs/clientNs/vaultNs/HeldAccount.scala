package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldAccount extends js.Object {
  /**
    * The account's ID as provided by the
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>.
    */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** When the account was put on hold. */
  var holdTime: js.UndefOr[java.lang.String] = js.undefined
}

object HeldAccount {
  @scala.inline
  def apply(accountId: java.lang.String = null, holdTime: java.lang.String = null): HeldAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (holdTime != null) __obj.updateDynamic("holdTime")(holdTime)
    __obj.asInstanceOf[HeldAccount]
  }
}

