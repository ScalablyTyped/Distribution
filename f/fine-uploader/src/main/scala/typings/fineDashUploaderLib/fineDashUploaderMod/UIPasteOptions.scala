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

