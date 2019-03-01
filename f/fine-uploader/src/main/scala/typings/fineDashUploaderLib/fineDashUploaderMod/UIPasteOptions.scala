package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIPasteOptions
  extends fineDashUploaderLib.libCoreMod.PasteOptions {
  /**
    * Text that will appear in the `showPrompt` dialog.
    *
    * @default `Please name this image`
    */
  var namePromptMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable or disable the usage of `showPrompt` by Fine Uploader to prompt the user for a filename for a pasted file
    *
    * @default `false`
    */
  var promptForName: js.UndefOr[scala.Boolean] = js.undefined
}

object UIPasteOptions {
  @scala.inline
  def apply(
    defaultName: java.lang.String = null,
    namePromptMessage: java.lang.String = null,
    promptForName: js.UndefOr[scala.Boolean] = js.undefined,
    targetElement: stdLib.HTMLElement = null
  ): UIPasteOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    if (namePromptMessage != null) __obj.updateDynamic("namePromptMessage")(namePromptMessage)
    if (!js.isUndefined(promptForName)) __obj.updateDynamic("promptForName")(promptForName)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[UIPasteOptions]
  }
}

