package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account identity, including the name and credentials that can be
  * used to authenticate as the service account.
  */
@js.native
trait SchemaServiceAccount extends js.Object {
  /**
    * Credentials that can be used to authenticate as this ServiceAccount.
    */
  var key: js.UndefOr[SchemaServiceAccountKey] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The account name of the service account, in the form of an email address.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaServiceAccount {
  @scala.inline
  def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  @scala.inline
  implicit class SchemaServiceAccountOps[Self <: SchemaServiceAccount] (val x: Self) extends AnyVal {
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
    def setKey(value: SchemaServiceAccountKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

