package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  var methods: org.scalablytyped.runtime.StringDictionary[MethodConfig]
  var retry_codes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var retry_params: org.scalablytyped.runtime.StringDictionary[RetryParamsConfig]
}

object ServiceConfig {
  @scala.inline
  def apply(
    methods: org.scalablytyped.runtime.StringDictionary[MethodConfig],
    retry_codes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    retry_params: org.scalablytyped.runtime.StringDictionary[RetryParamsConfig]
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(methods = methods, retry_codes = retry_codes, retry_params = retry_params)
  
    __obj.asInstanceOf[ServiceConfig]
  }
}

