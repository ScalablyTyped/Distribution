package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedConfiguration extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfiguration". */
  var kind: js.UndefOr[String] = js.undefined
  /** The set of managed properties for this configuration. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  /** The ID of the product that the managed configuration is for, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}

object ManagedConfiguration {
  @scala.inline
  def apply(kind: String = null, managedProperty: js.Array[ManagedProperty] = null, productId: String = null): ManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedConfiguration]
  }
}

