package typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyOptions extends js.Object {
  var projectId: js.UndefOr[String] = js.undefined
}

object HmacKeyOptions {
  @scala.inline
  def apply(projectId: String = null): HmacKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyOptions]
  }
}

