package typings
package gitlabLib.distServicesGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
  def createLDAPLink(
    groupId: gitlabLib.distServicesMod.GroupId,
    cn: js.Any,
    groupAccess: js.Any,
    provider: java.lang.String
  ): js.Promise[js.Object] = js.native
  def createLDAPLink(
    groupId: gitlabLib.distServicesMod.GroupId,
    cn: js.Any,
    groupAccess: js.Any,
    provider: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[js.Object] = js.native
  def edit(
    groupId: gitlabLib.distServicesMod.GroupId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.distServicesMod.GroupId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def removeLDAPLink(groupId: gitlabLib.distServicesMod.GroupId, cn: js.Any): js.Promise[js.Object] = js.native
  def removeLDAPLink(
    groupId: gitlabLib.distServicesMod.GroupId,
    cn: js.Any,
    hasProviderOptions: gitlabLib.distInfrastructureMod.Sudo with gitlabLib.Anon_Provider
  ): js.Promise[js.Object] = js.native
  def search(nameOrPath: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def search(nameOrPath: java.lang.String, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    groupId: gitlabLib.distServicesMod.GroupId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def subgroups(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def subgroups(
    groupId: gitlabLib.distServicesMod.GroupId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def syncLDAP(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[js.Object] = js.native
  def syncLDAP(groupId: gitlabLib.distServicesMod.GroupId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

