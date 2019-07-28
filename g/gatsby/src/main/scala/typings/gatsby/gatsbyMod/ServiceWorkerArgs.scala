package typings.gatsby.gatsbyMod

import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerArgs extends BrowserPluginArgs {
  var serviceWorker: ServiceWorkerRegistration
}

object ServiceWorkerArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    serviceWorker: ServiceWorkerRegistration
  ): ServiceWorkerArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname, getResourcesForPathname = getResourcesForPathname, getResourcesForPathnameSync = getResourcesForPathnameSync, serviceWorker = serviceWorker)
  
    __obj.asInstanceOf[ServiceWorkerArgs]
  }
}

