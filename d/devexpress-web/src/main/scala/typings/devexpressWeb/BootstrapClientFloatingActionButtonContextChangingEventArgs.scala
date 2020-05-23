package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapClientFloatingActionButtonContextChangingEventArgs extends ASPxClientFloatingActionButtonContextChangingEventArgs {
  @JSName("action")
  var action_BootstrapClientFloatingActionButtonContextChangingEventArgs: BootstrapClientFABAction
}

object BootstrapClientFloatingActionButtonContextChangingEventArgs {
  @scala.inline
  def apply(action: BootstrapClientFABAction): BootstrapClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientFloatingActionButtonContextChangingEventArgs]
  }
}

