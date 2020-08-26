package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose extends js.Object {
  /**
    * Altitude of the pose in meters above ground level (as defined by WGS84).
    * NaN indicates an unmeasured quantity.
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be >=0 and <360.
    * NaN indicates an unmeasured quantity.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the
    * latitude and longitude pair are not provided here, the geolocation from the
    * exif header will be used. If the latitude and longitude pair is not
    * provided and cannot be found in the exif header, the create photo process
    * will fail.
    */
  var latLngPair: js.UndefOr[LatLng] = js.native
  /** Level (the floor in a building) used to configure vertical navigation. */
  var level: js.UndefOr[Level] = js.native
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be >=-90
    * and <= 90. A value of -90 means looking directly down, and a value of 90
    * means looking directly up.
    * NaN indicates an unmeasured quantity.
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0
    * means level with the horizon.
    * NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[Double] = js.native
}

object Pose {
  @scala.inline
  def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  @scala.inline
  implicit class PoseOps[Self <: Pose] (val x: Self) extends AnyVal {
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
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setLatLngPair(value: LatLng): Self = this.set("latLngPair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLngPair: Self = this.set("latLngPair", js.undefined)
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setRoll(value: Double): Self = this.set("roll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoll: Self = this.set("roll", js.undefined)
  }
  
}

