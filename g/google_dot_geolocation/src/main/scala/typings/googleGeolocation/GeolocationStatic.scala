package typings.googleGeolocation

import typings.std.GeolocationPosition
import typings.std.GeolocationPositionError
import typings.std.PositionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationStatic extends StObject {
  
  def getCurrentPosition(success: js.Function1[/* position */ GeolocationPosition, Unit]): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.UndefOr[scala.Nothing],
    opts: PositionOptions
  ): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.Function1[/* positionError */ GeolocationPositionError, Unit]
  ): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.Function1[/* positionError */ GeolocationPositionError, Unit],
    opts: PositionOptions
  ): Unit = js.native
  
  def init(): Boolean = js.native
  
  def showMap(latitude: Double, longitude: Double): Unit = js.native
}
