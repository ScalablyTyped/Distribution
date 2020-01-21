package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on accordion groups.
  */
@JSGlobal("BootstrapClientAccordionGroupCancelEventArgs")
@js.native
class BootstrapClientAccordionGroupCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  def this(processOnServer: Boolean, group: BootstrapClientAccordionGroup) = this()
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup = js.native
}

