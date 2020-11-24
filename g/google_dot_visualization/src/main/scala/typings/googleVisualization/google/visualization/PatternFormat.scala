package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternFormat extends js.Object {
  
  /**
    * The standard formatting call, with a few additional parameters
    *
    * @param dataTable - The DataTable on which to operate.
    * @param srcColumnIndices - An array of one or more (zero-based) column indices to pull as the sources from the underlying DataTable. This will be used as a data source for the pattern parameter in the constructor. The column numbers do not have to be in sorted order.
    * @param opt_dstColumnIndex - The destination column to place the output of the pattern manipulation. If not specified, the first element in srcColumIndices will be used as the destination.
    */
  def format(data: DataTable, srcColumnIndices: js.Array[Double]): Unit = js.native
  def format(data: DataTable, srcColumnIndices: js.Array[Double], opt_dstColumnIndex: Double): Unit = js.native
}
