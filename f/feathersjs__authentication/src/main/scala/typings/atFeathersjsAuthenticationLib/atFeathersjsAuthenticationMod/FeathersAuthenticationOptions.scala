package typings
package atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthenticationOptions extends js.Object {
  var cookie: js.UndefOr[atFeathersjsAuthenticationLib.Anon_Enabled] = js.undefined
  var entity: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var jwt: js.UndefOr[atFeathersjsAuthenticationLib.Anon_Algorithm] = js.undefined
  var passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
}

object FeathersAuthenticationOptions {
  @scala.inline
  def apply(
    cookie: atFeathersjsAuthenticationLib.Anon_Enabled = null,
    entity: java.lang.String = null,
    header: java.lang.String = null,
    jwt: atFeathersjsAuthenticationLib.Anon_Algorithm = null,
    passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    service: java.lang.String = null,
    session: js.UndefOr[scala.Boolean] = js.undefined
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

