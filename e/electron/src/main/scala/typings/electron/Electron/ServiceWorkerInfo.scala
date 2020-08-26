package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/service-worker-info
  /**
    * The virtual ID of the process that this service worker is running in.  This is
    * not an OS level PID.  This aligns with the ID set used for
    * `webContents.getProcessId()`.
    */
  var renderProcessId: Double = js.native
  /**
    * The base URL that this service worker is active for.
    */
  var scope: String = js.native
  /**
    * The full URL to the script that this service worker runs
    */
  var scriptUrl: String = js.native
}

object ServiceWorkerInfo {
  @scala.inline
  def apply(renderProcessId: Double, scope: String, scriptUrl: String): ServiceWorkerInfo = {
    val __obj = js.Dynamic.literal(renderProcessId = renderProcessId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scriptUrl = scriptUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerInfo]
  }
  @scala.inline
  implicit class ServiceWorkerInfoOps[Self <: ServiceWorkerInfo] (val x: Self) extends AnyVal {
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
    def setRenderProcessId(value: Double): Self = this.set("renderProcessId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptUrl(value: String): Self = this.set("scriptUrl", value.asInstanceOf[js.Any])
  }
  
}

