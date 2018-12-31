package typings
package fbDashWatchmanLib.fbDashWatchmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * Absolute path to the watchman binary.
    * If not provided, the Client locates the binary using the PATH specified
    * by the node child_process's default env.
    */
  var watchmanBinaryPath: js.UndefOr[java.lang.String] = js.undefined
}

