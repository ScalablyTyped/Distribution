package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanNode extends js.Object {
  /** List of child node `index`es and their relationship to this parent. */
  var childLinks: js.UndefOr[js.Array[ChildLink]] = js.undefined
  /** The display name for the node. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The execution statistics associated with the node, contained in a group of
    * key-value pairs. Only present if the plan was returned as a result of a
    * profile query. For example, number of executions, number of rows/time per
    * execution etc.
    */
  var executionStats: js.UndefOr[Record[String, _]] = js.undefined
  /** The `PlanNode`'s index in node list. */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Used to determine the type of node. May be needed for visualizing
    * different kinds of nodes differently. For example, If the node is a
    * SCALAR node, it will have a condensed representation
    * which can be used to directly embed a description of the node in its
    * parent.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Attributes relevant to the node contained in a group of key-value pairs.
    * For example, a Parameter Reference node could have the following
    * information in its metadata:
    *
    * {
    * "parameter_reference": "param1",
    * "parameter_type": "array"
    * }
    */
  var metadata: js.UndefOr[Record[String, _]] = js.undefined
  /** Condensed representation for SCALAR nodes. */
  var shortRepresentation: js.UndefOr[ShortRepresentation] = js.undefined
}

object PlanNode {
  @scala.inline
  def apply(
    childLinks: js.Array[ChildLink] = null,
    displayName: String = null,
    executionStats: Record[String, _] = null,
    index: Int | Double = null,
    kind: String = null,
    metadata: Record[String, _] = null,
    shortRepresentation: ShortRepresentation = null
  ): PlanNode = {
    val __obj = js.Dynamic.literal()
    if (childLinks != null) __obj.updateDynamic("childLinks")(childLinks)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (executionStats != null) __obj.updateDynamic("executionStats")(executionStats)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (shortRepresentation != null) __obj.updateDynamic("shortRepresentation")(shortRepresentation)
    __obj.asInstanceOf[PlanNode]
  }
}

