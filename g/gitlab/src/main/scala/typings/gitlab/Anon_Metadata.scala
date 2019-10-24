package typings.gitlab

import typings.gitlab.distSrcCoreServicesMod.UploadMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: js.UndefOr[UploadMetadata] = js.undefined
}

object Anon_Metadata {
  @scala.inline
  def apply(metadata: UploadMetadata = null): Anon_Metadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Anon_Metadata]
  }
}

