package typings.exceljs.mod

import typings.exceljs.AnonCol
import typings.exceljs.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePosition extends js.Object {
  var ext: AnonHeight
  var tl: AnonCol
}

object ImagePosition {
  @scala.inline
  def apply(ext: AnonHeight, tl: AnonCol): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImagePosition]
  }
}

