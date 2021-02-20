package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "DomainPrincipal")
@js.native
class DomainPrincipal protected () extends StObject {
  def this(domain: js.Any, `object`: js.Any) = this()
  
  def attach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  
  def attachment(attachmentId: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def beforeChainRun(): Unit = js.native
  
  def getDomainQualifiedId(): js.Any = js.native
  
  def getDomainQualifiedName(): js.Any = js.native
  
  def getName(): js.Any = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listAttachments(local: js.Any): js.Any = js.native
  
  def listAuthenticationGrants(pagination: js.Any): js.Any = js.native
  
  def listMemberships(indirect: js.Any, pagination: js.Any): js.Any = js.native
  
  def listTeamMemberships(teamable: js.Any, pagination: js.Any): js.Any = js.native
  
  def unattach(attachmentId: js.Any): js.Any = js.native
}
object DomainPrincipal {
  
  /* static member */
  @JSImport("gitana", "DomainPrincipal.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DomainPrincipal.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "DomainPrincipal.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DomainPrincipal.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DomainPrincipal.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
