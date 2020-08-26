package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSLibEnv extends js.Object {
  /**
    * The WebSocket session id.
    */
  val WSSession: Double = js.native
  /**
    * The WebSocket version.
    */
  val WSVersion: String = js.native
  /**
    * Whether the browser is Chrome.
    */
  val bChrome: Boolean = js.native
  /**
    * Whether the browser is Edge.
    */
  val bEdge: Boolean = js.native
  /**
    * Whether the page is opening from the disk.
    */
  val bFileSystem: Boolean = js.native
  /**
    * Whether the browser is Firefox.
    */
  val bFirefox: Boolean = js.native
  /**
    * Whether the browser is IE.
    */
  val bIE: Boolean = js.native
  /**
    * Whether the operating system is Linux.
    */
  val bLinux: Boolean = js.native
  /**
    * Whether the operating system is macOS.
    */
  val bMac: Boolean = js.native
  /**
    * Whether the operating system is mobile (Android & iOS & iPadOS).
    */
  val bMobile: Boolean = js.native
  /**
    * Whether the browser is Safari.
    */
  val bSafari: Boolean = js.native
  /**
    * Whether the operating system is Windows.
    */
  val bWin: Boolean = js.native
  /**
    * Whether the operating system is 64bit Windows.
    */
  val bWin64: Boolean = js.native
  /**
    * The base path.
    */
  val basePath: String = js.native
  /**
    * The plugin lenghth.
    */
  val iPluginLength: Double = js.native
  /**
    * Whether the platform is 64bit.
    */
  val isX64: Boolean = js.native
  /**
    * Information about macOSX.
    */
  val macOSX: String = js.native
  /**
    * OS version.
    */
  val osVersion: String = js.native
  /**
    * The path type used to calculate the real path.
    */
  val pathType: Double = js.native
  /**
    * The version of Chrome.
    */
  val strChromeVersion: Double | String = js.native
  /**
    * The version of Firefox.
    */
  val strFirefoxVersion: Double | String = js.native
  /**
    * The version of IE.
    */
  val strIEVersion: Double | String = js.native
  /**
    * Whether it is a desktop viewer.
    */
  def isDesktopViewer(): Boolean = js.native
  /**
    * Whether it is a mobile viewer.
    */
  def isMobileViewer(): Boolean = js.native
  /**
    * Whether it is a pad viewer.
    */
  def isPadViewer(): Boolean = js.native
}

object DSLibEnv {
  @scala.inline
  def apply(
    WSSession: Double,
    WSVersion: String,
    bChrome: Boolean,
    bEdge: Boolean,
    bFileSystem: Boolean,
    bFirefox: Boolean,
    bIE: Boolean,
    bLinux: Boolean,
    bMac: Boolean,
    bMobile: Boolean,
    bSafari: Boolean,
    bWin: Boolean,
    bWin64: Boolean,
    basePath: String,
    iPluginLength: Double,
    isDesktopViewer: () => Boolean,
    isMobileViewer: () => Boolean,
    isPadViewer: () => Boolean,
    isX64: Boolean,
    macOSX: String,
    osVersion: String,
    pathType: Double,
    strChromeVersion: Double | String,
    strFirefoxVersion: Double | String,
    strIEVersion: Double | String
  ): DSLibEnv = {
    val __obj = js.Dynamic.literal(WSSession = WSSession.asInstanceOf[js.Any], WSVersion = WSVersion.asInstanceOf[js.Any], bChrome = bChrome.asInstanceOf[js.Any], bEdge = bEdge.asInstanceOf[js.Any], bFileSystem = bFileSystem.asInstanceOf[js.Any], bFirefox = bFirefox.asInstanceOf[js.Any], bIE = bIE.asInstanceOf[js.Any], bLinux = bLinux.asInstanceOf[js.Any], bMac = bMac.asInstanceOf[js.Any], bMobile = bMobile.asInstanceOf[js.Any], bSafari = bSafari.asInstanceOf[js.Any], bWin = bWin.asInstanceOf[js.Any], bWin64 = bWin64.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], iPluginLength = iPluginLength.asInstanceOf[js.Any], isDesktopViewer = js.Any.fromFunction0(isDesktopViewer), isMobileViewer = js.Any.fromFunction0(isMobileViewer), isPadViewer = js.Any.fromFunction0(isPadViewer), isX64 = isX64.asInstanceOf[js.Any], macOSX = macOSX.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any], strChromeVersion = strChromeVersion.asInstanceOf[js.Any], strFirefoxVersion = strFirefoxVersion.asInstanceOf[js.Any], strIEVersion = strIEVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSLibEnv]
  }
  @scala.inline
  implicit class DSLibEnvOps[Self <: DSLibEnv] (val x: Self) extends AnyVal {
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
    def setWSSession(value: Double): Self = this.set("WSSession", value.asInstanceOf[js.Any])
    @scala.inline
    def setWSVersion(value: String): Self = this.set("WSVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBChrome(value: Boolean): Self = this.set("bChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setBEdge(value: Boolean): Self = this.set("bEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setBFileSystem(value: Boolean): Self = this.set("bFileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setBFirefox(value: Boolean): Self = this.set("bFirefox", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIE(value: Boolean): Self = this.set("bIE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBLinux(value: Boolean): Self = this.set("bLinux", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMac(value: Boolean): Self = this.set("bMac", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMobile(value: Boolean): Self = this.set("bMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSafari(value: Boolean): Self = this.set("bSafari", value.asInstanceOf[js.Any])
    @scala.inline
    def setBWin(value: Boolean): Self = this.set("bWin", value.asInstanceOf[js.Any])
    @scala.inline
    def setBWin64(value: Boolean): Self = this.set("bWin64", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPluginLength(value: Double): Self = this.set("iPluginLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDesktopViewer(value: () => Boolean): Self = this.set("isDesktopViewer", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMobileViewer(value: () => Boolean): Self = this.set("isMobileViewer", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPadViewer(value: () => Boolean): Self = this.set("isPadViewer", js.Any.fromFunction0(value))
    @scala.inline
    def setIsX64(value: Boolean): Self = this.set("isX64", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacOSX(value: String): Self = this.set("macOSX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathType(value: Double): Self = this.set("pathType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrChromeVersion(value: Double | String): Self = this.set("strChromeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrFirefoxVersion(value: Double | String): Self = this.set("strFirefoxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrIEVersion(value: Double | String): Self = this.set("strIEVersion", value.asInstanceOf[js.Any])
  }
  
}

