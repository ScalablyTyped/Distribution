package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Application extends js.Object {
  /** The set of managed properties available to be pre-configured for the application. */
  var managedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  /** The name of the application in the form enterprises/{enterpriseId}/applications/{package_name} */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The permissions required by the app. */
  var permissions: js.UndefOr[js.Array[ApplicationPermission]] = js.undefined
  /** The title of the application. Localized. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

