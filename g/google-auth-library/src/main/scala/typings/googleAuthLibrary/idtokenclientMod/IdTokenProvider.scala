package typings.googleAuthLibrary.idtokenclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdTokenProvider extends js.Object {
  def fetchIdToken(targetAudience: String): js.Promise[String] = js.native
}

object IdTokenProvider {
  @scala.inline
  def apply(fetchIdToken: String => js.Promise[String]): IdTokenProvider = {
    val __obj = js.Dynamic.literal(fetchIdToken = js.Any.fromFunction1(fetchIdToken))
    __obj.asInstanceOf[IdTokenProvider]
  }
  @scala.inline
  implicit class IdTokenProviderOps[Self <: IdTokenProvider] (val x: Self) extends AnyVal {
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
    def setFetchIdToken(value: String => js.Promise[String]): Self = this.set("fetchIdToken", js.Any.fromFunction1(value))
  }
  
}

