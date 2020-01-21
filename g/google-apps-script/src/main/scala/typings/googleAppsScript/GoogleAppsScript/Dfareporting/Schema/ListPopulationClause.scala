package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationClause extends js.Object {
  var terms: js.UndefOr[js.Array[ListPopulationTerm]] = js.undefined
}

object ListPopulationClause {
  @scala.inline
  def apply(terms: js.Array[ListPopulationTerm] = null): ListPopulationClause = {
    val __obj = js.Dynamic.literal()
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPopulationClause]
  }
}

