package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
  val ds: Dataset = js.native
  
  val features: LayerFeatures = js.native
  
  val fidColumn: String = js.native
  
  val fields: LayerFields = js.native
  
  def flush(): Unit = js.native
  
  val geomColumn: String = js.native
  
  val geomType: Double = js.native
  
  def getExtent(): Envelope = js.native
  def getExtent(force: Boolean): Envelope = js.native
  
  def getSpatialFilter(): Geometry = js.native
  
  val name: String = js.native
  
  def setAttributeFilter(filter: String): Unit = js.native
  
  def setSpatialFilter(filter: Geometry): Unit = js.native
  def setSpatialFilter(minX: Double, maxX: Double, minY: Double, maxY: Double): Unit = js.native
  
  val srs: SpatialReference = js.native
  
  def testCapability(capability: String): Boolean = js.native
}
