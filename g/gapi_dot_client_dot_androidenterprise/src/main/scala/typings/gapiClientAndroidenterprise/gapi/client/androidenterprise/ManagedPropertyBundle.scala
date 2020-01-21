package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedPropertyBundle extends js.Object {
  /** The list of managed properties. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
}

object ManagedPropertyBundle {
  @scala.inline
  def apply(managedProperty: js.Array[ManagedProperty] = null): ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedPropertyBundle]
  }
}

