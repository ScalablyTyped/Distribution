package typings.electron.Electron

import typings.electron.electronStrings.monospaced
import typings.electron.electronStrings.monospacedDigit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleOptions extends js.Object {
  
  /**
    * The font family variant to display, can be `monospaced` or `monospacedDigit`.
    * `monospaced` is available in macOS 10.15+ and `monospacedDigit` is available in
    * macOS 10.11+.  When left blank, the title uses the default system font.
    */
  var fontType: js.UndefOr[monospaced | monospacedDigit] = js.native
}
object TitleOptions {
  
  @scala.inline
  def apply(): TitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleOptions]
  }
  
  @scala.inline
  implicit class TitleOptionsOps[Self <: TitleOptions] (val x: Self) extends AnyVal {
    
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
    def setFontType(value: monospaced | monospacedDigit): Self = this.set("fontType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontType: Self = this.set("fontType", js.undefined)
  }
}
