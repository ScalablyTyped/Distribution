package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAndroidDetails extends js.Object {
  /** Flag indicating whether the anti-piracy check is enabled. */
  var enablePiracyCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceAndroidDetails. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Android package name which maps to Google Play URL. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
}

object InstanceAndroidDetails {
  @scala.inline
  def apply(
    enablePiracyCheck: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    packageName: java.lang.String = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined
  ): InstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePiracyCheck)) __obj.updateDynamic("enablePiracyCheck")(enablePiracyCheck)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[InstanceAndroidDetails]
  }
}

