package typings.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dygraphs {
  import typings.googleDotVisualization.google.visualization.DataTable
  import typings.std.Date

  type Data = String | DataArray | DataTable
  type DataArray = js.Array[js.Array[Double | Date | Null]]
}
