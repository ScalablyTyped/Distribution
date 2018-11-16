package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstallsListResponse extends js.Object {
  /** An installation of an app for a user on a specific device. The existence of an install implies that the user must have an entitlement to the app. */
  var install: js.UndefOr[js.Array[Install]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#installsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

