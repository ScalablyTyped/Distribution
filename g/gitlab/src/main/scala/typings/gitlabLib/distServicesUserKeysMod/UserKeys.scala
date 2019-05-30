package typings
package gitlabLib.distServicesUserKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserKeys
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
  def create(
    title: js.Any,
    key: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(keyId: js.Any): js.Promise[js.Object] = js.native
  def remove(keyId: js.Any, hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(keyId: js.Any): js.Promise[gitlabLib.GetResponse] = js.native
  def show(keyId: js.Any, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

