package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkDiagnostics extends js.Object {
  /** The Android network subtype. */
  var androidNetworkSubtype: js.UndefOr[Double] = js.undefined
  /** The Android network type. */
  var androidNetworkType: js.UndefOr[Double] = js.undefined
  /** iOS network type as defined in Reachability.h. */
  var iosNetworkType: js.UndefOr[Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#networkDiagnostics. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The MCC+MNC code for the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html
    */
  var networkOperatorCode: js.UndefOr[String] = js.undefined
  /**
    * The name of the carrier of the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
    */
  var networkOperatorName: js.UndefOr[String] = js.undefined
  /** The amount of time in milliseconds it took for the client to establish a connection with the XMPP server. */
  var registrationLatencyMillis: js.UndefOr[Double] = js.undefined
}

object NetworkDiagnostics {
  @scala.inline
  def apply(
    androidNetworkSubtype: Int | Double = null,
    androidNetworkType: Int | Double = null,
    iosNetworkType: Int | Double = null,
    kind: String = null,
    networkOperatorCode: String = null,
    networkOperatorName: String = null,
    registrationLatencyMillis: Int | Double = null
  ): NetworkDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (androidNetworkSubtype != null) __obj.updateDynamic("androidNetworkSubtype")(androidNetworkSubtype.asInstanceOf[js.Any])
    if (androidNetworkType != null) __obj.updateDynamic("androidNetworkType")(androidNetworkType.asInstanceOf[js.Any])
    if (iosNetworkType != null) __obj.updateDynamic("iosNetworkType")(iosNetworkType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkOperatorCode != null) __obj.updateDynamic("networkOperatorCode")(networkOperatorCode.asInstanceOf[js.Any])
    if (networkOperatorName != null) __obj.updateDynamic("networkOperatorName")(networkOperatorName.asInstanceOf[js.Any])
    if (registrationLatencyMillis != null) __obj.updateDynamic("registrationLatencyMillis")(registrationLatencyMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkDiagnostics]
  }
}

