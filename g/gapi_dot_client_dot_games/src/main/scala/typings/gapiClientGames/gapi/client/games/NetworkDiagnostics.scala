package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkDiagnostics extends js.Object {
  /** The Android network subtype. */
  var androidNetworkSubtype: js.UndefOr[Double] = js.native
  /** The Android network type. */
  var androidNetworkType: js.UndefOr[Double] = js.native
  /** iOS network type as defined in Reachability.h. */
  var iosNetworkType: js.UndefOr[Double] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#networkDiagnostics. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The MCC+MNC code for the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html
    */
  var networkOperatorCode: js.UndefOr[String] = js.native
  /**
    * The name of the carrier of the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  /** The amount of time in milliseconds it took for the client to establish a connection with the XMPP server. */
  var registrationLatencyMillis: js.UndefOr[Double] = js.native
}

object NetworkDiagnostics {
  @scala.inline
  def apply(): NetworkDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkDiagnostics]
  }
  @scala.inline
  implicit class NetworkDiagnosticsOps[Self <: NetworkDiagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidNetworkSubtype(value: Double): Self = this.set("androidNetworkSubtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidNetworkSubtype: Self = this.set("androidNetworkSubtype", js.undefined)
    @scala.inline
    def setAndroidNetworkType(value: Double): Self = this.set("androidNetworkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidNetworkType: Self = this.set("androidNetworkType", js.undefined)
    @scala.inline
    def setIosNetworkType(value: Double): Self = this.set("iosNetworkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosNetworkType: Self = this.set("iosNetworkType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNetworkOperatorCode(value: String): Self = this.set("networkOperatorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkOperatorCode: Self = this.set("networkOperatorCode", js.undefined)
    @scala.inline
    def setNetworkOperatorName(value: String): Self = this.set("networkOperatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkOperatorName: Self = this.set("networkOperatorName", js.undefined)
    @scala.inline
    def setRegistrationLatencyMillis(value: Double): Self = this.set("registrationLatencyMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationLatencyMillis: Self = this.set("registrationLatencyMillis", js.undefined)
  }
  
}

