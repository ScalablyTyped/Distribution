package typings.electronDashUtil.electronDashUtilMod

import typings.electron.ElectronNs.AllElectron
import typings.electron.ElectronNs.MenuItemConstructorOptions
import typings.electron.ElectronNs.Rectangle
import typings.electron.ElectronNs.Remote
import typings.electron.electronMod.BrowserWindow
import typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val api: AllElectron | Remote = js.native
  val appLaunchTimestamp: Double = js.native
  val chromeVersion: String = js.native
  val darkMode: DarkMode = js.native
  val electronVersion: String = js.native
  def aboutMenuItem(): MenuItemConstructorOptions = js.native
  def aboutMenuItem(options: AboutMenuItemOptions): MenuItemConstructorOptions = js.native
  def activeWindow(): BrowserWindow = js.native
  def appMenu(): MenuItemConstructorOptions = js.native
  def appMenu(menuItems: js.Array[MenuItemConstructorOptions]): MenuItemConstructorOptions = js.native
  def centerWindow(): Unit = js.native
  def centerWindow(options: CenterWindowOptions): Unit = js.native
  def debugInfo(): String = js.native
  def disableZoom(): Unit = js.native
  def disableZoom(window: BrowserWindow): Unit = js.native
  def enforceMacOSAppLocation(): Unit = js.native
  def fixPathForAsarUnpack(path: String): String = js.native
  def getWindowBoundsCentered(): Rectangle = js.native
  def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): Rectangle = js.native
  def isFirstAppLaunch(): Boolean = js.native
  def menuBarHeight(): Double = js.native
  def openNewGitHubIssue(options: Options): Unit = js.native
  def openUrlMenuItem(): MenuItemConstructorOptions = js.native
  def openUrlMenuItem(options: OpenUrlMenuItemOptions): MenuItemConstructorOptions = js.native
  def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = js.native
  def runJS(code: String): js.Promise[_] = js.native
  def runJS(code: String, window: BrowserWindow): js.Promise[_] = js.native
  def setContentSecurityPolicy(policy: String): Unit = js.native
  def setContentSecurityPolicy(policy: String, options: SetContentSecurityPolicyOptions): Unit = js.native
  def showAboutWindow(options: ShowAboutWindowOptions): Unit = js.native
}

