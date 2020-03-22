package typings.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import typings.feathersjsAuthenticationJwt.mod.Verifier
import typings.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/authentication-jwt.@feathersjs/authentication-jwt.FeathersAuthenticationJWTOptions> */
trait PartialFeathersAuthentica extends js.Object {
  var Verifier: js.UndefOr[
    Instantiable2[
      /* app */ Application[js.Object], 
      /* options */ js.Any, 
      typings.feathersjsAuthenticationJwt.mod.Verifier
    ]
  ] = js.undefined
  var entity: js.UndefOr[String] = js.undefined
  var jwtFromRequest: js.UndefOr[JwtFromRequestFunction] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var secretOrKey: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
}

object PartialFeathersAuthentica {
  @scala.inline
  def apply(
    Verifier: Instantiable2[/* app */ Application[js.Object], /* options */ js.Any, Verifier] = null,
    entity: String = null,
    jwtFromRequest: /* req */ Request_[ParamsDictionary] => String | Null = null,
    name: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    secretOrKey: String = null,
    service: String = null,
    session: js.UndefOr[Boolean] = js.undefined
  ): PartialFeathersAuthentica = {
    val __obj = js.Dynamic.literal()
    if (Verifier != null) __obj.updateDynamic("Verifier")(Verifier.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (jwtFromRequest != null) __obj.updateDynamic("jwtFromRequest")(js.Any.fromFunction1(jwtFromRequest))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (secretOrKey != null) __obj.updateDynamic("secretOrKey")(secretOrKey.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFeathersAuthentica]
  }
}

