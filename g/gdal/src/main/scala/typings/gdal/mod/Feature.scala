package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Feature")
@js.native
class Feature protected () extends js.Object {
  def this(definition: FeatureDefn) = this()
  def this(definition: Layer) = this()
  val defn: FeatureDefn = js.native
  var fid: Double = js.native
  val fields: FeatureFields = js.native
  def destroy(): Unit = js.native
  def equals(feature: Feature): Boolean = js.native
  def getFieldDefn(index: Double): FieldDefn = js.native
  def getGeometry(): Geometry = js.native
  def setFrom(feature: Feature): Unit = js.native
  def setFrom(feature: Feature, index_map: js.Array[Double]): Unit = js.native
  def setFrom(feature: Feature, index_map: js.Array[Double], forgiving: Boolean): Unit = js.native
  def setGeometry(geometry: Geometry): Unit = js.native
}

