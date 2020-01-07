package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifacts produced by a build that should be uploaded upon successful
  * completion of all build steps.
  */
@js.native
trait Schema$Artifacts extends js.Object {
  /**
    * A list of images to be pushed upon the successful completion of all build
    * steps.  The images will be pushed using the builder service account&#39;s
    * credentials.  The digests of the pushed images will be stored in the
    * Build resource&#39;s results field.  If any of the images fail to be
    * pushed, the build is marked FAILURE.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of objects to be uploaded to Cloud Storage upon successful
    * completion of all build steps.  Files in the workspace matching specified
    * paths globs will be uploaded to the specified Cloud Storage location
    * using the builder service account&#39;s credentials.  The location and
    * generation of the uploaded objects will be stored in the Build
    * resource&#39;s results field.  If any objects fail to be pushed, the
    * build is marked FAILURE.
    */
  var objects: js.UndefOr[Schema$ArtifactObjects] = js.native
}

object Schema$Artifacts {
  @scala.inline
  def apply(images: js.Array[String] = null, objects: Schema$ArtifactObjects = null): Schema$Artifacts = {
    val __obj = js.Dynamic.literal()
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Artifacts]
  }
}

