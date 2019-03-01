package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationFile extends js.Object {
  /** The type of the deobfuscation file. */
  var symbolType: js.UndefOr[java.lang.String] = js.undefined
}

object DeobfuscationFile {
  @scala.inline
  def apply(symbolType: java.lang.String = null): DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    __obj.asInstanceOf[DeobfuscationFile]
  }
}

