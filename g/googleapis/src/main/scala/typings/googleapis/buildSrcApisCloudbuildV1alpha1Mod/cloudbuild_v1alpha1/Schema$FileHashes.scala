package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in
  * SourceProvenance messages to verify integrity of source input to the build.
  */
@js.native
trait Schema$FileHashes extends js.Object {
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[Schema$Hash]] = js.native
}

object Schema$FileHashes {
  @scala.inline
  def apply(fileHash: js.Array[Schema$Hash] = null): Schema$FileHashes = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileHashes]
  }
}

