package typings.expoLocation.mod

import typings.expoLocation.anon.Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "reverseGeocodeAsync")
@js.native
object reverseGeocodeAsync extends js.Object {
  def apply(location: Latitude): js.Promise[js.Array[Address]] = js.native
}

