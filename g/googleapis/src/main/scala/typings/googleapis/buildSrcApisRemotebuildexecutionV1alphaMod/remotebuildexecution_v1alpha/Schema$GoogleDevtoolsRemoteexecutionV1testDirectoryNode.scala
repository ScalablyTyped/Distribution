package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode extends js.Object {
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode {
  @scala.inline
  def apply(digest: Schema$GoogleDevtoolsRemoteexecutionV1testDigest = null, name: String = null): Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode]
  }
}

