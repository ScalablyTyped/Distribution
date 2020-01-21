package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitiveFirstStepRequired extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var firstStepRequired: js.UndefOr[Boolean] = js.native
  var matchType: js.UndefOr[String] = js.native
  var steps: js.UndefOr[js.Array[AnonNameNumber]] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonCaseSensitiveFirstStepRequired {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    steps: js.Array[AnonNameNumber] = null,
    url: String = null
  ): AnonCaseSensitiveFirstStepRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitiveFirstStepRequired]
  }
}

