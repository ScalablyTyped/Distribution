package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WebHost")
@js.native
class WebHost protected () extends js.Object {
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
/* static members */
@JSImport("gitana", "WebHost")
@js.native
object WebHost extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
