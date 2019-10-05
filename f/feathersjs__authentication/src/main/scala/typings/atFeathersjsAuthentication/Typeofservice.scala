package typings.atFeathersjsAuthentication

import org.scalablytyped.runtime.Instantiable1
import typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
import typings.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofservice extends js.Object {
  var Service: Instantiable1[
    /* app */ Application, 
    typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.service.Service[js.Object]
  ] = js.native
  def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application], Unit] = js.native
}

