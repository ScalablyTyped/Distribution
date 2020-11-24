package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Choices[Macos, Windows, Linux, Default] extends js.Object {
  
  val default: js.UndefOr[Default | js.Function0[Default]] = js.native
  
  val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.native
  
  val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.native
  
  val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.native
}
object _Choices {
  
  @scala.inline
  def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
  }
  
  @scala.inline
  implicit class _ChoicesOps[Self <: _Choices[_, _, _, _], Macos, Windows, Linux, Default] (val x: Self with (_Choices[Macos, Windows, Linux, Default])) extends AnyVal {
    
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
    def setDefaultFunction0(value: () => Default): Self = this.set("default", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefault(value: Default | js.Function0[Default]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setLinuxFunction0(value: () => Linux): Self = this.set("linux", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLinux(value: Linux | js.Function0[Linux]): Self = this.set("linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinux: Self = this.set("linux", js.undefined)
    
    @scala.inline
    def setMacosFunction0(value: () => Macos): Self = this.set("macos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMacos(value: Macos | js.Function0[Macos]): Self = this.set("macos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacos: Self = this.set("macos", js.undefined)
    
    @scala.inline
    def setWindowsFunction0(value: () => Windows): Self = this.set("windows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWindows(value: Windows | js.Function0[Windows]): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
}
