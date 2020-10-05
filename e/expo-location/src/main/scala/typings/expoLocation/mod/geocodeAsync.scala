package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "geocodeAsync")
@js.native
object geocodeAsync extends js.Object {
  def apply(address: String): js.Promise[js.Array[GeocodedLocation]] = js.native
}

