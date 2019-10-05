package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileHashes extends js.Object {
  /** Collection of file hashes. */
  var fileHash: js.UndefOr[js.Array[Hash]] = js.undefined
}

object FileHashes {
  @scala.inline
  def apply(fileHash: js.Array[Hash] = null): FileHashes = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash)
    __obj.asInstanceOf[FileHashes]
  }
}

