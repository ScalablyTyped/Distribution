package typings.dialogflow.protosProtosMod.google.protobuf

import typings.dialogflow.protosProtosMod.google.api.IHttpRule
import typings.dialogflow.protosProtosMod.google.longrunning.IOperationInfo
import typings.dialogflow.protosProtosMod.google.protobuf.MethodOptions.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodOptions. */
trait IMethodOptions extends js.Object {
  /** MethodOptions .google.api.http */
  var `.google.api.http`: js.UndefOr[IHttpRule | Null] = js.undefined
  /** MethodOptions .google.api.methodSignature */
  var `.google.api.methodSignature`: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** MethodOptions .google.longrunning.operationInfo */
  var `.google.longrunning.operationInfo`: js.UndefOr[IOperationInfo | Null] = js.undefined
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
    `.google.api.http`: IHttpRule = null,
    `.google.api.methodSignature`: js.Array[String] = null,
    `.google.longrunning.operationInfo`: IOperationInfo = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    idempotencyLevel: IdempotencyLevel = null,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (`.google.api.http` != null) __obj.updateDynamic(".google.api.http")(`.google.api.http`)
    if (`.google.api.methodSignature` != null) __obj.updateDynamic(".google.api.methodSignature")(`.google.api.methodSignature`)
    if (`.google.longrunning.operationInfo` != null) __obj.updateDynamic(".google.longrunning.operationInfo")(`.google.longrunning.operationInfo`)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (idempotencyLevel != null) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel)
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption)
    __obj.asInstanceOf[IMethodOptions]
  }
}

