package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlTimeSpan")
@js.native
class KmlTimeSpan () extends KmlTimePrimitive {
  /**
    * Describes the beginning instant of a time period.
    * If absent, the beginning of the period is unbounded.
    */
  def getBegin(): KmlDateTime = js.native
  /**
    * Describes the ending instant of a time period.
    * If absent, the end of the period is unbounded.
    */
  def getEnd(): KmlDateTime = js.native
}

