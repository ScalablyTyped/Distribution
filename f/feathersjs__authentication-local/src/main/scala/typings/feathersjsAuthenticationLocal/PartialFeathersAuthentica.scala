package typings.feathersjsAuthenticationLocal

import typings.feathersjsAuthenticationLocal.mod.LocalVerifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/authentication-local.@feathersjs/authentication-local.FeathersAuthenticationLocalOptions> */
trait PartialFeathersAuthentica extends js.Object {
  var Verifier: js.UndefOr[LocalVerifier] = js.undefined
  var entity: js.UndefOr[String] = js.undefined
  var entityPasswordField: js.UndefOr[String] = js.undefined
  var entityUsernameField: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object PartialFeathersAuthentica {
  @scala.inline
  def apply(
    Verifier: LocalVerifier = null,
    entity: String = null,
    entityPasswordField: String = null,
    entityUsernameField: String = null,
    name: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    passwordField: String = null,
    service: String = null,
    session: js.UndefOr[Boolean] = js.undefined,
    usernameField: String = null
  ): PartialFeathersAuthentica = {
    val __obj = js.Dynamic.literal()
    if (Verifier != null) __obj.updateDynamic("Verifier")(Verifier.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (entityPasswordField != null) __obj.updateDynamic("entityPasswordField")(entityPasswordField.asInstanceOf[js.Any])
    if (entityUsernameField != null) __obj.updateDynamic("entityUsernameField")(entityUsernameField.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFeathersAuthentica]
  }
}

