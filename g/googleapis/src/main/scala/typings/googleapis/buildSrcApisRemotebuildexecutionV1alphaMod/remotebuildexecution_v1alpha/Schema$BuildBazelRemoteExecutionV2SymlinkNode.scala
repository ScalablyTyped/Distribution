package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `SymlinkNode` represents a symbolic link.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2SymlinkNode extends js.Object {
  /**
    * The name of the symlink.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The target path of the symlink. The path separator is a forward slash
    * `/`. The target path can be relative to the parent directory of the
    * symlink or it can be an absolute path starting with `/`. Support for
    * absolute paths can be checked using the Capabilities API. The canonical
    * form forbids the substrings `/./` and `//` in the target path. `..`
    * components are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2SymlinkNode {
  @scala.inline
  def apply(name: String = null, target: String = null): Schema$BuildBazelRemoteExecutionV2SymlinkNode = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2SymlinkNode]
  }
}

