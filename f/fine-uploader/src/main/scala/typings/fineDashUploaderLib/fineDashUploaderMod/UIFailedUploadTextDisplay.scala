package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UIFailedUploadTextDisplay extends js.Object {
  /**
           * Enable or disable a tooltip that will display the full contents of the error message when the mouse pointer hovers over the failed item.
           *
           * @default `true`
           */
  var enableTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set the message to display next to each failed file.
           *
           * One of: 'default' which displays the failedUploadText, 'custom' which displays the error response from the server, or 'none' which displays no text
           *
           * @default `'default'`
           */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The property from the server response that contains the error text to display next to a failed item. Ignored unless `mode` is `'custom'`
           *
           * @default `'error'`
           */
  var responseProperty: js.UndefOr[java.lang.String] = js.undefined
}

