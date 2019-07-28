package typings.easyDashApiDashRequest.easyDashApiDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMaker extends js.Object {
  def apply(): CBPromiseRequest = js.native
  def apply(stream: Boolean): StreamRequest | CBPromiseRequest = js.native
}

