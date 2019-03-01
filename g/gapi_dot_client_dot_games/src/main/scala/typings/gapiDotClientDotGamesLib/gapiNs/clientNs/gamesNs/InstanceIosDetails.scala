package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceIosDetails extends js.Object {
  /** Bundle identifier. */
  var bundleIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** iTunes App ID. */
  var itunesAppId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceIosDetails. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this instance is the default for new installations on iPad devices. */
  var preferredForIpad: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates that this instance is the default for new installations on iPhone devices. */
  var preferredForIphone: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag to indicate if this instance supports iPad. */
  var supportIpad: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag to indicate if this instance supports iPhone. */
  var supportIphone: js.UndefOr[scala.Boolean] = js.undefined
}

object InstanceIosDetails {
  @scala.inline
  def apply(
    bundleIdentifier: java.lang.String = null,
    itunesAppId: java.lang.String = null,
    kind: java.lang.String = null,
    preferredForIpad: js.UndefOr[scala.Boolean] = js.undefined,
    preferredForIphone: js.UndefOr[scala.Boolean] = js.undefined,
    supportIpad: js.UndefOr[scala.Boolean] = js.undefined,
    supportIphone: js.UndefOr[scala.Boolean] = js.undefined
  ): InstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    if (bundleIdentifier != null) __obj.updateDynamic("bundleIdentifier")(bundleIdentifier)
    if (itunesAppId != null) __obj.updateDynamic("itunesAppId")(itunesAppId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(preferredForIpad)) __obj.updateDynamic("preferredForIpad")(preferredForIpad)
    if (!js.isUndefined(preferredForIphone)) __obj.updateDynamic("preferredForIphone")(preferredForIphone)
    if (!js.isUndefined(supportIpad)) __obj.updateDynamic("supportIpad")(supportIpad)
    if (!js.isUndefined(supportIphone)) __obj.updateDynamic("supportIphone")(supportIphone)
    __obj.asInstanceOf[InstanceIosDetails]
  }
}

