package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeTabChanged")(activeTabChanged)
    __obj.updateDynamic("activeTabChanging")(activeTabChanging)
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("tabClick")(tabClick)
    __obj.asInstanceOf[BootstrapTabControlEventMap]
  }
}

