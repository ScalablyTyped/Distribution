package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in
  * SourceProvenance messages to verify integrity of source input to the build.
  */
@js.native
trait SchemaFileHashes extends js.Object {
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.native
}

object SchemaFileHashes {
  @scala.inline
  def apply(fileHash: js.Array[SchemaHash] = null): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileHashes]
  }
}

