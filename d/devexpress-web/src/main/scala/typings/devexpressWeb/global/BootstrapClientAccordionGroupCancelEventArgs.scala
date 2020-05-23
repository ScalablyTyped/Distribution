package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on accordion groups.
  */
@JSGlobal("BootstrapClientAccordionGroupCancelEventArgs")
@js.native
class BootstrapClientAccordionGroupCancelEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientAccordionGroupCancelEventArgs {
  def this(processOnServer: Boolean, group: typings.devexpressWeb.BootstrapClientAccordionGroup) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  override var group: typings.devexpressWeb.BootstrapClientAccordionGroup = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

