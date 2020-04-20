package typings.divaJs

import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCol extends js.Object {
  var col: Double
  var dimensions: Dimensions
  var offset: Offset
  var row: Double
  var url: String
}

object AnonCol {
  @scala.inline
  def apply(col: Double, dimensions: Dimensions, offset: Offset, row: Double, url: String): AnonCol = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCol]
  }
}

