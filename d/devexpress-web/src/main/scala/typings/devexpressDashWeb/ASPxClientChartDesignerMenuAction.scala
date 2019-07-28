package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action of the Client Chart Designer's menu.
  */
trait ASPxClientChartDesignerMenuAction extends js.Object {
  /**
    * Provides access to the action performed when the Client Chart Designer's button is clicked.
    * Value: The specific action implementation.
    */
  var clickAction: js.Function
  /**
    * Provides access to the location of the displayed command.
    * Value: A String value.
    */
  var container: String
  /**
    * Provides access to the value that specifies whether or not the command is disabled by default.
    * Value: true, if the command is disabled by default; otherwise, false.
    */
  var disabled: Boolean
  /**
    * Provides access to the value that specifies whether or not the command has a visual separator.
    * Value: true, if the command has a visual separator; otherwise, false.
    */
  var hasSeparator: String
  /**
    * Provides access to the keyboard shortcut used to invoke the command.
    * Value: A String value.
    */
  var hotKey: String
  /**
    * Provides access to the CSS class of the command's glyph.
    * Value: A String value.
    */
  var imageClassName: String
  /**
    * Provides access to the text for the command.
    * Value: A String value.
    */
  var text: String
  /**
    * Provides access to the value that specifies whether or not the command is visible in the designer user interface.
    * Value: true if the command is visible; otherwise false.
    */
  var visible: Boolean
}

object ASPxClientChartDesignerMenuAction {
  @scala.inline
  def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: String,
    hotKey: String,
    imageClassName: String,
    text: String,
    visible: Boolean
  ): ASPxClientChartDesignerMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction, container = container, disabled = disabled, hasSeparator = hasSeparator, hotKey = hotKey, imageClassName = imageClassName, text = text, visible = visible)
  
    __obj.asInstanceOf[ASPxClientChartDesignerMenuAction]
  }
}

