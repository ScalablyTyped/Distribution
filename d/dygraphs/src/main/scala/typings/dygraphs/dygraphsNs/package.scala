package typings.dygraphs

import typings.googleDotVisualization.googleNs.visualizationNs.DataTable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dygraphsNs {
  type Data = String | DataArray | DataTable
  type DataArray = js.Array[js.Array[Double | Date]]
}
