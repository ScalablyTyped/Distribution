package typings.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  var methods: StringDictionary[MethodConfig]
  var retry_codes: StringDictionary[js.Array[String]]
  var retry_params: StringDictionary[RetryParamsConfig]
}

object ServiceConfig {
  @scala.inline
  def apply(
    methods: StringDictionary[MethodConfig],
    retry_codes: StringDictionary[js.Array[String]],
    retry_params: StringDictionary[RetryParamsConfig]
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], retry_codes = retry_codes.asInstanceOf[js.Any], retry_params = retry_params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceConfig]
  }
}

