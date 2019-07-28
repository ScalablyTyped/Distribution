package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlViewerOptions")
@js.native
class KmlViewerOptions () extends KmlObject {
  /**
    * Set the state of viewer options, including sunlight, Street View, and historical imagery.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def getOption(`type`: GEViewerOptionsValueEnum): GEViewerOptionsValueEnum = js.native
  /**
    * Returns the current state of the specified viewer option type.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def setOption(`type`: GEViewerOptionsTypeEnum, state: GEViewerOptionsValueEnum): Unit = js.native
}

