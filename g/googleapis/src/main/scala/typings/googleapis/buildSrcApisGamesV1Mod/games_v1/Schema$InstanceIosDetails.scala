package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the iOS details resource.
  */
@js.native
trait Schema$InstanceIosDetails extends js.Object {
  /**
    * Bundle identifier.
    */
  var bundleIdentifier: js.UndefOr[String] = js.native
  /**
    * iTunes App ID.
    */
  var itunesAppId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceIosDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations on iPad
    * devices.
    */
  var preferredForIpad: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that this instance is the default for new installations on
    * iPhone devices.
    */
  var preferredForIphone: js.UndefOr[Boolean] = js.native
  /**
    * Flag to indicate if this instance supports iPad.
    */
  var supportIpad: js.UndefOr[Boolean] = js.native
  /**
    * Flag to indicate if this instance supports iPhone.
    */
  var supportIphone: js.UndefOr[Boolean] = js.native
}

object Schema$InstanceIosDetails {
  @scala.inline
  def apply(
    bundleIdentifier: String = null,
    itunesAppId: String = null,
    kind: String = null,
    preferredForIpad: js.UndefOr[Boolean] = js.undefined,
    preferredForIphone: js.UndefOr[Boolean] = js.undefined,
    supportIpad: js.UndefOr[Boolean] = js.undefined,
    supportIphone: js.UndefOr[Boolean] = js.undefined
  ): Schema$InstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    if (bundleIdentifier != null) __obj.updateDynamic("bundleIdentifier")(bundleIdentifier.asInstanceOf[js.Any])
    if (itunesAppId != null) __obj.updateDynamic("itunesAppId")(itunesAppId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredForIpad)) __obj.updateDynamic("preferredForIpad")(preferredForIpad.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredForIphone)) __obj.updateDynamic("preferredForIphone")(preferredForIphone.asInstanceOf[js.Any])
    if (!js.isUndefined(supportIpad)) __obj.updateDynamic("supportIpad")(supportIpad.asInstanceOf[js.Any])
    if (!js.isUndefined(supportIphone)) __obj.updateDynamic("supportIphone")(supportIphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceIosDetails]
  }
}

