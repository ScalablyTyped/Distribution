package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductVisibility extends js.Object {
  /** The product ID that should be made visible to the user. This is required. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This allows to only grant visibility to the specified tracks of the app. For example, if an app has a prod version, a beta version and an alpha version
    * and the enterprise has been granted visibility to both the alpha and beta tracks, if tracks is {"beta", "production"} the user will be able to install
    * the app and they will get the beta version of the app. If there are no app versions in the specified track or if the enterprise wasn't granted
    * visibility for the track, adding the "alpha" and "beta" values to the list of tracks will have no effect for now; however they will take effect once
    * both conditions are met. Note that the enterprise itself needs to be granted access to the alpha and/or beta tracks, regardless of whether individual
    * users or admins have access to those tracks.
    *
    * The allowed sets are: {} (considered equivalent to {"production"}) {"production"} {"beta", "production"} {"alpha", "beta", "production"} The order of
    * elements is not relevant. Any other set of tracks will be rejected with an error.
    */
  var tracks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ProductVisibility {
  @scala.inline
  def apply(productId: java.lang.String = null, tracks: js.Array[java.lang.String] = null): ProductVisibility = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    __obj.asInstanceOf[ProductVisibility]
  }
}

