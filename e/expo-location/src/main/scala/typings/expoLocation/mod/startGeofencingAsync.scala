package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "startGeofencingAsync")
@js.native
object startGeofencingAsync extends js.Object {
  def apply(taskName: String): js.Promise[Unit] = js.native
  def apply(taskName: String, regions: js.Array[LocationRegion]): js.Promise[Unit] = js.native
}

