package typings.atGoogleDashCloudFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAttempts extends js.Object {
  var maxAttempts: js.UndefOr[Double] = js.undefined
}

object Anon_MaxAttempts {
  @scala.inline
  def apply(maxAttempts: Int | Double = null): Anon_MaxAttempts = {
    val __obj = js.Dynamic.literal()
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAttempts]
  }
}

