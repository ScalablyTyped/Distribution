package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a file. Similar to the equivalent message in the Remote
  * Execution API.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata extends js.Object {
  /**
    * If the file is small enough, its contents may also or alternatively be
    * listed here.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * A pointer to the contents of the file. The method by which a client
    * retrieves the contents from a CAS system is not defined here.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * Properties of the file
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The path of this file. If this message is part of the
    * CommandOutputs.outputs fields, the path is relative to the execution root
    * and must correspond to an entry in CommandTask.outputs.files. If this
    * message is part of a Directory message, then the path is relative to the
    * root of that directory. All paths MUST be delimited by forward slashes.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata {
  @scala.inline
  def apply(
    contents: String = null,
    digest: Schema$GoogleDevtoolsRemoteworkersV1test2Digest = null,
    isExecutable: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(isExecutable)) __obj.updateDynamic("isExecutable")(isExecutable.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata]
  }
}

