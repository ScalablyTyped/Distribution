package typings
package ecdsaDashSigDashFormatterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecdsa-sig-formatter", JSImport.Namespace)
@js.native
object ecdsaDashSigDashFormatterMod extends js.Object {
  def derToJose(signature: java.lang.String, alg: java.lang.String): java.lang.String = js.native
  def derToJose(signature: nodeLib.Buffer, alg: java.lang.String): java.lang.String = js.native
  def joseToDer(signature: java.lang.String, alg: java.lang.String): nodeLib.Buffer = js.native
  def joseToDer(signature: nodeLib.Buffer, alg: java.lang.String): nodeLib.Buffer = js.native
}

