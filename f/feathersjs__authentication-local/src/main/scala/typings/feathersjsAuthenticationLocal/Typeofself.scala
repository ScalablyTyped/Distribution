package typings.feathersjsAuthenticationLocal

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsAuthenticationLocal.mod.FeathersAuthenticationLocalOptions
import typings.feathersjsFeathers.mod.Application
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  var LocalVerifier: Instantiable2[
    /* app */ Application[js.Object], 
    /* options */ js.Any, 
    typings.feathersjsAuthenticationLocal.mod.LocalVerifier
  ] = js.native
  val defaults: AnonName = js.native
  val hooks: Typeofhooks = js.native
  def default(): js.Function0[Unit] = js.native
  def default(options: Partial[FeathersAuthenticationLocalOptions]): js.Function0[Unit] = js.native
}

