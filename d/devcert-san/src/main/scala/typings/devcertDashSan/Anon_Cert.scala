package typings.devcertDashSan

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
  var cert: Buffer
  var certPath: String
  var key: Buffer
  var keyPath: String
}

object Anon_Cert {
  @scala.inline
  def apply(cert: Buffer, certPath: String, key: Buffer, keyPath: String): Anon_Cert = {
    val __obj = js.Dynamic.literal(cert = cert, certPath = certPath, key = key, keyPath = keyPath)
  
    __obj.asInstanceOf[Anon_Cert]
  }
}

