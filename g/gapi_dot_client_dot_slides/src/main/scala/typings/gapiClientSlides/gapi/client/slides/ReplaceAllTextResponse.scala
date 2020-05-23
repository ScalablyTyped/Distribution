package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextResponse extends js.Object {
  /** The number of occurrences changed by replacing all text. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllTextResponse {
  @scala.inline
  def apply(occurrencesChanged: js.UndefOr[Double] = js.undefined): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(occurrencesChanged)) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
}

