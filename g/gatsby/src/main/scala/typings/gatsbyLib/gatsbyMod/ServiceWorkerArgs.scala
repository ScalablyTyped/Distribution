package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerArgs extends BrowserPluginArgs {
  var serviceWorker: stdLib.ServiceWorkerRegistration
}

object ServiceWorkerArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    serviceWorker: stdLib.ServiceWorkerRegistration
  ): ServiceWorkerArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, serviceWorker = serviceWorker)
  
    __obj.asInstanceOf[ServiceWorkerArgs]
  }
}

