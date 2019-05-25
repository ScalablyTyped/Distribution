package typings
package dkimDashSignerLib.dkimDashSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dkim-signer", "DKIMCanonicalizer")
@js.native
object DKIMCanonicalizerNs extends js.Object {
  /** Relaxed body canonicalization by rfc4871 #3.4.4 */
  def relaxedBody(body: java.lang.String): java.lang.String = js.native
  /** Relaxed header canonicalization for single header line */
  def relaxedHeaderLine(line: java.lang.String): dkimDashSignerLib.Anon_Key = js.native
  /** Relaxed headers canonicalization by rfc4871 #3.4.2 with filtering */
  def relaxedHeaders(headers: java.lang.String): dkimDashSignerLib.Anon_FieldNames = js.native
  def relaxedHeaders(headers: java.lang.String, fieldNames: java.lang.String): dkimDashSignerLib.Anon_FieldNames = js.native
  /** Simple body canonicalization by rfc4871 #3.4.3 */
  def simpleBody(body: java.lang.String): java.lang.String = js.native
}

