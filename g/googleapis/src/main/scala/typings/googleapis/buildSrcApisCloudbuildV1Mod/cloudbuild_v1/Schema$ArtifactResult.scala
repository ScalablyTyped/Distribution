package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An artifact that was uploaded during a build. This is a single record in
  * the artifact manifest JSON file.
  */
@js.native
trait Schema$ArtifactResult extends js.Object {
  /**
    * The file hash of the artifact.
    */
  var fileHash: js.UndefOr[js.Array[Schema$FileHashes]] = js.native
  /**
    * The path of an artifact in a Google Cloud Storage bucket, with the
    * generation number. For example,
    * `gs://mybucket/path/to/output.jar#generation`.
    */
  var location: js.UndefOr[String] = js.native
}

object Schema$ArtifactResult {
  @scala.inline
  def apply(fileHash: js.Array[Schema$FileHashes] = null, location: String = null): Schema$ArtifactResult = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ArtifactResult]
  }
}

