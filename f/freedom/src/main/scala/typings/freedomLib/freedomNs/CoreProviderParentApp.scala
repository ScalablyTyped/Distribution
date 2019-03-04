package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
trait CoreProviderParentApp extends js.Object {
  var config: freedomLib.Anon_ViewName
  var global: freedomLib.Anon_B
  var manifestId: java.lang.String
}

object CoreProviderParentApp {
  @scala.inline
  def apply(config: freedomLib.Anon_ViewName, global: freedomLib.Anon_B, manifestId: java.lang.String): CoreProviderParentApp = {
    val __obj = js.Dynamic.literal(config = config, global = global, manifestId = manifestId)
  
    __obj.asInstanceOf[CoreProviderParentApp]
  }
}

