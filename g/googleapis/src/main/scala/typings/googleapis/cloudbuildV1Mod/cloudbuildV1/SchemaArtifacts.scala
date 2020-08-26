package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifacts produced by a build that should be uploaded upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifacts extends js.Object {
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
  var objects: js.UndefOr[SchemaArtifactObjects] = js.native
}

object SchemaArtifacts {
  @scala.inline
  def apply(): SchemaArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifacts]
  }
  @scala.inline
  implicit class SchemaArtifactsOps[Self <: SchemaArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setObjects(value: SchemaArtifactObjects): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
  }
  
}

