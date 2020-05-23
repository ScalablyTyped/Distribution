package typings.dialogflow.mod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Http. */
trait IHttp extends js.Object {
  /** Http fullyDecodeReservedExpansion */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean | Null] = js.undefined
  /** Http rules */
  var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
}

object IHttp {
  @scala.inline
  def apply(
    fullyDecodeReservedExpansion: js.UndefOr[Null | Boolean] = js.undefined,
    rules: js.UndefOr[Null | js.Array[IHttpRule]] = js.undefined
  ): IHttp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullyDecodeReservedExpansion)) __obj.updateDynamic("fullyDecodeReservedExpansion")(fullyDecodeReservedExpansion.asInstanceOf[js.Any])
    if (!js.isUndefined(rules)) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttp]
  }
}

