package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetGeolocationOverrideRequest extends js.Object {
  /**
    * Mock accuracy
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * Mock latitude
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Mock longitude
    */
  var longitude: js.UndefOr[Double] = js.native
}

object SetGeolocationOverrideRequest {
  @scala.inline
  def apply(): SetGeolocationOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGeolocationOverrideRequest]
  }
  @scala.inline
  implicit class SetGeolocationOverrideRequestOps[Self <: SetGeolocationOverrideRequest] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
  
}

