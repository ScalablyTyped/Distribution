package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  /** List of build step digests, in order corresponding to build step indices. */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.undefined
  /** Images that were built as a part of the build. */
  var images: js.UndefOr[js.Array[BuiltImage]] = js.undefined
}

object Results {
  @scala.inline
  def apply(buildStepImages: js.Array[String] = null, images: js.Array[BuiltImage] = null): Results = {
    val __obj = js.Dynamic.literal()
    if (buildStepImages != null) __obj.updateDynamic("buildStepImages")(buildStepImages)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[Results]
  }
}

