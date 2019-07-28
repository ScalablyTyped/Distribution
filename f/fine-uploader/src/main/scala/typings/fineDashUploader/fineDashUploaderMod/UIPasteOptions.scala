package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.PasteOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIPasteOptions extends PasteOptions {
  /**
    * Text that will appear in the `showPrompt` dialog.
    *
    * @default `Please name this image`
    */
  var namePromptMessage: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable the usage of `showPrompt` by Fine Uploader to prompt the user for a filename for a pasted file
    *
    * @default `false`
    */
  var promptForName: js.UndefOr[Boolean] = js.undefined
}

object UIPasteOptions {
  @scala.inline
  def apply(
    defaultName: String = null,
    namePromptMessage: String = null,
    promptForName: js.UndefOr[Boolean] = js.undefined,
    targetElement: HTMLElement = null
  ): UIPasteOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    if (namePromptMessage != null) __obj.updateDynamic("namePromptMessage")(namePromptMessage)
    if (!js.isUndefined(promptForName)) __obj.updateDynamic("promptForName")(promptForName)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[UIPasteOptions]
  }
}

