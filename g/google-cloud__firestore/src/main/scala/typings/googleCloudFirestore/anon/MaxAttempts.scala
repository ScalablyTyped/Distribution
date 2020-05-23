package typings.googleCloudFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAttempts extends js.Object {
  var maxAttempts: js.UndefOr[Double] = js.undefined
}

object MaxAttempts {
  @scala.inline
  def apply(maxAttempts: js.UndefOr[Double] = js.undefined): MaxAttempts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAttempts]
  }
}

