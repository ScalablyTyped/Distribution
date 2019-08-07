package typings.googleDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeometry extends js.Object {
  val encodingNs: Typeofencoding
  val polyNs: Typeofpoly
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  val sphericalNs: Typeofspherical
}

object Typeofgeometry {
  @scala.inline
  def apply(encodingNs: Typeofencoding, polyNs: Typeofpoly, sphericalNs: Typeofspherical): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encodingNs = encodingNs, polyNs = polyNs, sphericalNs = sphericalNs)
  
    __obj.asInstanceOf[Typeofgeometry]
  }
}

