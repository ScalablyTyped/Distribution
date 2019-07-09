package typings
package gitlabLib.distServicesUserImpersonationTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImpersonationTokens
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(
    userId: gitlabLib.distServicesMod.UserId,
    name: java.lang.String,
    scopes: gitlabLib.distServicesMod.ImpersonationTokenScope,
    expiresAt: java.lang.String
  ): js.Promise[js.Object] = js.native
  def add(
    userId: gitlabLib.distServicesMod.UserId,
    name: java.lang.String,
    scopes: gitlabLib.distServicesMod.ImpersonationTokenScope,
    expiresAt: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def all(userId: gitlabLib.distServicesMod.UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def revoke(userId: gitlabLib.distServicesMod.UserId, tokenId: gitlabLib.distServicesMod.ImpersonationTokenId): js.Promise[js.Object] = js.native
  def revoke(
    userId: gitlabLib.distServicesMod.UserId,
    tokenId: gitlabLib.distServicesMod.ImpersonationTokenId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(userId: gitlabLib.distServicesMod.UserId, tokenId: gitlabLib.distServicesMod.ImpersonationTokenId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    userId: gitlabLib.distServicesMod.UserId,
    tokenId: gitlabLib.distServicesMod.ImpersonationTokenId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

