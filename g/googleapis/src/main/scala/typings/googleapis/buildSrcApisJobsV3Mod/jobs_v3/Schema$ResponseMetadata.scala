package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait Schema$ResponseMetadata extends js.Object {
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}

object Schema$ResponseMetadata {
  @scala.inline
  def apply(requestId: String = null): Schema$ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResponseMetadata]
  }
}

