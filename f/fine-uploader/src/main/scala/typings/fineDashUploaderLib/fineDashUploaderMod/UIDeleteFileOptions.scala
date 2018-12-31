package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIDeleteFileOptions
  extends fineDashUploaderLib.libCoreMod.DeleteFileOptions {
  /**
    * The message displayed in the confirm delete dialog
    *
    * @default `'Are you sure you want to delete {filename}?'`
    */
  var confirmMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status message to appear next to a file that has failed to delete
    *
    * @default `'Delete failed'`
    */
  var deletingFailedText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status message to appear next to a file that is pending deletion
    *
    * @default `'Deleting...'`
    */
  var deletingStatusText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this value is set to `true`, the user will be required to confirm the file delete request via a confirmation dialog
    *
    * @default `false`
    */
  var forceConfirm: js.UndefOr[scala.Boolean] = js.undefined
}

