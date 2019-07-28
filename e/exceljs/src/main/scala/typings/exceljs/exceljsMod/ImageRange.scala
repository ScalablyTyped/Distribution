package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRange extends js.Object {
  var br: Anon_Col
  var tl: Anon_Col
}

object ImageRange {
  @scala.inline
  def apply(br: Anon_Col, tl: Anon_Col): ImageRange = {
    val __obj = js.Dynamic.literal(br = br, tl = tl)
  
    __obj.asInstanceOf[ImageRange]
  }
}

