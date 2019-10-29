package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Col
import typings.exceljs.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePosition extends js.Object {
  var ext: Anon_Height
  var tl: Anon_Col
}

object ImagePosition {
  @scala.inline
  def apply(ext: Anon_Height, tl: Anon_Col): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext, tl = tl)
  
    __obj.asInstanceOf[ImagePosition]
  }
}

