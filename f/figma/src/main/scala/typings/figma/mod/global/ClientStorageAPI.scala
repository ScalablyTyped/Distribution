package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStorageAPI extends js.Object {
  def getAsync(key: String): js.Promise[_] = js.native
  def setAsync(key: String, value: js.Any): js.Promise[Unit] = js.native
}

object ClientStorageAPI {
  @scala.inline
  def apply(getAsync: String => js.Promise[_], setAsync: (String, js.Any) => js.Promise[Unit]): ClientStorageAPI = {
    val __obj = js.Dynamic.literal(getAsync = js.Any.fromFunction1(getAsync), setAsync = js.Any.fromFunction2(setAsync))
    __obj.asInstanceOf[ClientStorageAPI]
  }
  @scala.inline
  implicit class ClientStorageAPIOps[Self <: ClientStorageAPI] (val x: Self) extends AnyVal {
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
    def setGetAsync(value: String => js.Promise[_]): Self = this.set("getAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAsync(value: (String, js.Any) => js.Promise[Unit]): Self = this.set("setAsync", js.Any.fromFunction2(value))
  }
  
}

