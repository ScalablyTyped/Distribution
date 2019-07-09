package typings
package gitlabLib.distServicesUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users
  extends gitlabLib.distInfrastructureMod.BaseService {
  def activities(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def activities(options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def block(userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def block(userId: gitlabLib.distServicesMod.UserId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
  def current(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def current(options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def edit(
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def events(userId: gitlabLib.distServicesMod.UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def events(
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions with gitlabLib.distServicesMod.EventOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def projects(userId: gitlabLib.distServicesMod.UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def projects(userId: gitlabLib.distServicesMod.UserId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def remove(userId: gitlabLib.distServicesMod.UserId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def search(emailOrUsername: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def search(emailOrUsername: java.lang.String, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def session(email: java.lang.String, password: java.lang.String): js.Promise[js.Object] = js.native
  def session(email: java.lang.String, password: java.lang.String, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def show(userId: gitlabLib.distServicesMod.UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def unblock(userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def unblock(userId: gitlabLib.distServicesMod.UserId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

