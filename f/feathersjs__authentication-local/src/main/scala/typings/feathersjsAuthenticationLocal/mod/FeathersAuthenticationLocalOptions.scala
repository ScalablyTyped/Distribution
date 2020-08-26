package typings.feathersjsAuthenticationLocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationLocalOptions extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: LocalVerifier = js.native
  /**
    * the entity that you're comparing username/password against
    */
  var entity: String = js.native
  /**
    * key name of the password on the entity (defaults to `passwordField`)
    */
  var entityPasswordField: String = js.native
  /**
    * key name of the username field on the entity (defaults to `usernameField`)
    */
  var entityUsernameField: String = js.native
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: String = js.native
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  /**
    * key name of password field on the request
    */
  var passwordField: String = js.native
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
  /**
    * key name of username field on the request
    */
  var usernameField: String = js.native
}

object FeathersAuthenticationLocalOptions {
  @scala.inline
  def apply(
    Verifier: LocalVerifier,
    entity: String,
    entityPasswordField: String,
    entityUsernameField: String,
    name: String,
    passReqToCallback: Boolean,
    passwordField: String,
    service: String,
    session: Boolean,
    usernameField: String
  ): FeathersAuthenticationLocalOptions = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityPasswordField = entityPasswordField.asInstanceOf[js.Any], entityUsernameField = entityUsernameField.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationLocalOptions]
  }
  @scala.inline
  implicit class FeathersAuthenticationLocalOptionsOps[Self <: FeathersAuthenticationLocalOptions] (val x: Self) extends AnyVal {
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityPasswordField(value: String): Self = this.set("entityPasswordField", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityUsernameField(value: String): Self = this.set("entityUsernameField", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
  }
  
}

