package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "startGeofencingAsync")
@js.native
object startGeofencingAsync extends js.Object {
  def apply(taskName: String): js.Promise[Unit] = js.native
  def apply(taskName: String, regions: js.Array[Region]): js.Promise[Unit] = js.native
}

