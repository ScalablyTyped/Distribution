package typings.dkimSigner.mod

import typings.dkimSigner.AnonFieldNames
import typings.dkimSigner.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dkim-signer", "DKIMCanonicalizer")
@js.native
object DKIMCanonicalizer extends js.Object {
  /** Relaxed body canonicalization by rfc4871 #3.4.4 */
  def relaxedBody(body: String): String = js.native
  /** Relaxed header canonicalization for single header line */
  def relaxedHeaderLine(line: String): AnonKey = js.native
  /** Relaxed headers canonicalization by rfc4871 #3.4.2 with filtering */
  def relaxedHeaders(headers: String): AnonFieldNames = js.native
  def relaxedHeaders(headers: String, fieldNames: String): AnonFieldNames = js.native
  /** Simple body canonicalization by rfc4871 #3.4.3 */
  def simpleBody(body: String): String = js.native
}

