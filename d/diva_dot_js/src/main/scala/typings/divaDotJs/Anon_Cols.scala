package typings.divaDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cols extends js.Object {
  var cols: Double
  var rows: Double
  var tiles: Anon_Col
  var zoomLevel: Double
}

object Anon_Cols {
  @scala.inline
  def apply(cols: Double, rows: Double, tiles: Anon_Col, zoomLevel: Double): Anon_Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cols]
  }
}

