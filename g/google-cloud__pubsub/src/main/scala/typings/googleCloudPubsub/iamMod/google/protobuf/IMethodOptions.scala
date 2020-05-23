package typings.googleCloudPubsub.iamMod.google.protobuf

import typings.googleCloudPubsub.iamMod.google.api.IHttpRule
import typings.googleCloudPubsub.iamMod.google.protobuf.MethodOptions.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodOptions. */
trait IMethodOptions extends js.Object {
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.undefined
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[IdempotencyLevel | Null] = js.undefined
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IMethodOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDothttp: js.UndefOr[Null | IHttpRule] = js.undefined,
    deprecated: js.UndefOr[Null | Boolean] = js.undefined,
    idempotencyLevel: js.UndefOr[Null | IdempotencyLevel] = js.undefined,
    uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined
  ): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DotgoogleDotapiDothttp)) __obj.updateDynamic(".google.api.http")(DotgoogleDotapiDothttp.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyLevel)) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodOptions]
  }
}

