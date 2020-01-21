package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEGlobe")
@js.native
class GEGlobe () extends KmlObject {
  /**
    * The top-level features currently in the Earth instance.
    */
  def getFeatures(): GEFeatureContainer = js.native
  /**
    * Returns the altitude for a given location on the globe.
    * If the altitude data for the location has not yet been loaded, the return value is 0.
    */
  def getGroundAltitude(lat: Double, lon: Double): Double = js.native
}

