package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  val bands: DatasetBands = js.native
  val description: java.lang.String = js.native
  val driver: Driver = js.native
  var geoTransform: js.Array[scala.Double] = js.native
  val layers: DatasetLayers = js.native
  val rasterSize: XY = js.native
  var srs: SpatialReference = js.native
  def buildOverviews(resampling: Resampling, overviews: js.Array[scala.Double]): scala.Unit = js.native
  def buildOverviews(resampling: Resampling, overviews: js.Array[scala.Double], bands: js.Array[scala.Double]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def executeSQL(statement: java.lang.String): Layer = js.native
  def executeSQL(statement: java.lang.String, spatial_filter: Geometry): Layer = js.native
  def executeSQL(statement: java.lang.String, spatial_filter: Geometry, dialect: java.lang.String): Layer = js.native
  def flush(): scala.Unit = js.native
  def getFileList(): js.Array[java.lang.String] = js.native
  def getGCPProjection(): java.lang.String = js.native
  def getGCPs(): js.Array[js.Object] = js.native
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: java.lang.String): js.Object = js.native
  def setGCPs(gcps: js.Array[js.Object], projection: java.lang.String): scala.Unit = js.native
  def testCapability(capability: java.lang.String): scala.Boolean = js.native
}

