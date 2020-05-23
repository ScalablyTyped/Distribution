package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "AbstractSelfableACLObject")
@js.native
class AbstractSelfableACLObject protected () extends AbstractSelfableObject {
  def this(driver: js.Any, `object`: js.Any) = this()
  def checkAuthority(principal: js.Any, authorityId: js.Any, callback: js.Any): js.Any = js.native
  def checkPermission(principal: js.Any, permissionId: js.Any, callback: js.Any): js.Any = js.native
  def grantAuthority(principal: js.Any, authorityId: js.Any): js.Any = js.native
  def listAuthorities(principal: js.Any, callback: js.Any): js.Any = js.native
  def loadACL(callback: js.Any): js.Any = js.native
  def loadAuthorityGrants(principalIds: js.Any, callback: js.Any): js.Any = js.native
  def revokeAllAuthorities(principal: js.Any): js.Any = js.native
  def revokeAuthority(principal: js.Any, authorityId: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "AbstractSelfableACLObject")
@js.native
object AbstractSelfableACLObject extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

