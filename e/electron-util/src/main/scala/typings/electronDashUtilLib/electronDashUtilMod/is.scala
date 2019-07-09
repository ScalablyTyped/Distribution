package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "is")
@js.native
object is extends js.Object {
  /**
  	Running in development, not in production.
  	*/
  val development: scala.Boolean = js.native
  /**
  	Running on Linux.
  	*/
  val linux: scala.Boolean = js.native
  /**
  	The app is an Mac App Store build.
  	*/
  val macAppStore: scala.Boolean = js.native
  /**
  	Running on macOS.
  	*/
  val macos: scala.Boolean = js.native
  /**
  	Running on the [main process](https://electronjs.org/docs/tutorial/quick-start/#main-process).
  	*/
  val main: scala.Boolean = js.native
  /**
  	Running on the [renderer process](https://electronjs.org/docs/tutorial/quick-start/#renderer-process).
  	*/
  val renderer: scala.Boolean = js.native
  /**
  	The app is using [ASAR](https://electronjs.org/docs/tutorial/application-packaging/).
  	*/
  val usingAsar: scala.Boolean = js.native
  /**
  	Running on Windows.
  	*/
  val windows: scala.Boolean = js.native
  /**
  	The app is a Windows Store AppX build.
  	*/
  val windowsStore: scala.Boolean = js.native
}

