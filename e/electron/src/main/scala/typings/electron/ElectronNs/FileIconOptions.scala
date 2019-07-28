package typings.electron.ElectronNs

import typings.electron.electronStrings.large
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIconOptions extends js.Object {
  var size: small | normal | large
}

object FileIconOptions {
  @scala.inline
  def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileIconOptions]
  }
}

