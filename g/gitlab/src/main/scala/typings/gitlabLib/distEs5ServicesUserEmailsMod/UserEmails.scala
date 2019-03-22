package typings
package gitlabLib.distEs5ServicesUserEmailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEmails
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def add(email: java.lang.String): js.Promise[_] = js.native
  def add(
    email: java.lang.String,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def all(): js.Promise[_] = js.native
  def all(
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def remove(emailId: java.lang.String): js.Promise[_] = js.native
  def remove(
    emailId: java.lang.String,
    hasUserId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserIdOptions */ js.Any
  ): js.Promise[_] = js.native
  def show(emailId: java.lang.String): js.Promise[_] = js.native
}

