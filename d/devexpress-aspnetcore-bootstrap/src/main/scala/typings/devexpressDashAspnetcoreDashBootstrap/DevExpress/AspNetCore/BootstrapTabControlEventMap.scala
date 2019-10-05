package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(activeTabChanged = activeTabChanged, activeTabChanging = activeTabChanging, beginCallback = beginCallback, callbackError = callbackError, endCallback = endCallback, init = init, tabClick = tabClick)
  
    __obj.asInstanceOf[BootstrapTabControlEventMap]
  }
}

