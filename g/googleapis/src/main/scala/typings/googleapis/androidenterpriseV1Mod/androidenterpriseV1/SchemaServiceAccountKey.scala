package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credentials that can be used to authenticate as a service account.
  */
@js.native
trait SchemaServiceAccountKey extends js.Object {
  /**
    * The body of the private key credentials file, in string format. This is
    * only populated when the ServiceAccountKey is created, and is not stored
    * by Google.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * An opaque, unique identifier for this ServiceAccountKey. Assigned by the
    * server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccountKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Public key data for the credentials file. This is an X.509 cert. If you
    * are using the googleCredentials key type, this is identical to the cert
    * that can be retrieved by using the X.509 cert url inside of the
    * credentials file.
    */
  var publicData: js.UndefOr[String] = js.native
  /**
    * The file format of the generated key data.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaServiceAccountKey {
  @scala.inline
  def apply(
    data: String = null,
    id: String = null,
    kind: String = null,
    publicData: String = null,
    `type`: String = null
  ): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (publicData != null) __obj.updateDynamic("publicData")(publicData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
}

