package typings
package gitlabLib.distServicesUserEmailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEmails
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(email: js.Any): js.Promise[js.Object] = js.native
  def add(email: js.Any, hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(emailId: js.Any): js.Promise[js.Object] = js.native
  def remove(emailId: js.Any, hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(emailId: js.Any): js.Promise[gitlabLib.GetResponse] = js.native
  def show(emailId: js.Any, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

