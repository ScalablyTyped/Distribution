package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends StObject {
  
  val bands: DatasetBands = js.native
  
  def buildOverviews(resampling: Resampling, overviews: js.Array[Double]): Unit = js.native
  def buildOverviews(resampling: Resampling, overviews: js.Array[Double], bands: js.Array[Double]): Unit = js.native
  
  def close(): Unit = js.native
  
  val description: String = js.native
  
  val driver: Driver = js.native
  
  def executeSQL(statement: String): Layer = js.native
  def executeSQL(statement: String, spatial_filter: js.UndefOr[scala.Nothing], dialect: String): Layer = js.native
  def executeSQL(statement: String, spatial_filter: Geometry): Layer = js.native
  def executeSQL(statement: String, spatial_filter: Geometry, dialect: String): Layer = js.native
  
  def flush(): Unit = js.native
  
  var geoTransform: js.Array[Double] = js.native
  
  def getFileList(): js.Array[String] = js.native
  
  def getGCPProjection(): String = js.native
  
  def getGCPs(): js.Array[js.Object] = js.native
  
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: String): js.Object = js.native
  
  val layers: DatasetLayers = js.native
  
  val rasterSize: XY = js.native
  
  def setGCPs(gcps: js.Array[js.Object], projection: String): Unit = js.native
  
  var srs: SpatialReference = js.native
  
  def testCapability(capability: String): Boolean = js.native
}
