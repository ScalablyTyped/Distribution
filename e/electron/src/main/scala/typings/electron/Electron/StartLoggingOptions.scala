package typings.electron.Electron

import typings.electron.electronStrings.default
import typings.electron.electronStrings.everything
import typings.electron.electronStrings.includeSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartLoggingOptions extends js.Object {
  /**
    * What kinds of data should be captured. By default, only metadata about requests
    * will be captured. Setting this to `includeSensitive` will include cookies and
    * authentication data. Setting it to `everything` will include all bytes
    * transferred on sockets. Can be `default`, `includeSensitive` or `everything`.
    */
  var captureMode: js.UndefOr[default | includeSensitive | everything] = js.undefined
  /**
    * When the log grows beyond this size, logging will automatically stop. Defaults
    * to unlimited.
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
}

object StartLoggingOptions {
  @scala.inline
  def apply(
    captureMode: default | includeSensitive | everything = null,
    maxFileSize: js.UndefOr[Double] = js.undefined
  ): StartLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (captureMode != null) __obj.updateDynamic("captureMode")(captureMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLoggingOptions]
  }
}

