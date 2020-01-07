package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.GetTree.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2GetTreeResponse extends js.Object {
  /**
    * The directories descended from the requested root.
    */
  var directories: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2Directory]] = js.native
  /**
    * If present, signifies that there are more results which the client can
    * retrieve by passing this as the page_token in a subsequent request. If
    * empty, signifies that this is the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2GetTreeResponse {
  @scala.inline
  def apply(
    directories: js.Array[Schema$BuildBazelRemoteExecutionV2Directory] = null,
    nextPageToken: String = null
  ): Schema$BuildBazelRemoteExecutionV2GetTreeResponse = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2GetTreeResponse]
  }
}

