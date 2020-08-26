package typings.googleMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofgeometry extends js.Object {
  val encoding: js.Any = js.native
  val poly: js.Any = js.native
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  val spherical: js.Any = js.native
}

object Typeofgeometry {
  @scala.inline
  def apply(encoding: js.Any, poly: js.Any, spherical: js.Any): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
  @scala.inline
  implicit class TypeofgeometryOps[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
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
    def setEncoding(value: js.Any): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoly(value: js.Any): Self = this.set("poly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpherical(value: js.Any): Self = this.set("spherical", value.asInstanceOf[js.Any])
  }
  
}

