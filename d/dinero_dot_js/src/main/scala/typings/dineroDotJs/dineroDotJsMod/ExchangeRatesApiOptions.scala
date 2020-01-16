package typings.dineroDotJs.dineroDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRatesApiOptions extends js.Object {
  var endpoint: String | js.Promise[StringDictionary[_]]
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var propertyPath: js.UndefOr[String] = js.undefined
  var roundingMode: js.UndefOr[RoundingMode] = js.undefined
}

object ExchangeRatesApiOptions {
  @scala.inline
  def apply(
    endpoint: String | js.Promise[StringDictionary[_]],
    headers: StringDictionary[String] = null,
    propertyPath: String = null,
    roundingMode: RoundingMode = null
  ): ExchangeRatesApiOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (propertyPath != null) __obj.updateDynamic("propertyPath")(propertyPath.asInstanceOf[js.Any])
    if (roundingMode != null) __obj.updateDynamic("roundingMode")(roundingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRatesApiOptions]
  }
}

