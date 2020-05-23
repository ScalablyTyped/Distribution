package typings.divaJs.anon

import typings.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Col extends js.Object {
  var col: Double
  var dimensions: typings.divaJs.interfacesMod.Dimensions
  var offset: Offset
  var row: Double
  var url: String
}

object Col {
  @scala.inline
  def apply(
    col: Double,
    dimensions: typings.divaJs.interfacesMod.Dimensions,
    offset: Offset,
    row: Double,
    url: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
}

