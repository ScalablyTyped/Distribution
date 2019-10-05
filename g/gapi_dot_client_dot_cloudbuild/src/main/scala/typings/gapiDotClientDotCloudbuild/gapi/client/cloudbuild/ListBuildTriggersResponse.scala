package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBuildTriggersResponse extends js.Object {
  /** BuildTriggers for the project, sorted by create_time descending. */
  var triggers: js.UndefOr[js.Array[BuildTrigger]] = js.undefined
}

object ListBuildTriggersResponse {
  @scala.inline
  def apply(triggers: js.Array[BuildTrigger] = null): ListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    __obj.asInstanceOf[ListBuildTriggersResponse]
  }
}

