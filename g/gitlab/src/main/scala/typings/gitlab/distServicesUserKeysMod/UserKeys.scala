package typings.gitlab.distServicesUserKeysMod

import typings.gitlab.Anon_UserId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserKeys extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(hasUserIdOptions: Anon_UserId with PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
  def create(title: js.Any, key: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(keyId: js.Any): js.Promise[js.Object] = js.native
  def remove(keyId: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(keyId: js.Any): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(keyId: js.Any, options: BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

