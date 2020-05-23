package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Identity")
@js.native
class Identity protected () extends js.Object {
  def this(directory: js.Any, `object`: js.Any) = this()
  def base(): Unit = js.native
  def changePassword(password: js.Any, verifyPassword: js.Any): js.Any = js.native
  def findPolicyTenants(registrarId: js.Any): js.Any = js.native
  def findPolicyUserForTenant(tenantId: js.Any): js.Any = js.native
  def findPolicyUsers(tenantId: js.Any): js.Any = js.native
  def findPolicyUsersForTenant(tenantId: js.Any): js.Any = js.native
  def getType(): js.Any = js.native
  def getUri(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Identity")
@js.native
object Identity extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

