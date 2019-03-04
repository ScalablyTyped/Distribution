package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var buffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  var extension: exceljsLib.exceljsLibStrings.jpeg | exceljsLib.exceljsLibStrings.png | exceljsLib.exceljsLibStrings.gif
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    extension: exceljsLib.exceljsLibStrings.jpeg | exceljsLib.exceljsLibStrings.png | exceljsLib.exceljsLibStrings.gif,
    buffer: nodeLib.Buffer = null,
    filename: java.lang.String = null
  ): Image = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Image]
  }
}

