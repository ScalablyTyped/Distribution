package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildLink extends js.Object {
  /** The node to which the link points. */
  var childIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of the link. For example, in Hash Joins this could be used to
    * distinguish between the build child and the probe child, or in the case
    * of the child being an output variable, to represent the tag associated
    * with the output variable.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only present if the child node is SCALAR and corresponds
    * to an output variable of the parent node. The field carries the name of
    * the output variable.
    * For example, a `TableScan` operator that reads rows from a table will
    * have child links to the `SCALAR` nodes representing the output variables
    * created for each column that is read by the operator. The corresponding
    * `variable` fields will be set to the variable names assigned to the
    * columns.
    */
  var variable: js.UndefOr[java.lang.String] = js.undefined
}

