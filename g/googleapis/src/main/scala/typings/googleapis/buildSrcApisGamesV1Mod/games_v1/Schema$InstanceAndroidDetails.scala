package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Android instance details resource.
  */
@js.native
trait Schema$InstanceAndroidDetails extends js.Object {
  /**
    * Flag indicating whether the anti-piracy check is enabled.
    */
  var enablePiracyCheck: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceAndroidDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Android package name which maps to Google Play URL.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object Schema$InstanceAndroidDetails {
  @scala.inline
  def apply(
    enablePiracyCheck: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    packageName: String = null,
    preferred: js.UndefOr[Boolean] = js.undefined
  ): Schema$InstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePiracyCheck)) __obj.updateDynamic("enablePiracyCheck")(enablePiracyCheck.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceAndroidDetails]
  }
}

