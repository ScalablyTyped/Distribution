package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts insert request.
  */
@js.native
trait Schema$SslCertsInsertRequest extends js.Object {
  /**
    * User supplied name. Must be a distinct name from the other certificates
    * for this instance.
    */
  var commonName: js.UndefOr[String] = js.native
}

object Schema$SslCertsInsertRequest {
  @scala.inline
  def apply(commonName: String = null): Schema$SslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertsInsertRequest]
  }
}

