package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancellable ActiveTabChanging event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabCancelEventArgs extends ASPxClientHtmlEditorTabEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    * Value: true, if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientHtmlEditorTabCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, name: java.lang.String): ASPxClientHtmlEditorTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, name = name)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTabCancelEventArgs]
  }
}

