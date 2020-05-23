package typings.feathersjsPrimusClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersPrimusClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object FeathersPrimusClientOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): FeathersPrimusClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersPrimusClientOptions]
  }
}

