package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ServiceOptions. */
trait IServiceOptions extends js.Object {
  /** ServiceOptions .google.api.defaultHost */
  @JSName(".google.api.defaultHost")
  var DotgoogleDotapiDotdefaultHost: js.UndefOr[String | Null] = js.undefined
  /** ServiceOptions .google.api.oauthScopes */
  @JSName(".google.api.oauthScopes")
  var DotgoogleDotapiDotoauthScopes: js.UndefOr[String | Null] = js.undefined
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IServiceOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDotdefaultHost: String = null,
    DotgoogleDotapiDotoauthScopes: String = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (DotgoogleDotapiDotdefaultHost != null) __obj.updateDynamic(".google.api.defaultHost")(DotgoogleDotapiDotdefaultHost.asInstanceOf[js.Any])
    if (DotgoogleDotapiDotoauthScopes != null) __obj.updateDynamic(".google.api.oauthScopes")(DotgoogleDotapiDotoauthScopes.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceOptions]
  }
}

