package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /** URI which shows where a user can acquire this instance. */
  var acquisitionUri: js.UndefOr[String] = js.undefined
  /** Platform dependent details for Android. */
  var androidInstance: js.UndefOr[InstanceAndroidDetails] = js.undefined
  /** Platform dependent details for iOS. */
  var iosInstance: js.UndefOr[InstanceIosDetails] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instance. */
  var kind: js.UndefOr[String] = js.undefined
  /** Localized display name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The platform type.
    * Possible values are:
    * - "ANDROID" - Instance is for Android.
    * - "IOS" - Instance is for iOS
    * - "WEB_APP" - Instance is for Web App.
    */
  var platformType: js.UndefOr[String] = js.undefined
  /** Flag to show if this game instance supports realtime play. */
  var realtimePlay: js.UndefOr[Boolean] = js.undefined
  /** Flag to show if this game instance supports turn based play. */
  var turnBasedPlay: js.UndefOr[Boolean] = js.undefined
  /** Platform dependent details for Web. */
  var webInstance: js.UndefOr[InstanceWebDetails] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    acquisitionUri: String = null,
    androidInstance: InstanceAndroidDetails = null,
    iosInstance: InstanceIosDetails = null,
    kind: String = null,
    name: String = null,
    platformType: String = null,
    realtimePlay: js.UndefOr[Boolean] = js.undefined,
    turnBasedPlay: js.UndefOr[Boolean] = js.undefined,
    webInstance: InstanceWebDetails = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (acquisitionUri != null) __obj.updateDynamic("acquisitionUri")(acquisitionUri.asInstanceOf[js.Any])
    if (androidInstance != null) __obj.updateDynamic("androidInstance")(androidInstance.asInstanceOf[js.Any])
    if (iosInstance != null) __obj.updateDynamic("iosInstance")(iosInstance.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (!js.isUndefined(realtimePlay)) __obj.updateDynamic("realtimePlay")(realtimePlay.asInstanceOf[js.Any])
    if (!js.isUndefined(turnBasedPlay)) __obj.updateDynamic("turnBasedPlay")(turnBasedPlay.asInstanceOf[js.Any])
    if (webInstance != null) __obj.updateDynamic("webInstance")(webInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

