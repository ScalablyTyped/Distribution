package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ImpersonationTokenId
import typings.gitlab.distSrcCoreServicesMod.ImpersonationTokenScope
import typings.gitlab.distSrcCoreServicesMod.UserId
import typings.gitlab.distSrcCoreServicesUserImpersonationTokensMod.UserImpersonationTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/UserImpersonationTokens", JSImport.Namespace)
@js.native
object distSrcCoreServicesUserImpersonationTokensMod extends js.Object {
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
  
  @js.native
  class default () extends UserImpersonationTokens
  
}

