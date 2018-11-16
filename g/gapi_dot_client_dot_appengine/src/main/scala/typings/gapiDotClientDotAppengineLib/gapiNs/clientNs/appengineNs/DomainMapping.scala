package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DomainMapping extends js.Object {
  /** Relative name of the domain serving the application. Example: example.com. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the
               * application via this domain mapping.@OutputOnly
               */
  var resourceRecords: js.UndefOr[js.Array[ResourceRecord]] = js.undefined
  /** SSL configuration for this domain. If unconfigured, this domain will not serve with SSL. */
  var sslSettings: js.UndefOr[SslSettings] = js.undefined
}

