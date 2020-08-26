package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductVisibility extends js.Object {
  /** The product ID that should be made visible to the user. This is required. */
  var productId: js.UndefOr[String] = js.native
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
  var tracks: js.UndefOr[js.Array[String]] = js.native
}

object ProductVisibility {
  @scala.inline
  def apply(): ProductVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductVisibility]
  }
  @scala.inline
  implicit class ProductVisibilityOps[Self <: ProductVisibility] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setTracksVarargs(value: String*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[String]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
  
}

