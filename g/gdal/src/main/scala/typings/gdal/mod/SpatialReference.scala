package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "SpatialReference")
@js.native
class SpatialReference () extends StObject {
  def this(wkt: String) = this()
  
  def EPSGTreatsAsLatLong(): Boolean = js.native
  
  def EPSGTreatsAsNorthingEasting(): Boolean = js.native
  
  def autoIdentifyEPSG(): Unit = js.native
  
  def cloneGeogCS(): SpatialReference = js.native
  
  def getAngularUnits(): typings.gdal.anon.Unit = js.native
  
  def getAttrValue(node_name: String): String = js.native
  def getAttrValue(node_name: String, attr_index: Double): String = js.native
  
  def getAuthorityCode(target_key: String): String = js.native
  
  def getAuthorityName(target_key: String): String = js.native
  
  def getLinearUnits(): typings.gdal.anon.Unit = js.native
  
  def isCompound(): Boolean = js.native
  
  def isGeocentric(): Boolean = js.native
  
  def isGeographic(): Boolean = js.native
  
  def isLocal(): Boolean = js.native
  
  def isProjected(): Boolean = js.native
  
  def isSame(srs: SpatialReference): Boolean = js.native
  
  def isSameGeogCS(srs: SpatialReference): Boolean = js.native
  
  def isSameVertCS(srs: SpatialReference): Boolean = js.native
  
  def isVertical(): Boolean = js.native
  
  def morphFromESRI(): Unit = js.native
  
  def morphToESRI(): Unit = js.native
  
  def setWellKnownGeogCS(name: String): Unit = js.native
  
  def toPrettyWKT(): String = js.native
  def toPrettyWKT(simplify: Boolean): String = js.native
  
  def toProj4(): String = js.native
  
  def toWKT(): String = js.native
  
  def toXML(): String = js.native
  
  def validate(): String = js.native
}
/* static members */
object SpatialReference {
  
  @JSImport("gdal", "SpatialReference.fromCRSURL")
  @js.native
  def fromCRSURL(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromEPSG")
  @js.native
  def fromEPSG(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromEPSGA")
  @js.native
  def fromEPSGA(input: Double): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromESRI")
  @js.native
  def fromESRI(input: js.Array[String]): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromMICoordSys")
  @js.native
  def fromMICoordSys(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromProj4")
  @js.native
  def fromProj4(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromURL")
  @js.native
  def fromURL(url: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromURN")
  @js.native
  def fromURN(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromUserInput")
  @js.native
  def fromUserInput(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromWKT")
  @js.native
  def fromWKT(wkt: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromWMSAUTO")
  @js.native
  def fromWMSAUTO(input: String): SpatialReference = js.native
  
  @JSImport("gdal", "SpatialReference.fromXML")
  @js.native
  def fromXML(input: String): SpatialReference = js.native
}
