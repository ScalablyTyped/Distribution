package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetail extends js.Object {
  var Detail: js.Array[LicenseDetailItem]
  var Domain: String
}

object AnonDetail {
  @scala.inline
  def apply(Detail: js.Array[LicenseDetailItem], Domain: String): AnonDetail = {
    val __obj = js.Dynamic.literal(Detail = Detail.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetail]
  }
}

