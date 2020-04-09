package typings.dockerode.mod

import typings.dockerode.AnonContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventsOptions extends js.Object {
  var filters: js.UndefOr[String | AnonContainer] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var until: js.UndefOr[Double] = js.undefined
}

object GetEventsOptions {
  @scala.inline
  def apply(filters: String | AnonContainer = null, since: Int | Double = null, until: Int | Double = null): GetEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventsOptions]
  }
}

