package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.ArrowFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ArrowFormat")
@js.native
class ArrowFormat ()
  extends typings.googleVisualization.google.visualization.DefaultFormatter {
  def this(options: ArrowFormatOptions) = this()
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  /* CompleteClass */
  override def format(data: typings.googleVisualization.google.visualization.DataTable, columnIndex: Double): Unit = js.native
}

