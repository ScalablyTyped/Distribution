package typings
package devcertDashSanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
  var cert: nodeLib.Buffer
  var certPath: java.lang.String
  var key: nodeLib.Buffer
  var keyPath: java.lang.String
}

object Anon_Cert {
  @scala.inline
  def apply(cert: nodeLib.Buffer, certPath: java.lang.String, key: nodeLib.Buffer, keyPath: java.lang.String): Anon_Cert = {
    val __obj = js.Dynamic.literal(cert = cert, certPath = certPath, key = key, keyPath = keyPath)
  
    __obj.asInstanceOf[Anon_Cert]
  }
}

