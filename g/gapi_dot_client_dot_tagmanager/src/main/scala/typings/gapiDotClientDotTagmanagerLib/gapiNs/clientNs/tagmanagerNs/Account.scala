package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Account as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Account display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Account's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the account shares data anonymously with Google and others. This flag enables benchmarking by sharing your data in an anonymous form. Google
    * will remove all identifiable information about your website, combine the data with hundreds of other anonymous sites and report aggregate trends in the
    * benchmarking service.
    */
  var shareData: js.UndefOr[scala.Boolean] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    shareData: js.UndefOr[scala.Boolean] = js.undefined,
    tagManagerUrl: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(shareData)) __obj.updateDynamic("shareData")(shareData)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    __obj.asInstanceOf[Account]
  }
}

