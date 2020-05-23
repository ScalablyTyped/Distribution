package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "AuthInfo")
@js.native
class AuthInfo protected () extends js.Object {
  def this(`object`: js.Any) = this()
  def base(): Unit = js.native
  def getClientId(): js.Any = js.native
  def getPrincipalDomainId(): js.Any = js.native
  def getPrincipalId(): js.Any = js.native
  def getPrincipalName(): js.Any = js.native
  def getTenantDescription(): js.Any = js.native
  def getTenantId(): js.Any = js.native
  def getTenantTitle(): js.Any = js.native
  def getTicket(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "AuthInfo")
@js.native
object AuthInfo extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

