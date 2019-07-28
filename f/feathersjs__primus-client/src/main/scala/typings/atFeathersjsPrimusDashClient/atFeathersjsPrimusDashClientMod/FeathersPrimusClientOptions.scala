package typings.atFeathersjsPrimusDashClient.atFeathersjsPrimusDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersPrimusClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object FeathersPrimusClientOptions {
  @scala.inline
  def apply(timeout: Int | Double = null): FeathersPrimusClientOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersPrimusClientOptions]
  }
}

