package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "SpatialReference")
@js.native
class SpatialReference () extends js.Object {
  def this(wkt: java.lang.String) = this()
  def EPSGTreatsAsLatLong(): scala.Boolean = js.native
  def EPSGTreatsAsNorthingEasting(): scala.Boolean = js.native
  def autoIdentifyEPSG(): scala.Unit = js.native
  def cloneGeogCS(): SpatialReference = js.native
  def getAngularUnits(): gdalLib.Anon_Value = js.native
  def getAttrValue(node_name: java.lang.String): java.lang.String = js.native
  def getAttrValue(node_name: java.lang.String, attr_index: scala.Double): java.lang.String = js.native
  def getAuthorityCode(target_key: java.lang.String): java.lang.String = js.native
  def getAuthorityName(target_key: java.lang.String): java.lang.String = js.native
  def getLinearUnits(): gdalLib.Anon_Value = js.native
  def isCompound(): scala.Boolean = js.native
  def isGeocentric(): scala.Boolean = js.native
  def isGeographic(): scala.Boolean = js.native
  def isLocal(): scala.Boolean = js.native
  def isProjected(): scala.Boolean = js.native
  def isSame(srs: SpatialReference): scala.Boolean = js.native
  def isSameGeogCS(srs: SpatialReference): scala.Boolean = js.native
  def isSameVertCS(srs: SpatialReference): scala.Boolean = js.native
  def isVertical(): scala.Boolean = js.native
  def morphFromESRI(): scala.Unit = js.native
  def morphToESRI(): scala.Unit = js.native
  def setWellKnownGeogCS(name: java.lang.String): scala.Unit = js.native
  def toPrettyWKT(): java.lang.String = js.native
  def toPrettyWKT(simplify: scala.Boolean): java.lang.String = js.native
  def toProj4(): java.lang.String = js.native
  def toWKT(): java.lang.String = js.native
  def toXML(): java.lang.String = js.native
  def validate(): java.lang.String = js.native
}

@JSImport("gdal", "SpatialReference")
@js.native
object SpatialReference extends js.Object {
  def fromCRSURL(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromEPSG(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromEPSGA(input: scala.Double): gdalLib.gdalMod.SpatialReference = js.native
  def fromESRI(input: js.Array[java.lang.String]): gdalLib.gdalMod.SpatialReference = js.native
  def fromMICoordSys(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromProj4(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromURL(url: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromURN(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromUserInput(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromWKT(wkt: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromWMSAUTO(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
  def fromXML(input: java.lang.String): gdalLib.gdalMod.SpatialReference = js.native
}

