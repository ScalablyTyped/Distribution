package typings
package gitlabLib.distEs5ServicesUserImpersonationTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImpersonationTokens
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  /**
    * It creates a new impersonation token. Note that only administrators can do this.
    * You are only able to create impersonation tokens to impersonate the user and perform
    * both API calls and Git reads and writes. The user will not see these tokens
    * in their profile settings page.
    * @param userId UserId
    * @param name The name of the impersonation token
    * @param scopes The array of scopes of the impersonation token (api, read_user)
    * @param expiresAt The expiration date of the impersonation token in ISO format (YYYY-MM-DD)
    */
  def add(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    name: java.lang.String,
    scopes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any,
    expiresAt: java.lang.String
  ): js.Promise[_] = js.native
  def all(userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any): js.Promise[_] = js.native
  def revoke(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    tokenId: ImpersonationTokenId
  ): js.Promise[_] = js.native
  def show(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    tokenId: ImpersonationTokenId
  ): js.Promise[_] = js.native
}

