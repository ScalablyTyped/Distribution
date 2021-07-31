package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Registrar")
@js.native
class Registrar protected () extends StObject {
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
object Registrar {
  
  @JSImport("gitana", "Registrar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
