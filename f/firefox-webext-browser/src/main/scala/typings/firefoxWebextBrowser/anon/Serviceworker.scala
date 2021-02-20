package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serviceworker extends StObject {
  
  var service_worker: ExtensionURL = js.native
}
object Serviceworker {
  
  @scala.inline
  def apply(service_worker: ExtensionURL): Serviceworker = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceworker]
  }
  
  @scala.inline
  implicit class ServiceworkerMutableBuilder[Self <: Serviceworker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
  }
}
