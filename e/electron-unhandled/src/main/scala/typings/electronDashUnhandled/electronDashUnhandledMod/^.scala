package typings.electronDashUnhandled.electronDashUnhandledMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-unhandled", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Catch unhandled errors and promise rejections in your [Electron](https://electronjs.org) app.
  	You probably want to call this both in the main process and any renderer processes to catch all possible errors.
  	*/
  def apply(): Unit = js.native
  def apply(options: UnhandledOptions): Unit = js.native
  /**
  	Log an error. This does the same as with caught unhandled errors.
  	It will use the same options specified in the `unhandled()` call or the defaults.
  	@param error - Error to log.
  	*/
  def logError(error: Error): Unit = js.native
  def logError(error: Error, options: LogErrorOptions): Unit = js.native
}

