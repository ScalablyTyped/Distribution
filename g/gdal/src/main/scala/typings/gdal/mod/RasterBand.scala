package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBand extends js.Object {
  val blockSize: XY = js.native
  var categoryNames: js.Array[String] = js.native
  var colorInterpretation: String = js.native
  val dataType: String = js.native
  val description: String = js.native
  val ds: Dataset = js.native
  val hasArbitraryOverviews: Boolean = js.native
  val id: Double = js.native
  val maximum: Double = js.native
  val minimum: Double = js.native
  var noDataValue: Double = js.native
  var offset: Double = js.native
  val overviews: RasterBandOverviews = js.native
  val pixels: RasterBandPixels = js.native
  val readOnly: Boolean = js.native
  var scale: Double = js.native
  val size: XY = js.native
  var unitType: String = js.native
  def computeStatistics(allow_approximation: Boolean): RasterBandStatistics = js.native
  def createMaskBand(flags: Double): Unit = js.native
  def fill(real_value: Double): Unit = js.native
  def fill(real_value: Double, imaginary_value: Double): Unit = js.native
  def flush(): Unit = js.native
  def getMaskBand(): RasterBand = js.native
  def getMaskFlags(): Double = js.native
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: String): js.Object = js.native
  def getStatistics(allow_approximation: Boolean, force: Boolean): RasterBandStatistics = js.native
  def setStatistics(min: Double, max: Double, mean: Double, std_dev: Double): Unit = js.native
}

