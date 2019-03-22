package typings
package gitlabLib.distEs5ServicesUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def activities(): js.Promise[_] = js.native
  def all(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def block(userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any): js.Promise[_] = js.native
  def create(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def current(): js.Promise[_] = js.native
  def edit(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def events(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions with gitlabLib.distEs5ServicesEventsMod.EventOptions
  ): js.Promise[_] = js.native
  def projects(userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any): js.Promise[_] = js.native
  def remove(userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any): js.Promise[_] = js.native
  def search(emailOrUsername: java.lang.String): js.Promise[_] = js.native
  def session(email: java.lang.String, password: java.lang.String): js.Promise[_] = js.native
  def show(
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def unblock(userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any): js.Promise[_] = js.native
}

