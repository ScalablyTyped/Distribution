package typings.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dygraphsNs {
  import typings.googleDotVisualization.googleNs.visualizationNs.DataTable
  import typings.std.Date

  type Data = String | DataArray | DataTable
  type DataArray = js.Array[js.Array[Double | Date]]
}
