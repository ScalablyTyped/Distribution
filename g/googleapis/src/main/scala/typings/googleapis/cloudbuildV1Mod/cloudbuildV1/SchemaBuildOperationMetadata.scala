package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for build operations.
  */
@js.native
trait SchemaBuildOperationMetadata extends js.Object {
  /**
    * The build that the operation is tracking.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
}

object SchemaBuildOperationMetadata {
  @scala.inline
  def apply(build: SchemaBuild = null): SchemaBuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildOperationMetadata]
  }
}

