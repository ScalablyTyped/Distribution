package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserViewConstructorOptions extends js.Object {
  /**
    * See BrowserWindow.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.native
}

object BrowserViewConstructorOptions {
  @scala.inline
  def apply(): BrowserViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserViewConstructorOptions]
  }
  @scala.inline
  implicit class BrowserViewConstructorOptionsOps[Self <: BrowserViewConstructorOptions] (val x: Self) extends AnyVal {
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
    def setWebPreferences(value: WebPreferences): Self = this.set("webPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPreferences: Self = this.set("webPreferences", js.undefined)
  }
  
}

