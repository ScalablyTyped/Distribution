package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActiveTabChanged event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name that uniquely identifies an editor tab.
    * Value: A string value that is the tab name.
    */
  var name: String
}

object ASPxClientHtmlEditorTabEventArgs {
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorTabEventArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTabEventArgs]
  }
}

