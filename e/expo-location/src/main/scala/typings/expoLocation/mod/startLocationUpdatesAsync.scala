package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "startLocationUpdatesAsync")
@js.native
object startLocationUpdatesAsync extends js.Object {
  def apply(taskName: String): js.Promise[Unit] = js.native
  def apply(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
}

