package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a blob of binary content with its digest.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2Blob extends js.Object {
  /**
    * The contents of the blob.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * The digest of the blob. This should be verified by the receiver.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2Blob {
  @scala.inline
  def apply(contents: String = null, digest: Schema$GoogleDevtoolsRemoteworkersV1test2Digest = null): Schema$GoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2Blob]
  }
}

