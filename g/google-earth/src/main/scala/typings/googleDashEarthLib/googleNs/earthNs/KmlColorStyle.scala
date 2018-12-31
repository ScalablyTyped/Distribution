package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlColorStyle")
@js.native
class KmlColorStyle () extends KmlObject {
  /**
    * Color and opacity (alpha) values.
    */
  def getColor(): KmlColor = js.native
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def getColorMode(): KmlColorModeEnum = js.native
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def setColorMode(colorMode: KmlColorModeEnum): scala.Unit = js.native
}

