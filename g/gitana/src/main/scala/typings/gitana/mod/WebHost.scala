package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WebHost")
@js.native
open class WebHost protected () extends StObject {
  def this(platform: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def checkAutoClientMappingsAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkAutoClientMappingsPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkDeployedApplicationsAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkDeployedApplicationsPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkTrustedDomainMappingsAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkTrustedDomainMappingsPermissions(checks: Any, callback: Any): Any = js.native
  
  def createAutoClientMapping(host: Any, applicationId: Any, clientKey: Any, authGrantKey: Any, `object`: Any): Any = js.native
  
  def createTrustedDomainMapping(host: Any, scope: Any, platformId: Any, `object`: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def getUrlPatterns(): Any = js.native
  
  def listAutoClientMappings(pagination: Any): Any = js.native
  
  def listDeployedApplications(pagination: Any): Any = js.native
  
  def listTrustedDomainMappings(pagination: Any): Any = js.native
  
  def queryAutoClientMappings(query: Any, pagination: Any): Any = js.native
  
  def queryDeployedApplications(query: Any, pagination: Any): Any = js.native
  
  def queryTrustedDomainMappings(query: Any, pagination: Any): Any = js.native
  
  def readAutoClientMapping(autoClientMappingId: Any): Any = js.native
  
  def readDeployedApplication(deployedApplicationId: Any): Any = js.native
  
  def readTrustedDomainMapping(trustedDomainMappingId: Any): Any = js.native
}
object WebHost {
  
  @JSImport("gitana", "WebHost")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
