package typings.divaDotJs.interfacesMod

import typings.divaDotJs.Anon_ColDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProvider extends js.Object {
  var cols: Double
  var rows: Double
  var titles: js.Array[Anon_ColDimensions]
  var zoomLevel: Double
}

object SourceProvider {
  @scala.inline
  def apply(cols: Double, rows: Double, titles: js.Array[Anon_ColDimensions], zoomLevel: Double): SourceProvider = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceProvider]
  }
}

