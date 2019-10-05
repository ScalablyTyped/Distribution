package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPreviewResponse extends js.Object {
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

object QuickPreviewResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: ContainerVersion = null,
    syncStatus: SyncStatus = null
  ): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError)
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion)
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus)
    __obj.asInstanceOf[QuickPreviewResponse]
  }
}

