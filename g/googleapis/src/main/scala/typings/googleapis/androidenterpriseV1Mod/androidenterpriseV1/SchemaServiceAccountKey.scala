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
  def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  @scala.inline
  implicit class SchemaServiceAccountKeyOps[Self <: SchemaServiceAccountKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPublicData(value: String): Self = this.set("publicData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicData: Self = this.set("publicData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

