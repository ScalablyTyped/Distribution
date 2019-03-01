package typings
package dineroDotJsLib.dineroDotJsMod.DineroFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRatesApiOptions extends js.Object {
  var endpoint: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var propertyPath: java.lang.String
  var roundingMode: js.UndefOr[RoundingMode] = js.undefined
}

object ExchangeRatesApiOptions {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    propertyPath: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    roundingMode: RoundingMode = null
  ): ExchangeRatesApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("propertyPath")(propertyPath)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (roundingMode != null) __obj.updateDynamic("roundingMode")(roundingMode)
    __obj.asInstanceOf[ExchangeRatesApiOptions]
  }
}

