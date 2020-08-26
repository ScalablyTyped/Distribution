package typings.electron.Electron

import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarSpacerConstructorOptions extends js.Object {
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[small | large | flexible] = js.native
}

object TouchBarSpacerConstructorOptions {
  @scala.inline
  def apply(): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarSpacerConstructorOptionsOps[Self <: TouchBarSpacerConstructorOptions] (val x: Self) extends AnyVal {
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
    def setSize(value: small | large | flexible): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

