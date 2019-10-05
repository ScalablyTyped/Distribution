package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The fingerprint of the GTM Account as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Account display name. */
  var name: js.UndefOr[String] = js.undefined
  /** GTM Account's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Whether the account shares data anonymously with Google and others. This flag enables benchmarking by sharing your data in an anonymous form. Google
    * will remove all identifiable information about your website, combine the data with hundreds of other anonymous sites and report aggregate trends in the
    * benchmarking service.
    */
  var shareData: js.UndefOr[Boolean] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountId: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    shareData: js.UndefOr[Boolean] = js.undefined,
    tagManagerUrl: String = null
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

