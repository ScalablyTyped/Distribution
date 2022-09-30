package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Tenant")
@js.native
open class Tenant protected () extends StObject {
  def this(registrar: Any, `object`: Any) = this()
  
  def attach(attachmentId: Any, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def getDnsSlug(): Any = js.native
  
  def getPlanKey(): Any = js.native
  
  def getPlatformId(): Any = js.native
  
  def getPrincipalDomainId(): Any = js.native
  
  def getPrincipalId(): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listAllocatedApplicationObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedClientObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedDirectoryObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedDomainObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedObjects(callback: Any, objectType: Any, pagination: Any): Any = js.native
  
  def listAllocatedRegistrarObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedRepositoryObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedStackObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAllocatedVaultObjects(callback: Any, pagination: Any): Any = js.native
  
  def listAttachments(local: Any): Any = js.native
  
  def listAutoClientMappingObjects(callback: Any, pagination: Any): Any = js.native
  
  def readDefaultAllocatedClientObject(callback: Any): Any = js.native
  
  def readTenantPlan(): Any = js.native
  
  def readTenantPrincipal(): Any = js.native
  
  def unattach(attachmentId: Any): Any = js.native
}
object Tenant {
  
  @JSImport("gitana", "Tenant")
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
