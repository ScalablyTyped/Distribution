package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1beta.CreateVersionRequest.
  */
@js.native
trait SchemaCreateVersionMetadataV1Beta extends js.Object {
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}

object SchemaCreateVersionMetadataV1Beta {
  @scala.inline
  def apply(cloudBuildId: String = null): SchemaCreateVersionMetadataV1Beta = {
    val __obj = js.Dynamic.literal()
    if (cloudBuildId != null) __obj.updateDynamic("cloudBuildId")(cloudBuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1Beta]
  }
}

