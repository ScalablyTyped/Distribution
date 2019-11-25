package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The Container ID uniquely identifies the GTM Container. */
  var containerId: js.UndefOr[String] = js.undefined
  /** List of domain names associated with the Container. */
  var domainName: js.UndefOr[js.Array[String]] = js.undefined
  /** The fingerprint of the GTM Container as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Container display name. */
  var name: js.UndefOr[String] = js.undefined
  /** Container Notes. */
  var notes: js.UndefOr[String] = js.undefined
  /** GTM Container's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Container Public ID. */
  var publicId: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** List of Usage Contexts for the Container. Valid values include: web, android, or ios. */
  var usageContext: js.UndefOr[js.Array[String]] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    domainName: js.Array[String] = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    path: String = null,
    publicId: String = null,
    tagManagerUrl: String = null,
    usageContext: js.Array[String] = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (publicId != null) __obj.updateDynamic("publicId")(publicId.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (usageContext != null) __obj.updateDynamic("usageContext")(usageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

