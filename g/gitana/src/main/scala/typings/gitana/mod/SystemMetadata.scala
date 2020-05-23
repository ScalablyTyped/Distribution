package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "SystemMetadata")
@js.native
class SystemMetadata () extends Base {
  def base(): Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def getChangesetId(): String = js.native
  def getCreatedBy(): String = js.native
  def getCreatedByPrincipalDomainId(): String = js.native
  def getCreatedByPrincipalId(): String = js.native
  def getCreatedOn(): Timestamp = js.native
  def getModifiedBy(): String = js.native
  def getModifiedByPrincipalDomainId(): String = js.native
  def getModifiedByPrincipalId(): String = js.native
  def getModifiedOn(): Timestamp = js.native
  def updateFrom(json: js.Any): Unit = js.native
}

/* static members */
@JSImport("gitana", "SystemMetadata")
@js.native
object SystemMetadata extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

