package typings.feathersjsSocketioClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersSocketIOClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object FeathersSocketIOClientOptions {
  @scala.inline
  def apply(timeout: Int | Double = null): FeathersSocketIOClientOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersSocketIOClientOptions]
  }
}

