package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typings.expoDashFileDashSystem.expoDashFileDashSystemStrings.base64
import typings.expoDashFileDashSystem.expoDashFileDashSystemStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingOptions extends js.Object {
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object ReadingOptions {
  @scala.inline
  def apply(
    encoding: EncodingType | utf8 | base64 = null,
    length: Int | Double = null,
    position: Int | Double = null
  ): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadingOptions]
  }
}

