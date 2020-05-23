package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Tenant")
@js.native
class Tenant protected () extends js.Object {
  def this(registrar: js.Any, `object`: js.Any) = this()
  def attach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  def attachment(attachmentId: js.Any): js.Any = js.native
  def base(): Unit = js.native
  def getDnsSlug(): js.Any = js.native
  def getPlanKey(): js.Any = js.native
  def getPlatformId(): js.Any = js.native
  def getPrincipalDomainId(): js.Any = js.native
  def getPrincipalId(): js.Any = js.native
  def getType(): js.Any = js.native
  def getUri(): js.Any = js.native
  def listAllocatedApplicationObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedClientObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedDirectoryObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedDomainObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedObjects(callback: js.Any, objectType: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedRegistrarObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedRepositoryObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedStackObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAllocatedVaultObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def listAttachments(local: js.Any): js.Any = js.native
  def listAutoClientMappingObjects(callback: js.Any, pagination: js.Any): js.Any = js.native
  def readDefaultAllocatedClientObject(callback: js.Any): js.Any = js.native
  def readTenantPlan(): js.Any = js.native
  def readTenantPrincipal(): js.Any = js.native
  def unattach(attachmentId: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Tenant")
@js.native
object Tenant extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

