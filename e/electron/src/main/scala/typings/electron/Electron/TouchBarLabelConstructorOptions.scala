package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarLabelConstructorOptions extends js.Object {
  /**
    * Text to display.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Hex color of text, i.e #ABCDEF.
    */
  var textColor: js.UndefOr[String] = js.undefined
}

object TouchBarLabelConstructorOptions {
  @scala.inline
  def apply(label: String = null, textColor: String = null): TouchBarLabelConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarLabelConstructorOptions]
  }
}

