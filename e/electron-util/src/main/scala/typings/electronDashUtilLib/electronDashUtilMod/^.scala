package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val api: electronLib.ElectronNs.AllElectron | electronLib.ElectronNs.Remote = js.native
  val appLaunchTimestamp: scala.Double = js.native
  val chromeVersion: java.lang.String = js.native
  val darkMode: DarkMode = js.native
  val electronVersion: java.lang.String = js.native
  def aboutMenuItem(): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def aboutMenuItem(options: AboutMenuItemOptions): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def activeWindow(): electronLib.electronMod.BrowserWindow = js.native
  def appMenu(): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def appMenu(menuItems: stdLib.Readonly[js.Array[electronLib.ElectronNs.MenuItemConstructorOptions]]): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def centerWindow(): scala.Unit = js.native
  def centerWindow(options: CenterWindowOptions): scala.Unit = js.native
  def debugInfo(): java.lang.String = js.native
  def disableZoom(): scala.Unit = js.native
  def disableZoom(window: electronLib.electronMod.BrowserWindow): scala.Unit = js.native
  def enforceMacOSAppLocation(): scala.Unit = js.native
  def fixPathForAsarUnpack(path: java.lang.String): java.lang.String = js.native
  def getWindowBoundsCentered(): electronLib.ElectronNs.Rectangle = js.native
  def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): electronLib.ElectronNs.Rectangle = js.native
  def isFirstAppLaunch(): scala.Boolean = js.native
  def menuBarHeight(): scala.Double = js.native
  def openNewGitHubIssue(options: newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlMod.Options): scala.Unit = js.native
  def openUrlMenuItem(): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def openUrlMenuItem(options: OpenUrlMenuItemOptions): electronLib.ElectronNs.MenuItemConstructorOptions = js.native
  def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = js.native
  def runJS(code: java.lang.String): js.Promise[_] = js.native
  def runJS(code: java.lang.String, window: electronLib.electronMod.BrowserWindow): js.Promise[_] = js.native
  def setContentSecurityPolicy(policy: java.lang.String): scala.Unit = js.native
  def setContentSecurityPolicy(policy: java.lang.String, options: SetContentSecurityPolicyOptions): scala.Unit = js.native
  def setWindowBounds(bounds: OptionalRectangle): scala.Unit = js.native
  def setWindowBounds(bounds: OptionalRectangle, options: SetWindowBoundsOptions): scala.Unit = js.native
  def showAboutWindow(options: ShowAboutWindowOptions): scala.Unit = js.native
}

