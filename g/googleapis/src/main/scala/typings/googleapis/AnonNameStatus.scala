package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNameStatus extends js.Object {
  var name: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var weight: js.UndefOr[Double] = js.native
  var won: js.UndefOr[Boolean] = js.native
}

object AnonNameStatus {
  @scala.inline
  def apply(
    name: String = null,
    status: String = null,
    url: String = null,
    weight: Int | Double = null,
    won: js.UndefOr[Boolean] = js.undefined
  ): AnonNameStatus = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (!js.isUndefined(won)) __obj.updateDynamic("won")(won.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameStatus]
  }
}

