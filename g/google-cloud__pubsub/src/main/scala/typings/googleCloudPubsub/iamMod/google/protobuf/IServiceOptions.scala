package typings.googleCloudPubsub.iamMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ServiceOptions. */
trait IServiceOptions extends js.Object {
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IServiceOptions {
  @scala.inline
  def apply(
    deprecated: js.UndefOr[Null | Boolean] = js.undefined,
    uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined
  ): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceOptions]
  }
}

