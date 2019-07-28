package typings.dineroDotJs.dineroDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRatesApiOptions extends js.Object {
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var propertyPath: String
  var roundingMode: js.UndefOr[RoundingMode] = js.undefined
}

object ExchangeRatesApiOptions {
  @scala.inline
  def apply(
    endpoint: String,
    propertyPath: String,
    headers: StringDictionary[String] = null,
    roundingMode: RoundingMode = null
  ): ExchangeRatesApiOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, propertyPath = propertyPath)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (roundingMode != null) __obj.updateDynamic("roundingMode")(roundingMode)
    __obj.asInstanceOf[ExchangeRatesApiOptions]
  }
}

