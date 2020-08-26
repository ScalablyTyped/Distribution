package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigFetchClient extends js.Object {
  /**
    * @throws if response status is not 200 or 304.
    */
  def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
}

object RemoteConfigFetchClient {
  @scala.inline
  def apply(fetch: FetchRequest => js.Promise[FetchResponse]): RemoteConfigFetchClient = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[RemoteConfigFetchClient]
  }
  @scala.inline
  implicit class RemoteConfigFetchClientOps[Self <: RemoteConfigFetchClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetch(value: FetchRequest => js.Promise[FetchResponse]): Self = this.set("fetch", js.Any.fromFunction1(value))
  }
  
}

