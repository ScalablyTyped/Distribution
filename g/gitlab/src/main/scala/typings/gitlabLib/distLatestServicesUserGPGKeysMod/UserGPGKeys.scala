package typings
package gitlabLib.distLatestServicesUserGPGKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGPGKeys
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def add(title: java.lang.String, key: java.lang.String): js.Promise[_] = js.native
  def add(
    title: java.lang.String,
    key: java.lang.String,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def all(): js.Promise[_] = js.native
  def all(
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def remove(keyId: java.lang.String): js.Promise[_] = js.native
  def remove(
    keyId: java.lang.String,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def show(keyId: java.lang.String): js.Promise[_] = js.native
  def show(
    keyId: java.lang.String,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
}

