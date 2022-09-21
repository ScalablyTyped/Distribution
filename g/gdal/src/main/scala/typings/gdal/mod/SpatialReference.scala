package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "SpatialReference")
@js.native
open class SpatialReference () extends StObject {
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
  
  @JSImport("gdal", "SpatialReference")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCRSURL(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCRSURL")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromEPSG(input: Double): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromEPSGA(input: Double): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSGA")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromESRI(input: js.Array[String]): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromESRI")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromMICoordSys(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMICoordSys")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromProj4(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProj4")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromURL(url: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromURN(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURN")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromUserInput(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUserInput")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromWKT(wkt: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWKT")(wkt.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromWMSAUTO(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWMSAUTO")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
  
  inline def fromXML(input: String): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromXML")(input.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
}
