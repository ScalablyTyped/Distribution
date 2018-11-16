package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlanNode extends js.Object {
  /** List of child node `index`es and their relationship to this parent. */
  var childLinks: js.UndefOr[js.Array[ChildLink]] = js.undefined
  /** The display name for the node. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The execution statistics associated with the node, contained in a group of
               * key-value pairs. Only present if the plan was returned as a result of a
               * profile query. For example, number of executions, number of rows/time per
               * execution etc.
               */
  var executionStats: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** The `PlanNode`'s index in node list. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
               * Used to determine the type of node. May be needed for visualizing
               * different kinds of nodes differently. For example, If the node is a
               * SCALAR node, it will have a condensed representation
               * which can be used to directly embed a description of the node in its
               * parent.
               */
  var kind: js.UndefOr[java.lang.String] = js.undefined
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
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Condensed representation for SCALAR nodes. */
  var shortRepresentation: js.UndefOr[ShortRepresentation] = js.undefined
}

