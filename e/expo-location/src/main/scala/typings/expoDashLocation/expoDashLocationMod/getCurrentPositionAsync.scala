package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "getCurrentPositionAsync")
@js.native
object getCurrentPositionAsync extends js.Object {
  def apply(): js.Promise[LocationData] = js.native
  def apply(options: LocationOptions): js.Promise[LocationData] = js.native
}

