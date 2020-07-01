package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSslCertificatesScopedList extends js.Object {
  /**
    * List of SslCertificates contained in this scope.
    */
  var sslCertificates: js.UndefOr[js.Array[SchemaSslCertificate]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaSslCertificatesScopedList {
  @scala.inline
  def apply(sslCertificates: js.Array[SchemaSslCertificate] = null, warning: Code = null): SchemaSslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertificatesScopedList]
  }
}

