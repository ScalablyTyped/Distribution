package typings.exceljs.mod

import typings.exceljs.AnonCol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRange extends js.Object {
  var br: AnonCol | Anchor
  var tl: AnonCol | Anchor
}

object ImageRange {
  @scala.inline
  def apply(br: AnonCol | Anchor, tl: AnonCol | Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageRange]
  }
}

