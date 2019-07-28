package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlMultiGeometry")
@js.native
class KmlMultiGeometry () extends KmlGeometry {
  /**
    * The collection of geometries that are children of this multi-geometry.
    */
  def getGeometries(): GEGeometryContainer = js.native
}

