package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cols extends js.Object {
  var cols: Double
  var rows: Double
  var tiles: Col
  var zoomLevel: Double
}

object Cols {
  @scala.inline
  def apply(cols: Double, rows: Double, tiles: Col, zoomLevel: Double): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
}

