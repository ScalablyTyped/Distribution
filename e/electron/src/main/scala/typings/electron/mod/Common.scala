package typings.electron.mod

import typings.electron.Electron.Clipboard
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  @JSImport("electron", "Common.NativeImage")
  @js.native
  class NativeImage_ ()
    extends StObject
       with typings.electron.Electron.NativeImage_
  
  @JSImport("electron", "Common.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSImport("electron", "Common.crashReporter")
  @js.native
  val crashReporter: CrashReporter = js.native
  
  @JSImport("electron", "Common.desktopCapturer")
  @js.native
  val desktopCapturer: DesktopCapturer = js.native
  
  /* was `typeof NativeImage` */
  @JSImport("electron", "Common.nativeImage")
  @js.native
  class nativeImage ()
    extends StObject
       with typings.electron.Electron.NativeImage_
  
  @JSImport("electron", "Common.shell")
  @js.native
  val shell: Shell = js.native
}
