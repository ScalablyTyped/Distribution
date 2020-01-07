package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity whose actions triggered a Gmail phishing alert.
  */
@js.native
trait Schema$MaliciousEntity extends js.Object {
  /**
    * The sender email address.
    */
  var fromHeader: js.UndefOr[String] = js.native
}

object Schema$MaliciousEntity {
  @scala.inline
  def apply(fromHeader: String = null): Schema$MaliciousEntity = {
    val __obj = js.Dynamic.literal()
    if (fromHeader != null) __obj.updateDynamic("fromHeader")(fromHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MaliciousEntity]
  }
}

