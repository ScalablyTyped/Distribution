package typings.electron.anon

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.Clipboard
import typings.electron.Electron.Common.NativeImage_
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCommon extends js.Object {
  
  var NativeImage: Instantiable0[NativeImage_] = js.native
  
  val clipboard: Clipboard = js.native
  
  val crashReporter: CrashReporter = js.native
  
  val desktopCapturer: DesktopCapturer = js.native
  
  val shell: Shell = js.native
}
object TypeofCommon {
  
  @scala.inline
  def apply(
    NativeImage: Instantiable0[NativeImage_],
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    shell: Shell
  ): TypeofCommon = {
    val __obj = js.Dynamic.literal(NativeImage = NativeImage.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCommon]
  }
  
  @scala.inline
  implicit class TypeofCommonOps[Self <: TypeofCommon] (val x: Self) extends AnyVal {
    
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
    def setNativeImage(value: Instantiable0[NativeImage_]): Self = this.set("NativeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboard(value: Clipboard): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashReporter(value: CrashReporter): Self = this.set("crashReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopCapturer(value: DesktopCapturer): Self = this.set("desktopCapturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: Shell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
}
