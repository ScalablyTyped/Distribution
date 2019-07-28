package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod

import typings.atFeathersjsAuthentication.Anon_Algorithm
import typings.atFeathersjsAuthentication.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthenticationOptions extends js.Object {
  var cookie: js.UndefOr[Anon_Enabled] = js.undefined
  var entity: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var jwt: js.UndefOr[Anon_Algorithm] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
}

object FeathersAuthenticationOptions {
  @scala.inline
  def apply(
    cookie: Anon_Enabled = null,
    entity: String = null,
    header: String = null,
    jwt: Anon_Algorithm = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    service: String = null,
    session: js.UndefOr[Boolean] = js.undefined
  ): FeathersAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (header != null) __obj.updateDynamic("header")(header)
    if (jwt != null) __obj.updateDynamic("jwt")(jwt)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (path != null) __obj.updateDynamic("path")(path)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[FeathersAuthenticationOptions]
  }
}

