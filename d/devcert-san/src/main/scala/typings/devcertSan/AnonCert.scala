package typings.devcertSan

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCert extends js.Object {
  var cert: Buffer
  var certPath: String
  var key: Buffer
  var keyPath: String
}

object AnonCert {
  @scala.inline
  def apply(cert: Buffer, certPath: String, key: Buffer, keyPath: String): AnonCert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], certPath = certPath.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCert]
  }
}

