package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serviceworker extends js.Object {
  
  var service_worker: ExtensionURL = js.native
}
object Serviceworker {
  
  @scala.inline
  def apply(service_worker: ExtensionURL): Serviceworker = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceworker]
  }
  
  @scala.inline
  implicit class ServiceworkerOps[Self <: Serviceworker] (val x: Self) extends AnyVal {
    
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
    def setService_worker(value: ExtensionURL): Self = this.set("service_worker", value.asInstanceOf[js.Any])
  }
}
