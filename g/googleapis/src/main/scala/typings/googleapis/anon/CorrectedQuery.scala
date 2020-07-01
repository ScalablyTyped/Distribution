package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrectedQuery extends js.Object {
  var correctedQuery: js.UndefOr[String] = js.native
  var htmlCorrectedQuery: js.UndefOr[String] = js.native
}

object CorrectedQuery {
  @scala.inline
  def apply(correctedQuery: String = null, htmlCorrectedQuery: String = null): CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    if (correctedQuery != null) __obj.updateDynamic("correctedQuery")(correctedQuery.asInstanceOf[js.Any])
    if (htmlCorrectedQuery != null) __obj.updateDynamic("htmlCorrectedQuery")(htmlCorrectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrectedQuery]
  }
}

