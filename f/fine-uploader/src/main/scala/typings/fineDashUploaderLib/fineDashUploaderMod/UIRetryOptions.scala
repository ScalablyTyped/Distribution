package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UIRetryOptions
  extends fineDashUploaderLib.libCoreMod.RetryOptions {
  /**
           * The text of the note that will optionally appear next to the item during automatic retry attempts.
           *
           * Ignored if `showAutoRetryNote` is false.
           *
           * @default `'Retrying {retryNum}/{maxAuto} ...'`
           */
  var autoRetryNote: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Enable or disable a status message appearing next to the item during auto retry attempts
           *
           * @default `true`
           */
  var showAutoRetryNote: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable or disable the showing of a button/link next to the failed item after all retry attempts have been exhausted.
           *
           * Clicking the button/link will force the uploader to make another attempt
           *
           * @default `false`
           */
  var showButton: js.UndefOr[scala.Boolean] = js.undefined
}

