package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOperationMetadata extends js.Object {
  /** The build that the operation is tracking. */
  var build: js.UndefOr[Build] = js.undefined
}

object BuildOperationMetadata {
  @scala.inline
  def apply(build: Build = null): BuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    __obj.asInstanceOf[BuildOperationMetadata]
  }
}

