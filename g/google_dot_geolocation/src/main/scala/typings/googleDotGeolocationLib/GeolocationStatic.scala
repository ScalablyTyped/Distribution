package typings
package googleDotGeolocationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationStatic extends js.Object {
  def getCurrentPosition(success: js.Function1[/* position */ stdLib.Position, scala.Unit]): scala.Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ stdLib.Position, scala.Unit],
    error: js.Function1[/* positionError */ stdLib.PositionError, scala.Unit]
  ): scala.Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ stdLib.Position, scala.Unit],
    error: js.Function1[/* positionError */ stdLib.PositionError, scala.Unit],
    opts: stdLib.PositionOptions
  ): scala.Unit = js.native
  def init(): scala.Boolean = js.native
  def showMap(latitude: scala.Double, longitude: scala.Double): scala.Unit = js.native
}

