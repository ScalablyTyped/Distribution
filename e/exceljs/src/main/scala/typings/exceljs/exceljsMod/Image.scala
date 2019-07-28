package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.gif
import typings.exceljs.exceljsStrings.jpeg
import typings.exceljs.exceljsStrings.png
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.undefined
  var extension: jpeg | png | gif
  var filename: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(extension: jpeg | png | gif, buffer: Buffer = null, filename: String = null): Image = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Image]
  }
}

