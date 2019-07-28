package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on tabs.
  */
trait ASPxClientTabControlTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    * Value: An ASPxClientTab object, manipulations on which forced the event to be raised.
    */
  var tab: ASPxClientTab
}

object ASPxClientTabControlTabEventArgs {
  @scala.inline
  def apply(tab: ASPxClientTab): ASPxClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab)
  
    __obj.asInstanceOf[ASPxClientTabControlTabEventArgs]
  }
}

