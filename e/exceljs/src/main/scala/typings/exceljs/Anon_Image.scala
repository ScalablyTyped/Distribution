package typings.exceljs

import typings.exceljs.exceljsMod.ImageRange
import typings.exceljs.exceljsStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var imageId: String
  var range: ImageRange
  var `type`: image
}

object Anon_Image {
  @scala.inline
  def apply(imageId: String, range: ImageRange, `type`: image): Anon_Image = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

