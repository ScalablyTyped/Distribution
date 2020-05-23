package typings.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  var methods: StringDictionary[MethodConfig | Null]
  var retry_codes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var retry_params: js.UndefOr[StringDictionary[RetryParamsConfig]] = js.undefined
}

object ServiceConfig {
  @scala.inline
  def apply(
    methods: StringDictionary[MethodConfig | Null],
    retry_codes: StringDictionary[js.Array[String]] = null,
    retry_params: StringDictionary[RetryParamsConfig] = null
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    if (retry_codes != null) __obj.updateDynamic("retry_codes")(retry_codes.asInstanceOf[js.Any])
    if (retry_params != null) __obj.updateDynamic("retry_params")(retry_params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
}

