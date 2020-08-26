package typings.electron.Electron

import typings.electron.electronStrings.default
import typings.electron.electronStrings.everything
import typings.electron.electronStrings.includeSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLoggingOptions extends js.Object {
  /**
    * What kinds of data should be captured. By default, only metadata about requests
    * will be captured. Setting this to `includeSensitive` will include cookies and
    * authentication data. Setting it to `everything` will include all bytes
    * transferred on sockets. Can be `default`, `includeSensitive` or `everything`.
    */
  var captureMode: js.UndefOr[default | includeSensitive | everything] = js.native
  /**
    * When the log grows beyond this size, logging will automatically stop. Defaults
    * to unlimited.
    */
  var maxFileSize: js.UndefOr[Double] = js.native
}

object StartLoggingOptions {
  @scala.inline
  def apply(): StartLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLoggingOptions]
  }
  @scala.inline
  implicit class StartLoggingOptionsOps[Self <: StartLoggingOptions] (val x: Self) extends AnyVal {
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
    def setCaptureMode(value: default | includeSensitive | everything): Self = this.set("captureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureMode: Self = this.set("captureMode", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
  }
  
}

