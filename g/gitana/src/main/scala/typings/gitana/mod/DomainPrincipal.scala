package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "DomainPrincipal")
@js.native
class DomainPrincipal protected () extends js.Object {
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

/* static members */
@JSImport("gitana", "DomainPrincipal")
@js.native
object DomainPrincipal extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

