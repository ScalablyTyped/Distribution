package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SslCertificatesScopedList extends js.Object {
  /**
    * List of SslCertificates contained in this scope.
    */
  var sslCertificates: js.UndefOr[js.Array[Schema$SslCertificate]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$SslCertificatesScopedList {
  @scala.inline
  def apply(sslCertificates: js.Array[Schema$SslCertificate] = null, warning: Anon_Code = null): Schema$SslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertificatesScopedList]
  }
}

