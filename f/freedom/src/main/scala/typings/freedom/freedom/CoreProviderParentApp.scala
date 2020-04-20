package typings.freedom.freedom

import typings.freedom.AnonRemoveEventListener
import typings.freedom.AnonViews
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
trait CoreProviderParentApp extends js.Object {
  var config: AnonViews
  var global: AnonRemoveEventListener
  var manifestId: String
}

object CoreProviderParentApp {
  @scala.inline
  def apply(config: AnonViews, global: AnonRemoveEventListener, manifestId: String): CoreProviderParentApp = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], manifestId = manifestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProviderParentApp]
  }
}

