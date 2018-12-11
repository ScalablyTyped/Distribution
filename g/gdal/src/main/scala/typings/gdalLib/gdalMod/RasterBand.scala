package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBand extends js.Object {
  val blockSize: XY = js.native
  var categoryNames: js.Array[java.lang.String] = js.native
  var colorInterpretation: java.lang.String = js.native
  val dataType: java.lang.String = js.native
  val description: java.lang.String = js.native
  val ds: Dataset = js.native
  val hasArbitraryOverviews: scala.Boolean = js.native
  val id: scala.Double = js.native
  val maximum: scala.Double = js.native
  val minimum: scala.Double = js.native
  var noDataValue: scala.Double = js.native
  var offset: scala.Double = js.native
  val overviews: RasterBandOverviews = js.native
  val pixels: RasterBandPixels = js.native
  val readOnly: scala.Boolean = js.native
  var scale: scala.Double = js.native
  val size: XY = js.native
  var unitType: java.lang.String = js.native
  def computeStatistics(allow_approximation: scala.Boolean): RasterBandStatistics = js.native
  def createMaskBand(flags: scala.Double): scala.Unit = js.native
  def fill(real_value: scala.Double): scala.Unit = js.native
  def fill(real_value: scala.Double, imaginary_value: scala.Double): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def getMaskBand(): RasterBand = js.native
  def getMaskFlags(): scala.Double = js.native
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: java.lang.String): js.Object = js.native
  def getStatistics(allow_approximation: scala.Boolean, force: scala.Boolean): RasterBandStatistics = js.native
  def setStatistics(min: scala.Double, max: scala.Double, mean: scala.Double, std_dev: scala.Double): scala.Unit = js.native
}

