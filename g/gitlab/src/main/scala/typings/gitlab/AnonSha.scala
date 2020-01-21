package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSha extends js.Object {
  var sha: js.UndefOr[String] = js.undefined
}

object AnonSha {
  @scala.inline
  def apply(sha: String = null): AnonSha = {
    val __obj = js.Dynamic.literal()
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSha]
  }
}

