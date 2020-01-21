package typings.googleCloudPubsub.pubsubMod.google.api

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
    fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined,
    rules: js.Array[IHttpRule] = null
  ): IHttp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullyDecodeReservedExpansion)) __obj.updateDynamic("fullyDecodeReservedExpansion")(fullyDecodeReservedExpansion.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttp]
  }
}

