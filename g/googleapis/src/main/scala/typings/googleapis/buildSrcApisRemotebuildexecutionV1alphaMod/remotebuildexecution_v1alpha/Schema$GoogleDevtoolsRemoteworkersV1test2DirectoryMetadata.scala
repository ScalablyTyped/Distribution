package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata extends js.Object {
  /**
    * A pointer to the contents of the directory, in the form of a marshalled
    * Directory message.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * The path of the directory, as in FileMetadata.path.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata {
  @scala.inline
  def apply(digest: Schema$GoogleDevtoolsRemoteworkersV1test2Digest = null, path: String = null): Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]
  }
}

