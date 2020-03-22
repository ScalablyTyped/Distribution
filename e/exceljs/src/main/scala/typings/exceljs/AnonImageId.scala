package typings.exceljs

import typings.exceljs.exceljsStrings.image
import typings.exceljs.mod.ImageRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageId extends js.Object {
  var imageId: String
  var range: ImageRange
  var `type`: image
}

object AnonImageId {
  @scala.inline
  def apply(imageId: String, range: ImageRange, `type`: image): AnonImageId = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImageId]
  }
}

