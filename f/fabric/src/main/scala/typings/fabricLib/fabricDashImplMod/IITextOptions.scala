package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IITextOptions extends ITextOptions {
  /**
  	 * Indicates whether internal text char widths can be cached
  	 */
  var caching: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Color of default cursor (when not overwritten by character style)
  	 */
  var cursorColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Delay between cursor blink (in ms)
  	 */
  var cursorDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Duration of cursor fadein (in ms)
  	 */
  var cursorDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width of cursor (in px)
  	 */
  var cursorWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether a text can be edited
  	 */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Border color of text object while it's in editing mode
  	 */
  var editingBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates whether text is in editing mode
  	 */
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Color of text selection
  	 */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Index where text selection ends
  	 */
  var selectionEnd: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Index where text selection starts (or where cursor is when there is no selection)
  	 */
  var selectionStart: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Object containing character styles
  	 * (where top-level properties corresponds to line number and 2nd-level properties -- to char number in a line)
  	 */
  var styles: js.UndefOr[js.Any] = js.undefined
}

