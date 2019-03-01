package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsInsertRequest extends js.Object {
  /**
    * User supplied name. Must be a distinct name from the other certificates for this instance. New certificates will not be usable until the instance is
    * restarted.
    */
  var commonName: js.UndefOr[java.lang.String] = js.undefined
}

object SslCertsInsertRequest {
  @scala.inline
  def apply(commonName: java.lang.String = null): SslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    __obj.asInstanceOf[SslCertsInsertRequest]
  }
}

