package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about an auditable service.
  */
@js.native
trait Schema$AuditableService extends js.Object {
  /**
    * Public name of the service. For example, the service name for Cloud IAM
    * is &#39;iam.googleapis.com&#39;.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$AuditableService {
  @scala.inline
  def apply(name: String = null): Schema$AuditableService = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuditableService]
  }
}

