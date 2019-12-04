package typings.atFirebaseMessaging

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/test/testing-utils/mock-fetch", JSImport.Namespace)
@js.native
object distTestTestingDashUtilsMockDashFetchMod extends js.Object {
  @js.native
  object fetchMock extends js.Object {
    def htmlError(status: Double, msg: String): js.Promise[Response] = js.native
    def jsonError(status: Double, msg: String): js.Promise[Response] = js.native
    def jsonOk(body: String): js.Promise[Response] = js.native
  }
  
}

