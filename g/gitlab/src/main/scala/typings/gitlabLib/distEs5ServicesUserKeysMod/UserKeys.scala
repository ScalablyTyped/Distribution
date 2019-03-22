package typings
package gitlabLib.distEs5ServicesUserKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserKeys
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  /** Add SSH key for user */
  def create(title: java.lang.String, key: KeyId): js.Promise[_] = js.native
  def create(
    title: java.lang.String,
    key: KeyId,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def remove(keyId: KeyId): js.Promise[_] = js.native
  def remove(
    keyId: KeyId,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def show(keyId: KeyId): js.Promise[_] = js.native
}

