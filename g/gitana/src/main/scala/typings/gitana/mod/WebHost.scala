package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WebHost")
@js.native
class WebHost protected () extends StObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def checkAutoClientMappingsAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkAutoClientMappingsPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeployedApplicationsAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeployedApplicationsPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkTrustedDomainMappingsAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkTrustedDomainMappingsPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def createAutoClientMapping(host: js.Any, applicationId: js.Any, clientKey: js.Any, authGrantKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def createTrustedDomainMapping(host: js.Any, scope: js.Any, platformId: js.Any, `object`: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def getUrlPatterns(): js.Any = js.native
  
  def listAutoClientMappings(pagination: js.Any): js.Any = js.native
  
  def listDeployedApplications(pagination: js.Any): js.Any = js.native
  
  def listTrustedDomainMappings(pagination: js.Any): js.Any = js.native
  
  def queryAutoClientMappings(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDeployedApplications(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryTrustedDomainMappings(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def readAutoClientMapping(autoClientMappingId: js.Any): js.Any = js.native
  
  def readDeployedApplication(deployedApplicationId: js.Any): js.Any = js.native
  
  def readTrustedDomainMapping(trustedDomainMappingId: js.Any): js.Any = js.native
}
object WebHost {
  
  /* static member */
  @JSImport("gitana", "WebHost.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WebHost.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "WebHost.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WebHost.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WebHost.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
