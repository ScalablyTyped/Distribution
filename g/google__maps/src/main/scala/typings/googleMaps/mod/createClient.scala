package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google/maps", "createClient")
@js.native
object createClient extends js.Object {
  
  def apply(options: CreateClientOptions): GoogleMapsClient = js.native
  def apply(options: CreateClientOptionsWithPromise): GoogleMapsClientWithPromise = js.native
}
