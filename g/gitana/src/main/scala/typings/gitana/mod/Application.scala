package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Application")
@js.native
open class Application protected () extends AbstractPlatformObject {
  def this(platform: Any, `object`: Any) = this()
  
  def checkEmailAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkEmailPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkEmailProviderAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkEmailProviderPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkMessageAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkMessagePermissions(checks: Any, callback: Any): Any = js.native
  
  def checkPageRenditionAuthorities(deploymentKey: Any, checks: Any, callback: Any): Any = js.native
  
  def checkPageRenditionPermissions(deploymentKey: Any, checks: Any, callback: Any): Any = js.native
  
  def checkRegistrationAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkRegistrationPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkSettingAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkSettingPermissions(checks: Any, callback: Any): Any = js.native
  
  def createEmail(`object`: Any): Any = js.native
  
  def createEmailProvider(`object`: Any): Any = js.native
  
  def createMessage(`object`: Any): Any = js.native
  
  def createPageRendition(deploymentKey: Any, `object`: Any): Any = js.native
  
  def createRegistration(`object`: Any): Any = js.native
  
  def createSettings(`object`: Any): Any = js.native
  
  def deploy(deploymentKey: Any): Any = js.native
  
  def findDeployedApplication(deploymentKey: Any): Any = js.native
  
  def invalidateAllPageRenditions(deploymentKey: Any): Any = js.native
  
  def listAutoClientMappingObjects(callback: Any, pagination: Any): Any = js.native
  
  def listEmailProviders(pagination: Any): EmailProviderMap = js.native
  
  def listEmails(pagination: Any): EmailMap = js.native
  
  def listMessages(pagination: Any): MessageMap = js.native
  
  def listPageRenditions(deploymentKey: Any, pagination: Any): Any = js.native
  
  def listRegistrations(pagination: Any): Any = js.native
  
  def listSettings(pagination: Any): SettingsMap = js.native
  
  def listTrustedDomainMappingObjects(callback: Any, pagination: Any): Any = js.native
  
  def loadDeploymentInfo(deploymentKey: Any, callback: Any): Any = js.native
  
  def queryEmailProviders(query: Any, pagination: Any): EmailProviderMap = js.native
  
  def queryEmails(query: Any, pagination: Any): EmailMap = js.native
  
  def queryMessages(query: Any, pagination: Any): MessageMap = js.native
  
  def queryPageRenditions(deploymentKey: Any, query: Any, pagination: Any): Any = js.native
  
  def queryRegistrations(query: Any, pagination: Any): Any = js.native
  
  def querySettings(query: Any, pagination: Any): SettingsMap = js.native
  
  def readApplicationPrincipalSettings(args: Any*): Any = js.native
  
  def readApplicationSettings(scope: Any, key: Any): Any = js.native
  
  def readEmail(emailId: Any): Email = js.native
  
  def readEmailProvider(emailProviderId: Any): EmailProvider = js.native
  
  def readMessage(messageId: Any): Message = js.native
  
  def readPageRendition(deploymentKey: Any, pageRenditionIdOrKey: Any): Any = js.native
  
  def readRegistration(registrationId: Any): Any = js.native
  
  def readSettings(settingId: Any): Any = js.native
  
  def refreshDeploymentKeys(deploymentKey: Any): Any = js.native
  
  def undeploy(deploymentKey: Any): Any = js.native
}
object Application {
  
  @JSImport("gitana", "Application")
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
