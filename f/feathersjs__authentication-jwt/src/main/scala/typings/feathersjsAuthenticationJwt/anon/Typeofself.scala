package typings.feathersjsAuthenticationJwt.anon

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofself extends js.Object {
  
  val ExtractJwt: FromAuthHeader = js.native
  
  var Verifier: Instantiable2[
    /* app */ Application[js.Object], 
    /* options */ js.Any, 
    typings.feathersjsAuthenticationJwt.mod.Verifier
  ] = js.native
  
  def default(): js.Function0[Unit] = js.native
  def default(options: PartialFeathersAuthentica): js.Function0[Unit] = js.native
  
  val defaults: BodyKey = js.native
}
