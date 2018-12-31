package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The Container ID uniquely identifies the GTM Container. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** List of domain names associated with the Container. */
  var domainName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The fingerprint of the GTM Container as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Container display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Container Notes. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Container's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Container Public ID. */
  var publicId: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** List of Usage Contexts for the Container. Valid values include: web, android, or ios. */
  var usageContext: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

