package typings.googleGax.operationsMod.google.protobuf

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Any. */
trait IAny extends js.Object {
  /** Any type_url */
  var type_url: js.UndefOr[String | Null] = js.undefined
  /** Any value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IAny {
  @scala.inline
  def apply(
    type_url: js.UndefOr[Null | String] = js.undefined,
    value: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IAny = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(type_url)) __obj.updateDynamic("type_url")(type_url.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAny]
  }
}

