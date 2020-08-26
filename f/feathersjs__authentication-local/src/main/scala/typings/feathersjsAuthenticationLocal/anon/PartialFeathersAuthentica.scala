package typings.feathersjsAuthenticationLocal.anon

import typings.feathersjsAuthenticationLocal.mod.LocalVerifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/authentication-local.@feathersjs/authentication-local.FeathersAuthenticationLocalOptions> */
@js.native
trait PartialFeathersAuthentica extends js.Object {
  var Verifier: js.UndefOr[LocalVerifier] = js.native
  var entity: js.UndefOr[String] = js.native
  var entityPasswordField: js.UndefOr[String] = js.native
  var entityUsernameField: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var passwordField: js.UndefOr[String] = js.native
  var service: js.UndefOr[String] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var usernameField: js.UndefOr[String] = js.native
}

object PartialFeathersAuthentica {
  @scala.inline
  def apply(): PartialFeathersAuthentica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFeathersAuthentica]
  }
  @scala.inline
  implicit class PartialFeathersAuthenticaOps[Self <: PartialFeathersAuthentica] (val x: Self) extends AnyVal {
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
    def setVerifier(value: LocalVerifier): Self = this.set("Verifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifier: Self = this.set("Verifier", js.undefined)
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    @scala.inline
    def setEntityPasswordField(value: String): Self = this.set("entityPasswordField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityPasswordField: Self = this.set("entityPasswordField", js.undefined)
    @scala.inline
    def setEntityUsernameField(value: String): Self = this.set("entityUsernameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityUsernameField: Self = this.set("entityUsernameField", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordField: Self = this.set("passwordField", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
  }
  
}

