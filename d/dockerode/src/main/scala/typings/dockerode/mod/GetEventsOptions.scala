package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventsOptions extends js.Object {
  var filters: js.UndefOr[String | typings.dockerode.anon.Container] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var until: js.UndefOr[Double] = js.undefined
}

object GetEventsOptions {
  @scala.inline
  def apply(
    filters: String | typings.dockerode.anon.Container = null,
    since: js.UndefOr[Double] = js.undefined,
    until: js.UndefOr[Double] = js.undefined
  ): GetEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    if (!js.isUndefined(until)) __obj.updateDynamic("until")(until.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventsOptions]
  }
}

