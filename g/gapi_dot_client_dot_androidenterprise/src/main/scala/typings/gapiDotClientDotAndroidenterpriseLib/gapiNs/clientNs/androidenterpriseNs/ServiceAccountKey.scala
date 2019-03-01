package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountKey extends js.Object {
  /**
    * The body of the private key credentials file, in string format. This is only populated when the ServiceAccountKey is created, and is not stored by
    * Google.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** An opaque, unique identifier for this ServiceAccountKey. Assigned by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#serviceAccountKey". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Public key data for the credentials file. This is an X.509 cert. If you are using the googleCredentials key type, this is identical to the cert that
    * can be retrieved by using the X.509 cert url inside of the credentials file.
    */
  var publicData: js.UndefOr[java.lang.String] = js.undefined
  /** The file format of the generated key data. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccountKey {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    publicData: java.lang.String = null,
    `type`: java.lang.String = null
  ): ServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (publicData != null) __obj.updateDynamic("publicData")(publicData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceAccountKey]
  }
}

