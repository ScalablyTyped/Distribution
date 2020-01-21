package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationFile extends js.Object {
  /** The type of the deobfuscation file. */
  var symbolType: js.UndefOr[String] = js.undefined
}

object DeobfuscationFile {
  @scala.inline
  def apply(symbolType: String = null): DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeobfuscationFile]
  }
}

