package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigFetchClient extends js.Object {
  /**
    * @throws if response status is not 200 or 304.
    */
  def fetch(request: FetchRequest): js.Promise[FetchResponse]
}

object RemoteConfigFetchClient {
  @scala.inline
  def apply(fetch: FetchRequest => js.Promise[FetchResponse]): RemoteConfigFetchClient = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[RemoteConfigFetchClient]
  }
}

