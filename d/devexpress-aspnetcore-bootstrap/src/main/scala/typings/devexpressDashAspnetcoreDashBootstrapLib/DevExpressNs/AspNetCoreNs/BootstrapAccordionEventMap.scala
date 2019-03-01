package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapAccordionEventMap extends ControlEventMap {
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var endCallback: EndCallbackEventArgs
  var expandedChanged: AccordionGroupEventArgs
  var expandedChanging: AccordionGroupCancelEventArgs
  var headerClick: AccordionGroupClickEventArgs
  var itemClick: AccordionItemEventArgs
}

object BootstrapAccordionEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: AccordionGroupEventArgs,
    expandedChanging: AccordionGroupCancelEventArgs,
    headerClick: AccordionGroupClickEventArgs,
    init: EventArgs,
    itemClick: AccordionItemEventArgs
  ): BootstrapAccordionEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("expandedChanged")(expandedChanged)
    __obj.updateDynamic("expandedChanging")(expandedChanging)
    __obj.updateDynamic("headerClick")(headerClick)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("itemClick")(itemClick)
    __obj.asInstanceOf[BootstrapAccordionEventMap]
  }
}

