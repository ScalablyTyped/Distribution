package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.base64
import typings.expoFileSystem.expoFileSystemStrings.utf8
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
    length: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined
  ): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadingOptions]
  }
}

