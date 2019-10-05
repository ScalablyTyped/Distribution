package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.PatternFormat")
@js.native
class PatternFormat protected () extends js.Object {
  /**
    * Constructor.
    * Does not take an options object. Instead, it takes a string pattern parameter.
    * This is a string that describes which column values to put into the destination column, along with any arbitrary text. Embed placeholders in your string to indicate a value from another column to embed. The placeholders are {#}, where # is a the index of a source column to use. The index is an index in the srcColumnIndices array from the format() method below. To include a literal { or } character, escape it like this: \{ or \}. To include a literal \ mark, escape it as \\.
    */
  def this(pattern: String) = this()
  /**
    * The standard formatting call, with a few additional parameters
    *
    * @param dataTable - The DataTable on which to operate.
    * @param srcColumnIndices - An array of one or more (zero-based) column indices to pull as the sources from the underlying DataTable. This will be used as a data source for the pattern parameter in the constructor. The column numbers do not have to be in sorted order.
    * @param opt_dstColumnIndex - The destination column to place the output of the pattern manipulation. If not specified, the first element in srcColumIndices will be used as the destination.
    */
  def format(dataTable: DataTable, srcColumnIndices: js.Array[Double]): Unit = js.native
  def format(dataTable: DataTable, srcColumnIndices: js.Array[Double], opt_dstColumnIndex: Double): Unit = js.native
}

