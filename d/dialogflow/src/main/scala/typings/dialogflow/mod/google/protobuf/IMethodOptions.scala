package typings.dialogflow.mod.google.protobuf

import typings.dialogflow.mod.google.api.IHttpRule
import typings.dialogflow.mod.google.longrunning.IOperationInfo
import typings.dialogflow.mod.google.protobuf.MethodOptions.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodOptions. */
trait IMethodOptions extends js.Object {
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.undefined
  /** MethodOptions .google.api.methodSignature */
  @JSName(".google.api.methodSignature")
  var DotgoogleDotapiDotmethodSignature: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** MethodOptions .google.longrunning.operationInfo */
  @JSName(".google.longrunning.operationInfo")
  var DotgoogleDotlongrunningDotoperationInfo: js.UndefOr[IOperationInfo | Null] = js.undefined
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[
    IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String) | Null
  ] = js.undefined
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IMethodOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDothttp: IHttpRule = null,
    DotgoogleDotapiDotmethodSignature: js.Array[String] = null,
    DotgoogleDotlongrunningDotoperationInfo: IOperationInfo = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    idempotencyLevel: IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String) = null,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (DotgoogleDotapiDothttp != null) __obj.updateDynamic(".google.api.http")(DotgoogleDotapiDothttp.asInstanceOf[js.Any])
    if (DotgoogleDotapiDotmethodSignature != null) __obj.updateDynamic(".google.api.methodSignature")(DotgoogleDotapiDotmethodSignature.asInstanceOf[js.Any])
    if (DotgoogleDotlongrunningDotoperationInfo != null) __obj.updateDynamic(".google.longrunning.operationInfo")(DotgoogleDotlongrunningDotoperationInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (idempotencyLevel != null) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodOptions]
  }
}

