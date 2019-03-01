package typings
package expressDashPaginateLib.expressDashPaginateMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var offset: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object Request {
  @scala.inline
  def apply(offset: scala.Int | scala.Double = null, skip: scala.Int | scala.Double = null): Request = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

