package typings.exceljs.anon

import typings.exceljs.exceljsStrings.image
import typings.exceljs.mod.ImageRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageId extends js.Object {
  var imageId: String
  var range: ImageRange
  var `type`: image
}

object ImageId {
  @scala.inline
  def apply(imageId: String, range: ImageRange, `type`: image): ImageId = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageId]
  }
}

