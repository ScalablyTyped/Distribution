package typings
package gapiDotClientDotCustomsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CorrectedQuery extends js.Object {
  var correctedQuery: js.UndefOr[java.lang.String] = js.undefined
  var htmlCorrectedQuery: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CorrectedQuery {
  @scala.inline
  def apply(correctedQuery: java.lang.String = null, htmlCorrectedQuery: java.lang.String = null): Anon_CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    if (correctedQuery != null) __obj.updateDynamic("correctedQuery")(correctedQuery)
    if (htmlCorrectedQuery != null) __obj.updateDynamic("htmlCorrectedQuery")(htmlCorrectedQuery)
    __obj.asInstanceOf[Anon_CorrectedQuery]
  }
}

