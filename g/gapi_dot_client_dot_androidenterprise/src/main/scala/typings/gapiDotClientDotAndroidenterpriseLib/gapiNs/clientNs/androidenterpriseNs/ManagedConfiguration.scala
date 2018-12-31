package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedConfiguration extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfiguration". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The set of managed properties for this configuration. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  /** The ID of the product that the managed configuration is for, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

