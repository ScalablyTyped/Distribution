package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterMetadata extends js.Object {
  /** Human-readable description of the counter semantics. */
  var description: js.UndefOr[String] = js.undefined
  /** Counter aggregation kind. */
  var kind: js.UndefOr[String] = js.undefined
  /** A string referring to the unit type. */
  var otherUnits: js.UndefOr[String] = js.undefined
  /** System defined Units, see above enum. */
  var standardUnits: js.UndefOr[String] = js.undefined
}

object CounterMetadata {
  @scala.inline
  def apply(
    description: String = null,
    kind: String = null,
    otherUnits: String = null,
    standardUnits: String = null
  ): CounterMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (otherUnits != null) __obj.updateDynamic("otherUnits")(otherUnits)
    if (standardUnits != null) __obj.updateDynamic("standardUnits")(standardUnits)
    __obj.asInstanceOf[CounterMetadata]
  }
}

