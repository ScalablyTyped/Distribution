package typings.dwt.anon

import typings.dwt.LicenseDetailItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detail extends js.Object {
  var Detail: js.Array[LicenseDetailItem]
  var Domain: String
}

object Detail {
  @scala.inline
  def apply(Detail: js.Array[LicenseDetailItem], Domain: String): Detail = {
    val __obj = js.Dynamic.literal(Detail = Detail.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
}

