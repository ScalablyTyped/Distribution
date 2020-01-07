package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to quick previewing a workspace.
  */
@js.native
trait Schema$QuickPreviewResponse extends js.Object {
  /**
    * Were there compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The quick previewed container version.
    */
  var containerVersion: js.UndefOr[Schema$ContainerVersion] = js.native
  /**
    * Whether quick previewing failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[Schema$SyncStatus] = js.native
}

object Schema$QuickPreviewResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: Schema$ContainerVersion = null,
    syncStatus: Schema$SyncStatus = null
  ): Schema$QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuickPreviewResponse]
  }
}

