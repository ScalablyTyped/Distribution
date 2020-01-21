package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/remote_config_fetch_client", "RemoteConfigAbortSignal")
@js.native
class RemoteConfigAbortSignal () extends js.Object {
  var listeners: js.Array[js.Function0[Unit]] = js.native
  def abort(): Unit = js.native
  def addEventListener(listener: js.Function0[Unit]): Unit = js.native
}

