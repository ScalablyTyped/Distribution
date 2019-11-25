package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionResponse extends js.Object {
  var compilerError: js.UndefOr[Boolean] = js.undefined
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  var newWorkspacePath: js.UndefOr[String] = js.undefined
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

