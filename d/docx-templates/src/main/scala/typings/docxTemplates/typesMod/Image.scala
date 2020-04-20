package typings.docxTemplates.typesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var data: ArrayBuffer | String
  var extension: String
}

object Image {
  @scala.inline
  def apply(data: ArrayBuffer | String, extension: String): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

