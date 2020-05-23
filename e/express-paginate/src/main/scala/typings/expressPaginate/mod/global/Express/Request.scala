package typings.expressPaginate.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object Request {
  @scala.inline
  def apply(offset: js.UndefOr[Double] = js.undefined, skip: js.UndefOr[Double] = js.undefined): Request = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

