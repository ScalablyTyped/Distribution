package typings
package dkimDashSignerLib.dkimDashSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dkim-signer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DKIMSign(email: java.lang.String, options: DKIMSignOptions): java.lang.String = js.native
  def DKIMSign(email: nodeLib.Buffer, options: DKIMSignOptions): java.lang.String = js.native
  def generateDKIMHeader(
    domainName: java.lang.String,
    keySelector: java.lang.String,
    headerFieldNames: java.lang.String,
    headers: java.lang.String,
    body: java.lang.String
  ): java.lang.String = js.native
  def sha256(str: java.lang.String): java.lang.String = js.native
  def sha256(str: java.lang.String, encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding): java.lang.String = js.native
}

