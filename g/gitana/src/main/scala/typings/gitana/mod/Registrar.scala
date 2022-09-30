package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Registrar")
@js.native
open class Registrar protected () extends StObject {
  def this(platform: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def checkMeterAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkMeterPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkPlanAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkPlanPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkTenantAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkTenantPermissions(checks: Any, callback: Any): Any = js.native
  
  def createMeter(`object`: Any): Any = js.native
  
  def createPlan(`object`: Any): Any = js.native
  
  def createTenant(principal: Any, planKey: Any, paymentMethod: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listMeters(pagination: Any): Any = js.native
  
  def listPlans(pagination: Any): Any = js.native
  
  def listTenants(pagination: Any): Any = js.native
  
  def lookupTenantForPrincipal(principal: Any): Any = js.native
  
  def queryMeters(query: Any, pagination: Any): Any = js.native
  
  def queryPlans(query: Any, pagination: Any): Any = js.native
  
  def queryTenants(query: Any, pagination: Any): Any = js.native
  
  def readMeter(meterId: Any): Any = js.native
  
  def readPlan(planId: Any): Any = js.native
  
  def readTenant(tenantId: Any): Any = js.native
}
object Registrar {
  
  @JSImport("gitana", "Registrar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
