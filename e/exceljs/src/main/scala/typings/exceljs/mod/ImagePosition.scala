package typings.exceljs.mod

import typings.exceljs.anon.Col
import typings.exceljs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePosition extends js.Object {
  var ext: Height
  var tl: Col
}

object ImagePosition {
  @scala.inline
  def apply(ext: Height, tl: Col): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePosition]
  }
}

