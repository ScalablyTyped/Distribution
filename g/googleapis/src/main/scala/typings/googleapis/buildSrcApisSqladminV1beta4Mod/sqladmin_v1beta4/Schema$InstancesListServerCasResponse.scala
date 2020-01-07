package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instances ListServerCas response.
  */
@js.native
trait Schema$InstancesListServerCasResponse extends js.Object {
  var activeVersion: js.UndefOr[String] = js.native
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[Schema$SslCert]] = js.native
  /**
    * This is always sql#instancesListServerCas.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$InstancesListServerCasResponse {
  @scala.inline
  def apply(activeVersion: String = null, certs: js.Array[Schema$SslCert] = null, kind: String = null): Schema$InstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    if (activeVersion != null) __obj.updateDynamic("activeVersion")(activeVersion.asInstanceOf[js.Any])
    if (certs != null) __obj.updateDynamic("certs")(certs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesListServerCasResponse]
  }
}

