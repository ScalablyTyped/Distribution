package typings.electron.global.Electron

import typings.electron.Electron.Clipboard
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  @JSGlobal("Electron.Common.NativeImage")
  @js.native
  class NativeImage_ ()
    extends StObject
       with typings.electron.Electron.NativeImage_
  
  @JSGlobal("Electron.Common.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSGlobal("Electron.Common.crashReporter")
  @js.native
  val crashReporter: CrashReporter = js.native
  
  @JSGlobal("Electron.Common.desktopCapturer")
  @js.native
  val desktopCapturer: DesktopCapturer = js.native
  
  /* was `typeof NativeImage` */
  @JSGlobal("Electron.Common.nativeImage")
  @js.native
  class nativeImage ()
    extends StObject
       with typings.electron.Electron.NativeImage_
  
  @JSGlobal("Electron.Common.shell")
  @js.native
  val shell: Shell = js.native
}
