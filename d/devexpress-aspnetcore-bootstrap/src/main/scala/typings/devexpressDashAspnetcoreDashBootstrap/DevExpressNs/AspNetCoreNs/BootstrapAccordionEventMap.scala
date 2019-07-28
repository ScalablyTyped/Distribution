package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, callbackError = callbackError, endCallback = endCallback, expandedChanged = expandedChanged, expandedChanging = expandedChanging, headerClick = headerClick, init = init, itemClick = itemClick)
  
    __obj.asInstanceOf[BootstrapAccordionEventMap]
  }
}

