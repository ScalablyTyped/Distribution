package typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.atFirebaseComponentMod

import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var remoteConfig: RemoteConfig
}

object NameServiceMapping {
  @scala.inline
  def apply(remoteConfig: RemoteConfig): NameServiceMapping = {
    val __obj = js.Dynamic.literal(remoteConfig = remoteConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

