package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRange extends js.Object {
  var br: Anon_Col | Anchor
  var tl: Anon_Col | Anchor
}

object ImageRange {
  @scala.inline
  def apply(br: Anon_Col | Anchor, tl: Anon_Col | Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageRange]
  }
}

