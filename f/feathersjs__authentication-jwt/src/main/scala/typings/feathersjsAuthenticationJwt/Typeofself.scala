package typings.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsAuthenticationJwt.mod.FeathersAuthenticationJWTOptions
import typings.feathersjsFeathers.mod.Application
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  val ExtractJwt: AnonAuthscheme = js.native
  var Verifier: Instantiable2[
    /* app */ Application[js.Object], 
    /* options */ js.Any, 
    typings.feathersjsAuthenticationJwt.mod.Verifier
  ] = js.native
  val defaults: AnonBodyKey = js.native
  def default(): js.Function0[Unit] = js.native
  def default(options: Partial[FeathersAuthenticationJWTOptions]): js.Function0[Unit] = js.native
}

