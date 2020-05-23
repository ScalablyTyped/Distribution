package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancellable ASPxClientHtmlEditor.ActiveTabChanging event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabCancelEventArgs extends ASPxClientHtmlEditorTabEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientHtmlEditorTabCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, name: String): ASPxClientHtmlEditorTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTabCancelEventArgs]
  }
}

