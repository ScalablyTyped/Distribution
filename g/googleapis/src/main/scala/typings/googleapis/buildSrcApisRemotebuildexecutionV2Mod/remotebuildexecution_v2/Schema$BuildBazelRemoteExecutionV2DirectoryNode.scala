package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2DirectoryNode extends js.Object {
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2DirectoryNode {
  @scala.inline
  def apply(digest: Schema$BuildBazelRemoteExecutionV2Digest = null, name: String = null): Schema$BuildBazelRemoteExecutionV2DirectoryNode = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2DirectoryNode]
  }
}

