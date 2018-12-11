package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  val ds: Dataset = js.native
  val features: LayerFeatures = js.native
  val fidColumn: java.lang.String = js.native
  val fields: LayerFields = js.native
  val geomColumn: java.lang.String = js.native
  val geomType: scala.Double = js.native
  val name: java.lang.String = js.native
  val srs: SpatialReference = js.native
  def flush(): scala.Unit = js.native
  def getExtent(): Envelope = js.native
  def getExtent(force: scala.Boolean): Envelope = js.native
  def getSpatialFilter(): Geometry = js.native
  def setAttributeFilter(filter: java.lang.String): scala.Unit = js.native
  def setSpatialFilter(filter: Geometry): scala.Unit = js.native
  def setSpatialFilter(minX: scala.Double, maxX: scala.Double, minY: scala.Double, maxY: scala.Double): scala.Unit = js.native
  def testCapability(capability: java.lang.String): scala.Boolean = js.native
}

