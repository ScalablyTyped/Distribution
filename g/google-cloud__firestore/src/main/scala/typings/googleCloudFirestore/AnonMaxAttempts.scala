package typings.googleCloudFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxAttempts extends js.Object {
  var maxAttempts: js.UndefOr[Double] = js.undefined
}

object AnonMaxAttempts {
  @scala.inline
  def apply(maxAttempts: Int | Double = null): AnonMaxAttempts = {
    val __obj = js.Dynamic.literal()
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxAttempts]
  }
}

