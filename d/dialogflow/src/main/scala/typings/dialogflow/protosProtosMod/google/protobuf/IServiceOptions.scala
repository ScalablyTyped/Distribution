package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ServiceOptions. */
trait IServiceOptions extends js.Object {
  /** ServiceOptions .google.api.defaultHost */
  var `.google.api.defaultHost`: js.UndefOr[String | Null] = js.undefined
  /** ServiceOptions .google.api.oauthScopes */
  var `.google.api.oauthScopes`: js.UndefOr[String | Null] = js.undefined
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IServiceOptions {
  @scala.inline
  def apply(
    `.google.api.defaultHost`: String = null,
    `.google.api.oauthScopes`: String = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (`.google.api.defaultHost` != null) __obj.updateDynamic(".google.api.defaultHost")(`.google.api.defaultHost`)
    if (`.google.api.oauthScopes` != null) __obj.updateDynamic(".google.api.oauthScopes")(`.google.api.oauthScopes`)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption)
    __obj.asInstanceOf[IServiceOptions]
  }
}

