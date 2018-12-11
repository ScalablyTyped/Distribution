package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Feature")
@js.native
class Feature protected () extends js.Object {
  def this(definition: FeatureDefn) = this()
  def this(definition: Layer) = this()
  val defn: FeatureDefn = js.native
  var fid: scala.Double = js.native
  val fields: FeatureFields = js.native
  def destroy(): scala.Unit = js.native
  def equals(feature: Feature): scala.Boolean = js.native
  def getFieldDefn(index: scala.Double): FieldDefn = js.native
  def getGeometry(): Geometry = js.native
  def setFrom(feature: Feature): scala.Unit = js.native
  def setFrom(feature: Feature, index_map: js.Array[scala.Double]): scala.Unit = js.native
  def setFrom(feature: Feature, index_map: js.Array[scala.Double], forgiving: scala.Boolean): scala.Unit = js.native
  def setGeometry(geometry: Geometry): scala.Unit = js.native
}

