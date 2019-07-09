package typings
package gitlabLib.distServicesUserEmailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEmails
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(email: js.Any): js.Promise[js.Object] = js.native
  def add(
    email: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(emailId: js.Any): js.Promise[js.Object] = js.native
  def remove(
    emailId: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(emailId: js.Any): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(emailId: js.Any, options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

