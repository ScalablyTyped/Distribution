package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslSettings extends js.Object {
  /** ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support. Example: 12345. */
  var certificateId: js.UndefOr[String] = js.undefined
}

object SslSettings {
  @scala.inline
  def apply(certificateId: String = null): SslSettings = {
    val __obj = js.Dynamic.literal()
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    __obj.asInstanceOf[SslSettings]
  }
}

