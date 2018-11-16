package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlPolygon")
@js.native
class KmlPolygon () extends KmlExtrudableGeometry {
  /**
       * Contains a LinearRing element.
       * You can specify multiple innerBoundary properties, which create multiple cut-outs inside the Polygon.
       */
  def getInnerBoundaries(): GELinearRingContainer = js.native
  /**
       * Contains a LinearRing element.
       */
  def getOuterBoundary(): KmlLinearRing = js.native
  /**
       * Contains a LinearRing element.
       */
  def setOuterBoundary(outerBoundary: KmlLinearRing): scala.Unit = js.native
}

