package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CounterMetadata includes all static non-name non-value counter attributes.
  */
@js.native
trait Schema$CounterMetadata extends js.Object {
  /**
    * Human-readable description of the counter semantics.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A string referring to the unit type.
    */
  var otherUnits: js.UndefOr[String] = js.native
  /**
    * System defined Units, see above enum.
    */
  var standardUnits: js.UndefOr[String] = js.native
}

object Schema$CounterMetadata {
  @scala.inline
  def apply(
    description: String = null,
    kind: String = null,
    otherUnits: String = null,
    standardUnits: String = null
  ): Schema$CounterMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (otherUnits != null) __obj.updateDynamic("otherUnits")(otherUnits.asInstanceOf[js.Any])
    if (standardUnits != null) __obj.updateDynamic("standardUnits")(standardUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CounterMetadata]
  }
}

