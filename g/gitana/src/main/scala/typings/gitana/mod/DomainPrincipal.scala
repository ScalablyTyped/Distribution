package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "DomainPrincipal")
@js.native
open class DomainPrincipal protected () extends StObject {
  def this(domain: Any, `object`: Any) = this()
  
  def attach(attachmentId: Any, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def beforeChainRun(): Unit = js.native
  
  def getDomainQualifiedId(): Any = js.native
  
  def getDomainQualifiedName(): Any = js.native
  
  def getName(): Any = js.native
  
  def getPreviewUri(name: Any, config: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listAttachments(local: Any): Any = js.native
  
  def listAuthenticationGrants(pagination: Any): Any = js.native
  
  def listMemberships(indirect: Any, pagination: Any): Any = js.native
  
  def listTeamMemberships(teamable: Any, pagination: Any): Any = js.native
  
  def unattach(attachmentId: Any): Any = js.native
}
object DomainPrincipal {
  
  @JSImport("gitana", "DomainPrincipal")
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
