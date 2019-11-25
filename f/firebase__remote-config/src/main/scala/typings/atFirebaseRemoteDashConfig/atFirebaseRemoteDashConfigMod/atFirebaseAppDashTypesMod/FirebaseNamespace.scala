package typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigMod.atFirebaseAppDashTypesMod

import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var remoteConfig: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], RemoteConfig]] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(remoteConfig: /* app */ js.UndefOr[FirebaseApp] => RemoteConfig = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (remoteConfig != null) __obj.updateDynamic("remoteConfig")(js.Any.fromFunction1(remoteConfig))
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

