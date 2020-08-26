package typings.expressJwt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* property */ StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[Boolean] = js.native
  var getToken: js.UndefOr[GetTokenCallback] = js.native
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.native
  var requestProperty: js.UndefOr[String] = js.native
  var secret: secretType | SecretCallback | SecretCallbackLong = js.native
  var userProperty: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(secret: secretType | SecretCallback | SecretCallbackLong): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setSecretFunction4(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* header */ js.Any, /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
    ): Self = this.set("secret", js.Any.fromFunction4(value))
    @scala.inline
    def setSecretFunction3(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
    ): Self = this.set("secret", js.Any.fromFunction3(value))
    @scala.inline
    def setSecret(value: secretType | SecretCallback | SecretCallbackLong): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialsRequired(value: Boolean): Self = this.set("credentialsRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialsRequired: Self = this.set("credentialsRequired", js.undefined)
    @scala.inline
    def setGetToken(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Any): Self = this.set("getToken", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetToken: Self = this.set("getToken", js.undefined)
    @scala.inline
    def setIsRevoked(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("isRevoked", js.Any.fromFunction3(value))
    @scala.inline
    def deleteIsRevoked: Self = this.set("isRevoked", js.undefined)
    @scala.inline
    def setRequestProperty(value: String): Self = this.set("requestProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestProperty: Self = this.set("requestProperty", js.undefined)
    @scala.inline
    def setUserProperty(value: String): Self = this.set("userProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProperty: Self = this.set("userProperty", js.undefined)
  }
  
}

