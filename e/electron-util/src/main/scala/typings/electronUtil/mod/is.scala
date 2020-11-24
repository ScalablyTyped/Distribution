package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-util", "is")
@js.native
object is extends js.Object {
  
  /**
  	Running in development, not in production.
  	*/
  val development: Boolean = js.native
  
  /**
  	Running on Linux.
  	*/
  val linux: Boolean = js.native
  
  /**
  	The app is an Mac App Store build.
  	*/
  val macAppStore: Boolean = js.native
  
  /**
  	Running on macOS.
  	*/
  val macos: Boolean = js.native
  
  /**
  	Running on the [main process](https://electronjs.org/docs/tutorial/quick-start/#main-process).
  	*/
  val main: Boolean = js.native
  
  /**
  	Running on the [renderer process](https://electronjs.org/docs/tutorial/quick-start/#renderer-process).
  	*/
  val renderer: Boolean = js.native
  
  /**
  	The app is using [ASAR](https://electronjs.org/docs/tutorial/application-packaging/).
  	*/
  val usingAsar: Boolean = js.native
  
  /**
  	Running on Windows.
  	*/
  val windows: Boolean = js.native
  
  /**
  	The app is a Windows Store AppX build.
  	*/
  val windowsStore: Boolean = js.native
}
