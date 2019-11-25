package typings.fbDashWatchman.fbDashWatchmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * Absolute path to the watchman binary.
    * If not provided, the Client locates the binary using the PATH specified
    * by the node child_process's default env.
    */
  var watchmanBinaryPath: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(watchmanBinaryPath: String = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (watchmanBinaryPath != null) __obj.updateDynamic("watchmanBinaryPath")(watchmanBinaryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

