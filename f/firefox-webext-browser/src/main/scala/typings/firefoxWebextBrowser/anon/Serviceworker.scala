package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serviceworker extends StObject {
  
  var service_worker: ExtensionURL
}
object Serviceworker {
  
  inline def apply(service_worker: ExtensionURL): Serviceworker = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceworker]
  }
  
  extension [Self <: Serviceworker](x: Self) {
    
    inline def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
  }
}
