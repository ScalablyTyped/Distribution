package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export sink for cloud storage files.
  */
@js.native
trait Schema$CloudStorageSink extends js.Object {
  /**
    * Output only. The exported files on cloud storage.
    */
  var files: js.UndefOr[js.Array[Schema$CloudStorageFile]] = js.native
}

object Schema$CloudStorageSink {
  @scala.inline
  def apply(files: js.Array[Schema$CloudStorageFile] = null): Schema$CloudStorageSink = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudStorageSink]
  }
}

