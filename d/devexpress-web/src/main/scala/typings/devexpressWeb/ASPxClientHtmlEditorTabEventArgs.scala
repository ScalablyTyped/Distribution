package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.ActiveTabChanged event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name that uniquely identifies an editor tab.
    */
  var name: String
}

object ASPxClientHtmlEditorTabEventArgs {
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorTabEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTabEventArgs]
  }
}

