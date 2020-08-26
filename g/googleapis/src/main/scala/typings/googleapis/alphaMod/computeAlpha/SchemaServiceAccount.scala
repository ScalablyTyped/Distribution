package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account.
  */
@js.native
trait SchemaServiceAccount extends js.Object {
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The list of scopes to be made available for this service account.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

