package typings
package atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseAppConfig extends js.Object {
  var automaticDataCollectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object FirebaseAppConfig {
  @scala.inline
  def apply(
    automaticDataCollectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticDataCollectionEnabled)) __obj.updateDynamic("automaticDataCollectionEnabled")(automaticDataCollectionEnabled)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FirebaseAppConfig]
  }
}

