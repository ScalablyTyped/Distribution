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
  def remove(keyId: js.Any): js.Promise[js.Object] = js.native
  def remove(
    keyId: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(keyId: js.Any): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    keyId: js.Any,
    hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

