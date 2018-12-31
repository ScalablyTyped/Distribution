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

