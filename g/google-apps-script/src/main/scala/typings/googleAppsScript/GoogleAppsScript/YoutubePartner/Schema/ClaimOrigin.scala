package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimOrigin extends js.Object {
  var source: js.UndefOr[String] = js.undefined
}

object ClaimOrigin {
  @scala.inline
  def apply(source: String = null): ClaimOrigin = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimOrigin]
  }
}

