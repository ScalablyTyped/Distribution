package typings
package gitlabLib.distServicesUserGPGKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGPGKeys
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
  def add(
    title: js.Any,
    key: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(keyId: js.Any): js.Promise[js.Object] = js.native
  def remove(keyId: js.Any, hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(keyId: js.Any): js.Promise[gitlabLib.GetResponse] = js.native
  def show(keyId: js.Any, hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

