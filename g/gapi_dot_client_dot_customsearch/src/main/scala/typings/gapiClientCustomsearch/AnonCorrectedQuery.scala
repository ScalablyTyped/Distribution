package typings.gapiClientCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorrectedQuery extends js.Object {
  var correctedQuery: js.UndefOr[String] = js.undefined
  var htmlCorrectedQuery: js.UndefOr[String] = js.undefined
}

object AnonCorrectedQuery {
  @scala.inline
  def apply(correctedQuery: String = null, htmlCorrectedQuery: String = null): AnonCorrectedQuery = {
    val __obj = js.Dynamic.literal()
    if (correctedQuery != null) __obj.updateDynamic("correctedQuery")(correctedQuery.asInstanceOf[js.Any])
    if (htmlCorrectedQuery != null) __obj.updateDynamic("htmlCorrectedQuery")(htmlCorrectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorrectedQuery]
  }
}

