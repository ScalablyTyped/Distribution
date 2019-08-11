package typings.gitlab.distServicesUserImpersonationTokensMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ImpersonationTokenId
import typings.gitlab.distServicesMod.ImpersonationTokenScope
import typings.gitlab.distServicesMod.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImpersonationTokens extends BaseService {
  def add(userId: UserId, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
  def add(userId: UserId, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
  def all(userId: UserId): js.Promise[GetResponse] = js.native
  def all(userId: UserId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def revoke(userId: UserId, tokenId: ImpersonationTokenId): js.Promise[js.Object] = js.native
  def revoke(userId: UserId, tokenId: ImpersonationTokenId, options: Sudo): js.Promise[js.Object] = js.native
  def show(userId: UserId, tokenId: ImpersonationTokenId): js.Promise[GetResponse] = js.native
  def show(userId: UserId, tokenId: ImpersonationTokenId, options: Sudo): js.Promise[GetResponse] = js.native
}

