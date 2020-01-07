package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for build operations.
  */
@js.native
trait Schema$BuildOperationMetadata extends js.Object {
  /**
    * The build that the operation is tracking.
    */
  var build: js.UndefOr[Schema$Build] = js.native
}

object Schema$BuildOperationMetadata {
  @scala.inline
  def apply(build: Schema$Build = null): Schema$BuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildOperationMetadata]
  }
}

