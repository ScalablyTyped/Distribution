package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bundle of managed properties.
  */
@js.native
trait SchemaManagedPropertyBundle extends js.Object {
  /**
    * The list of managed properties.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
}

object SchemaManagedPropertyBundle {
  @scala.inline
  def apply(managedProperty: js.Array[SchemaManagedProperty] = null): SchemaManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedPropertyBundle]
  }
}

