package typings
package gitlabLib.distServicesUserImpersonationTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImpersonationTokens
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(
    userId: gitlabLib.UserId,
    name: java.lang.String,
    scopes: gitlabLib.ImpersonationTokenScope,
    expiresAt: java.lang.String
  ): js.Promise[js.Object] = js.native
  def add(
    userId: gitlabLib.UserId,
    name: java.lang.String,
    scopes: gitlabLib.ImpersonationTokenScope,
    expiresAt: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def all(userId: gitlabLib.UserId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(userId: gitlabLib.UserId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def revoke(userId: gitlabLib.UserId, tokenId: gitlabLib.ImpersonationTokenId): js.Promise[js.Object] = js.native
  def revoke(userId: gitlabLib.UserId, tokenId: gitlabLib.ImpersonationTokenId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(userId: gitlabLib.UserId, tokenId: gitlabLib.ImpersonationTokenId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(userId: gitlabLib.UserId, tokenId: gitlabLib.ImpersonationTokenId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

