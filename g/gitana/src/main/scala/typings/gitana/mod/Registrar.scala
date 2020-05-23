package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Registrar")
@js.native
class Registrar protected () extends js.Object {
  def this(platform: js.Any, `object`: js.Any) = this()
  def base(): Unit = js.native
  def checkMeterAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkMeterPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkPlanAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkPlanPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkTenantAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkTenantPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def createMeter(`object`: js.Any): js.Any = js.native
  def createPlan(`object`: js.Any): js.Any = js.native
  def createTenant(principal: js.Any, planKey: js.Any, paymentMethod: js.Any): js.Any = js.native
  def getType(): js.Any = js.native
  def getUri(): js.Any = js.native
  def listMeters(pagination: js.Any): js.Any = js.native
  def listPlans(pagination: js.Any): js.Any = js.native
  def listTenants(pagination: js.Any): js.Any = js.native
  def lookupTenantForPrincipal(principal: js.Any): js.Any = js.native
  def queryMeters(query: js.Any, pagination: js.Any): js.Any = js.native
  def queryPlans(query: js.Any, pagination: js.Any): js.Any = js.native
  def queryTenants(query: js.Any, pagination: js.Any): js.Any = js.native
  def readMeter(meterId: js.Any): js.Any = js.native
  def readPlan(planId: js.Any): js.Any = js.native
  def readTenant(tenantId: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Registrar")
@js.native
object Registrar extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

