package typings.emberRouting.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteQueryParam extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var refreshModel: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
}

object RouteQueryParam {
  @scala.inline
  def apply(
    as: String = null,
    refreshModel: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined
  ): RouteQueryParam = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshModel)) __obj.updateDynamic("refreshModel")(refreshModel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteQueryParam]
  }
}

