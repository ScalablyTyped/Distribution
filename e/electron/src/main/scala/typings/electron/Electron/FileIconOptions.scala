package typings.electron.Electron

import typings.electron.electronStrings.large
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileIconOptions extends js.Object {
  var size: small | normal | large = js.native
}

object FileIconOptions {
  @scala.inline
  def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIconOptions]
  }
  @scala.inline
  implicit class FileIconOptionsOps[Self <: FileIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSize(value: small | normal | large): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

