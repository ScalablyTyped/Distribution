package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ca extends js.Object {
  var ca: String
  var cert: String
  var key: String
}

object Anon_Ca {
  @scala.inline
  def apply(ca: String, cert: String, key: String): Anon_Ca = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ca]
  }
}

