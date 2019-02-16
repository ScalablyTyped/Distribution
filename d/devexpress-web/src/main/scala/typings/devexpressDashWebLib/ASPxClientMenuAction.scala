package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a command available in the toolbar or menu.
  */
@js.native
trait ASPxClientMenuAction extends js.Object {
  /**
    * Provides access to the action performed when a button is clicked.
    * Value: The specific action implementation.
    */
  var clickAction: js.Function = js.native
  /**
    * Provides access to a value that specifies the command location.
    * Value: A string that specifies the command location.
    */
  var container: java.lang.String = js.native
  /**
    * Provides access to the value that specifies whether or not the command is disabled by default.
    */
  @JSName("disabled")
  var disabled_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  /**
    * Specifies whether or not the command has a visual separator.
    * Value: true, if the command has a visual separator; otherwise, false.
    */
  var hasSeparator: scala.Boolean = js.native
  /**
    * Provides access to the keyboard shortcut used to invoke the command.
    * Value: An ASPxClientMenuActionHotKey object that specifies the keyboard shortcut.
    */
  var hotKey: ASPxClientMenuActionHotKey = js.native
  /**
    * Provides access to the CSS class of the command's glyph.
    * Value: A string that specifies the name of the CSS class.
    */
  var imageClassName: java.lang.String = js.native
  /**
    *  Knockout template, where you can specify a required SVG icon and write logic to color it.
    */
  var imageTemplateName: java.lang.String = js.native
  /**
    * Provides access to the text for the command.
    * Value: A string that is the command text.
    */
  var text: java.lang.String = js.native
  /**
    * Provides access to the value that specifies whether or not the command is visible in the user interface.
    * Value: true if the command is visible; otherwise false.
    */
  var visible: scala.Boolean = js.native
  /**
    * Provides access to the value that specifies whether or not the command is disabled by default.
    */
  def disabled(): scala.Boolean = js.native
  /**
    * Provides access to the value that specifies whether or not the command is disabled by default.
    */
  def disabled(value: scala.Boolean): scala.Unit = js.native
}

