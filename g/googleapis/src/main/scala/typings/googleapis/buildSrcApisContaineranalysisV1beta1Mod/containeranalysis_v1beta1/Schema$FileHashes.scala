package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in source
  * messages to verify integrity of source input to the build.
  */
@js.native
trait Schema$FileHashes extends js.Object {
  /**
    * Required. Collection of file hashes.
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

