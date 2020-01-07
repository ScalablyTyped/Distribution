package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group clause made up of list population terms representing constraints
  * joined by ORs.
  */
@js.native
trait Schema$ListPopulationClause extends js.Object {
  /**
    * Terms of this list population clause. Each clause is made up of list
    * population terms representing constraints and are joined by ORs.
    */
  var terms: js.UndefOr[js.Array[Schema$ListPopulationTerm]] = js.native
}

object Schema$ListPopulationClause {
  @scala.inline
  def apply(terms: js.Array[Schema$ListPopulationTerm] = null): Schema$ListPopulationClause = {
    val __obj = js.Dynamic.literal()
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListPopulationClause]
  }
}

