package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  /** List of build step digests, in order corresponding to build step indices. */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.native
  /** Images that were built as a part of the build. */
  var images: js.UndefOr[js.Array[BuiltImage]] = js.native
}

object Results {
  @scala.inline
  def apply(): Results = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
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
    def setBuildStepImagesVarargs(value: String*): Self = this.set("buildStepImages", js.Array(value :_*))
    @scala.inline
    def setBuildStepImages(value: js.Array[String]): Self = this.set("buildStepImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildStepImages: Self = this.set("buildStepImages", js.undefined)
    @scala.inline
    def setImagesVarargs(value: BuiltImage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[BuiltImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
  }
  
}

