package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Build information.
  */
@js.native
trait SchemaBuildInfo extends js.Object {
  /**
    * The Google Cloud Build id. Example:
    * &quot;f966068f-08b2-42c8-bdfe-74137dff2bf9&quot;
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}

object SchemaBuildInfo {
  @scala.inline
  def apply(cloudBuildId: String = null): SchemaBuildInfo = {
    val __obj = js.Dynamic.literal()
    if (cloudBuildId != null) __obj.updateDynamic("cloudBuildId")(cloudBuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildInfo]
  }
}

