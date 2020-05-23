package typings.exceljs.mod

import typings.exceljs.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRange extends js.Object {
  var br: Col | Anchor
  var tl: Col | Anchor
}

object ImageRange {
  @scala.inline
  def apply(br: Col | Anchor, tl: Col | Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRange]
  }
}

