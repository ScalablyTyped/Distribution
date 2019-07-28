package typings.dkimDashSigner.dkimDashSignerMod

import typings.node.Buffer
import typings.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dkim-signer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DKIMSign(email: String, options: DKIMSignOptions): String = js.native
  def DKIMSign(email: Buffer, options: DKIMSignOptions): String = js.native
  def generateDKIMHeader(domainName: String, keySelector: String, headerFieldNames: String, headers: String, body: String): String = js.native
  def sha256(str: String): String = js.native
  def sha256(str: String, encoding: HexBase64Latin1Encoding): String = js.native
}

