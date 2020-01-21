package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  /** @default "GET" */
  var method: js.UndefOr[String] = js.undefined
  /** Callback to invoke when request is completed */
  var onComplete: js.Function
}

object AnonMethod {
  @scala.inline
  def apply(onComplete: js.Function, method: String = null): AnonMethod = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

