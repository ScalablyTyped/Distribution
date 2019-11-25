package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  /** @default "GET" */
  var method: js.UndefOr[String] = js.undefined
  /** Callback to invoke when request is completed */
  var onComplete: js.Function
}

object Anon_Method {
  @scala.inline
  def apply(onComplete: js.Function, method: String = null): Anon_Method = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Method]
  }
}

