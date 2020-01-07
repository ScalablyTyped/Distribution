package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bundle of managed properties.
  */
@js.native
trait Schema$ManagedPropertyBundle extends js.Object {
  /**
    * The list of managed properties.
    */
  var managedProperty: js.UndefOr[js.Array[Schema$ManagedProperty]] = js.native
}

object Schema$ManagedPropertyBundle {
  @scala.inline
  def apply(managedProperty: js.Array[Schema$ManagedProperty] = null): Schema$ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedPropertyBundle]
  }
}

