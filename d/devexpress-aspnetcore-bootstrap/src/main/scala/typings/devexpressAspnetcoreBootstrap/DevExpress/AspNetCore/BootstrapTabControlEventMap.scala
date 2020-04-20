package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTabControlEventMap extends ControlEventMap {
  var activeTabChanged: TabControlTabEventArgs
  var activeTabChanging: TabControlTabCancelEventArgs
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var endCallback: EndCallbackEventArgs
  var tabClick: TabControlTabClickEventArgs
}

object BootstrapTabControlEventMap {
  @scala.inline
  def apply(
    activeTabChanged: TabControlTabEventArgs,
    activeTabChanging: TabControlTabCancelEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    tabClick: TabControlTabClickEventArgs
  ): BootstrapTabControlEventMap = {
    val __obj = js.Dynamic.literal(activeTabChanged = activeTabChanged.asInstanceOf[js.Any], activeTabChanging = activeTabChanging.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], tabClick = tabClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTabControlEventMap]
  }
}

