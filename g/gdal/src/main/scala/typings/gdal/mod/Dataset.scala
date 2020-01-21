package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  val bands: DatasetBands = js.native
  val description: String = js.native
  val driver: Driver = js.native
  var geoTransform: js.Array[Double] = js.native
  val layers: DatasetLayers = js.native
  val rasterSize: XY = js.native
  var srs: SpatialReference = js.native
  def buildOverviews(resampling: Resampling, overviews: js.Array[Double]): Unit = js.native
  def buildOverviews(resampling: Resampling, overviews: js.Array[Double], bands: js.Array[Double]): Unit = js.native
  def close(): Unit = js.native
  def executeSQL(statement: String): Layer = js.native
  def executeSQL(statement: String, spatial_filter: Geometry): Layer = js.native
  def executeSQL(statement: String, spatial_filter: Geometry, dialect: String): Layer = js.native
  def flush(): Unit = js.native
  def getFileList(): js.Array[String] = js.native
  def getGCPProjection(): String = js.native
  def getGCPs(): js.Array[js.Object] = js.native
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: String): js.Object = js.native
  def setGCPs(gcps: js.Array[js.Object], projection: String): Unit = js.native
  def testCapability(capability: String): Boolean = js.native
}

