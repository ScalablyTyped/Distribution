package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Remote extends MainInterface {
  /**
       * The process object in the main process. This is the same as
       * remote.getGlobal('process') but is cached.
       */
  var process: js.UndefOr[js.Any] = js.undefined
  // Docs: http://electronjs.org/docs/api/remote
  def getCurrentWebContents(): WebContents
  /**
       * Note: Do not use removeAllListeners on BrowserWindow. Use of this can remove all
       * blur listeners, disable click events on touch bar buttons, and other unintended
       * consequences.
       */
  def getCurrentWindow(): BrowserWindow
  def getGlobal(name: java.lang.String): js.Any
  /**
       * e.g.
       */
  def require(module: java.lang.String): js.Any
}

