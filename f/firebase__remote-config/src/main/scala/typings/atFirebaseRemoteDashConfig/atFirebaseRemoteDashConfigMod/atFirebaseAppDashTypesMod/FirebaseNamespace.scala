package typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigMod.atFirebaseAppDashTypesMod

import typings.atFirebaseRemoteDashConfig.Fn_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var remoteConfig: js.UndefOr[Fn_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(remoteConfig: Fn_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (remoteConfig != null) __obj.updateDynamic("remoteConfig")(remoteConfig)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

