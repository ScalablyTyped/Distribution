package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail extends js.Object {
  var Detail: js.Array[LicenseDetailItem]
  var Domain: String
}

object Anon_Detail {
  @scala.inline
  def apply(Detail: js.Array[LicenseDetailItem], Domain: String): Anon_Detail = {
    val __obj = js.Dynamic.literal(Detail = Detail, Domain = Domain)
  
    __obj.asInstanceOf[Anon_Detail]
  }
}

