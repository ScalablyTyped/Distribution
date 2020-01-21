package typings.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCa extends js.Object {
  var ca: String
  var cert: String
  var key: String
}

object AnonCa {
  @scala.inline
  def apply(ca: String, cert: String, key: String): AnonCa = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCa]
  }
}

