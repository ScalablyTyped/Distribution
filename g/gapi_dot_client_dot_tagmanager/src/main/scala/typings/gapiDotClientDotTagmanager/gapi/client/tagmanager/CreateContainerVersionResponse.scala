package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionResponse extends js.Object {
  /** Compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  /** The container version created. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  /**
    * Auto generated workspace path created as a result of version creation. This field should only be populated if the created version was not a quick
    * preview.
    */
  var newWorkspacePath: js.UndefOr[String] = js.undefined
  /** Whether version creation failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

object CreateContainerVersionResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: ContainerVersion = null,
    newWorkspacePath: String = null,
    syncStatus: SyncStatus = null
  ): CreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (newWorkspacePath != null) __obj.updateDynamic("newWorkspacePath")(newWorkspacePath.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerVersionResponse]
  }
}

