package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProgress extends js.Object {
  /**
    * Whether the request is currently active. If this is false no other properties
    * will be set
    */
  var active: Boolean = js.native
  /**
    * The number of bytes that have been uploaded so far
    */
  var current: Double = js.native
  /**
    * Whether the upload has started. If this is false both `current` and `total` will
    * be set to 0.
    */
  var started: Boolean = js.native
  /**
    * The number of bytes that will be uploaded this request
    */
  var total: Double = js.native
}

object UploadProgress {
  @scala.inline
  def apply(active: Boolean, current: Double, started: Boolean, total: Double): UploadProgress = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
  @scala.inline
  implicit class UploadProgressOps[Self <: UploadProgress] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarted(value: Boolean): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

