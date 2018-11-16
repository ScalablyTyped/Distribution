package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManagedProperty extends js.Object {
  /** The unique key that identifies the property. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The boolean value - this will only be present if type of the property is bool. */
  var valueBool: js.UndefOr[scala.Boolean] = js.undefined
  /** The bundle of managed properties - this will only be present if type of the property is bundle. */
  var valueBundle: js.UndefOr[ManagedPropertyBundle] = js.undefined
  /** The list of bundles of properties - this will only be present if type of the property is bundle_array. */
  var valueBundleArray: js.UndefOr[js.Array[ManagedPropertyBundle]] = js.undefined
  /** The integer value - this will only be present if type of the property is integer. */
  var valueInteger: js.UndefOr[scala.Double] = js.undefined
  /** The string value - this will only be present if type of the property is string, choice or hidden. */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /** The list of string values - this will only be present if type of the property is multiselect. */
  var valueStringArray: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

