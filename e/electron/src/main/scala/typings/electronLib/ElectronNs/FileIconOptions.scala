package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIconOptions extends js.Object {
  var size: electronLib.electronLibStrings.small | electronLib.electronLibStrings.normal | electronLib.electronLibStrings.large
}

object FileIconOptions {
  @scala.inline
  def apply(
    size: electronLib.electronLibStrings.small | electronLib.electronLibStrings.normal | electronLib.electronLibStrings.large
  ): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileIconOptions]
  }
}

