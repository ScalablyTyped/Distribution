package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Application")
@js.native
class Application protected () extends AbstractPlatformObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def checkEmailAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkEmailPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkEmailProviderAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkEmailProviderPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkMessageAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkMessagePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkPageRenditionAuthorities(deploymentKey: js.Any, checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkPageRenditionPermissions(deploymentKey: js.Any, checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRegistrationAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRegistrationPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkSettingAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkSettingPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def createEmail(`object`: js.Any): js.Any = js.native
  
  def createEmailProvider(`object`: js.Any): js.Any = js.native
  
  def createMessage(`object`: js.Any): js.Any = js.native
  
  def createPageRendition(deploymentKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def createRegistration(`object`: js.Any): js.Any = js.native
  
  def createSettings(`object`: js.Any): js.Any = js.native
  
  def deploy(deploymentKey: js.Any): js.Any = js.native
  
  def findDeployedApplication(deploymentKey: js.Any): js.Any = js.native
  
  def invalidateAllPageRenditions(deploymentKey: js.Any): js.Any = js.native
  
  def listAutoClientMappingObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  
  def listEmailProviders(pagination: js.Any): EmailProviderMap = js.native
  
  def listEmails(pagination: js.Any): EmailMap = js.native
  
  def listMessages(pagination: js.Any): MessageMap = js.native
  
  def listPageRenditions(deploymentKey: js.Any, pagination: js.Any): js.Any = js.native
  
  def listRegistrations(pagination: js.Any): js.Any = js.native
  
  def listSettings(pagination: js.Any): SettingsMap = js.native
  
  def listTrustedDomainMappingObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  
  def loadDeploymentInfo(deploymentKey: js.Any, callback: js.Any): js.Any = js.native
  
  def queryEmailProviders(query: js.Any, pagination: js.Any): EmailProviderMap = js.native
  
  def queryEmails(query: js.Any, pagination: js.Any): EmailMap = js.native
  
  def queryMessages(query: js.Any, pagination: js.Any): MessageMap = js.native
  
  def queryPageRenditions(deploymentKey: js.Any, query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryRegistrations(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def querySettings(query: js.Any, pagination: js.Any): SettingsMap = js.native
  
  def readApplicationPrincipalSettings(args: js.Any*): js.Any = js.native
  
  def readApplicationSettings(scope: js.Any, key: js.Any): js.Any = js.native
  
  def readEmail(emailId: js.Any): Email = js.native
  
  def readEmailProvider(emailProviderId: js.Any): EmailProvider = js.native
  
  def readMessage(messageId: js.Any): Message = js.native
  
  def readPageRendition(deploymentKey: js.Any, pageRenditionIdOrKey: js.Any): js.Any = js.native
  
  def readRegistration(registrationId: js.Any): js.Any = js.native
  
  def readSettings(settingId: js.Any): js.Any = js.native
  
  def refreshDeploymentKeys(deploymentKey: js.Any): js.Any = js.native
  
  def undeploy(deploymentKey: js.Any): js.Any = js.native
}
object Application {
  
  /* static member */
  @JSImport("gitana", "Application.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Application.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Application.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Application.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Application.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
