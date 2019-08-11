package typings.gitlab.distServicesUserEmailsMod

import typings.gitlab.Anon_UserId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEmails extends BaseService {
  def add(email: js.Any): js.Promise[js.Object] = js.native
  def add(email: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(): js.Promise[GetResponse] = js.native
  def all(hasUserIdOptions: Anon_UserId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def remove(emailId: js.Any): js.Promise[js.Object] = js.native
  def remove(emailId: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(emailId: js.Any): js.Promise[GetResponse] = js.native
  def show(emailId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
}

