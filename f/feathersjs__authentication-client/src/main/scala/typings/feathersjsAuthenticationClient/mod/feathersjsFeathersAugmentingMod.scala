package typings.feathersjsAuthenticationClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/feathers", JSImport.Namespace)
@js.native
object feathersjsFeathersAugmentingMod extends js.Object {
  @js.native
  trait Application[ServiceTypes] extends js.Object {
    var passport: Passport = js.native
    def authenticate(): js.Promise[_] = js.native
    def authenticate(options: FeathersAuthCredentials): js.Promise[_] = js.native
    def logout(): js.Promise[Unit] = js.native
  }
  
}

