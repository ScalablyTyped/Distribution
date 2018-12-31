package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationRule extends js.Object {
  /** Floodlight activity ID associated with this rule. This field can be left blank. */
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of floodlight activity associated with this rule. This is a read-only, auto-generated field. */
  var floodlightActivityName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses themselves are made up of list population terms which are
    * joined by ORs.
    */
  var listPopulationClauses: js.UndefOr[js.Array[ListPopulationClause]] = js.undefined
}

