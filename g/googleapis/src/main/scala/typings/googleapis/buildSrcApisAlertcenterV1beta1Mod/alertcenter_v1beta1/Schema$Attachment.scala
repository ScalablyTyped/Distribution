package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment with application-specific information about an alert.
  */
@js.native
trait Schema$Attachment extends js.Object {
  /**
    * A CSV file attachment.
    */
  var csv: js.UndefOr[Schema$Csv] = js.native
}

object Schema$Attachment {
  @scala.inline
  def apply(csv: Schema$Csv = null): Schema$Attachment = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Attachment]
  }
}

