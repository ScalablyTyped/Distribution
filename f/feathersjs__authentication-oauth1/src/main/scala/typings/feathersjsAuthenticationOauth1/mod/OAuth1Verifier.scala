package typings.feathersjsAuthenticationOauth1.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.feathersjsAuthenticationOauth1.AnonAccessToken
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Paginated
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-oauth1", "OAuth1Verifier")
@js.native
class OAuth1Verifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
   // updates an existing entity
  def _createEntity(data: AnonAccessToken): js.Promise[_] = js.native
   // creates an entity if they didn't exist already
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
  def _updateEntity(entity: js.Any, data: AnonAccessToken): js.Promise[_] = js.native
   // normalizes result from service to account for pagination
  def verify(
    req: Request_[ParamsDictionary],
    accessToken: String,
    refreshToken: String,
    profile: js.Any,
    done: js.Function3[/* err */ Error | Null, /* user */ js.Object, /* info */ js.Object, Unit]
  ): Unit = js.native
}

