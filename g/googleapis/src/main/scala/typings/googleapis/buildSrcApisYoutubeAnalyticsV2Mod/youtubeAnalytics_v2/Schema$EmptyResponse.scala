package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Empty response.
  */
@js.native
trait Schema$EmptyResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
}

object Schema$EmptyResponse {
  @scala.inline
  def apply(errors: Schema$Errors = null): Schema$EmptyResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EmptyResponse]
  }
}

