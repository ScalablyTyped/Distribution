package typings.domNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistration extends StObject {
  
  /*~ https://w3c.github.io/ServiceWorker/#ref-for-dom-serviceworkerregistration-navigationpreload */
  val navigationPreload: NavigationPreloadManager
}
object ServiceWorkerRegistration {
  
  inline def apply(navigationPreload: NavigationPreloadManager): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal(navigationPreload = navigationPreload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistration]
  }
  
  extension [Self <: ServiceWorkerRegistration](x: Self) {
    
    inline def setNavigationPreload(value: NavigationPreloadManager): Self = StObject.set(x, "navigationPreload", value.asInstanceOf[js.Any])
  }
}
