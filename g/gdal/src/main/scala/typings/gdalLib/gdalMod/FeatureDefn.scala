package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "FeatureDefn")
@js.native
class FeatureDefn () extends js.Object {
  val fields: FeatureDefnFields = js.native
  var geomIgnored: scala.Boolean = js.native
  var geomType: scala.Double = js.native
  val name: java.lang.String = js.native
  var styleIgnored: scala.Boolean = js.native
}

