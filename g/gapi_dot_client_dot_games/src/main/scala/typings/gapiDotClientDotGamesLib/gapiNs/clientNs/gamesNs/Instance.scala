package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /** URI which shows where a user can acquire this instance. */
  var acquisitionUri: js.UndefOr[java.lang.String] = js.undefined
  /** Platform dependent details for Android. */
  var androidInstance: js.UndefOr[InstanceAndroidDetails] = js.undefined
  /** Platform dependent details for iOS. */
  var iosInstance: js.UndefOr[InstanceIosDetails] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instance. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localized display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The platform type.
    * Possible values are:
    * - "ANDROID" - Instance is for Android.
    * - "IOS" - Instance is for iOS
    * - "WEB_APP" - Instance is for Web App.
    */
  var platformType: js.UndefOr[java.lang.String] = js.undefined
  /** Flag to show if this game instance supports realtime play. */
  var realtimePlay: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag to show if this game instance supports turn based play. */
  var turnBasedPlay: js.UndefOr[scala.Boolean] = js.undefined
  /** Platform dependent details for Web. */
  var webInstance: js.UndefOr[InstanceWebDetails] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    acquisitionUri: java.lang.String = null,
    androidInstance: InstanceAndroidDetails = null,
    iosInstance: InstanceIosDetails = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    platformType: java.lang.String = null,
    realtimePlay: js.UndefOr[scala.Boolean] = js.undefined,
    turnBasedPlay: js.UndefOr[scala.Boolean] = js.undefined,
    webInstance: InstanceWebDetails = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (acquisitionUri != null) __obj.updateDynamic("acquisitionUri")(acquisitionUri)
    if (androidInstance != null) __obj.updateDynamic("androidInstance")(androidInstance)
    if (iosInstance != null) __obj.updateDynamic("iosInstance")(iosInstance)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (!js.isUndefined(realtimePlay)) __obj.updateDynamic("realtimePlay")(realtimePlay)
    if (!js.isUndefined(turnBasedPlay)) __obj.updateDynamic("turnBasedPlay")(turnBasedPlay)
    if (webInstance != null) __obj.updateDynamic("webInstance")(webInstance)
    __obj.asInstanceOf[Instance]
  }
}

