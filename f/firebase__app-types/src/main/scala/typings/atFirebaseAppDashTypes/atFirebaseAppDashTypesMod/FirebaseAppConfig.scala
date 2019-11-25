package typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseAppConfig extends js.Object {
  var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object FirebaseAppConfig {
  @scala.inline
  def apply(automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined, name: String = null): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticDataCollectionEnabled)) __obj.updateDynamic("automaticDataCollectionEnabled")(automaticDataCollectionEnabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseAppConfig]
  }
}

