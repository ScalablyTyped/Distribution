package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#entitlement". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the product that the entitlement is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The reason for the entitlement. For example, "free" for free apps. This property is temporary: it will be replaced by the acquisition kind field of
    * group licenses.
    */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

