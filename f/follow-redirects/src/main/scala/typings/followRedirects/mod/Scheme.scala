package typings.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scheme[Options, Request /* <: WrappableRequest */, Response] extends js.Object {
  def request(options: Options): Request = js.native
  def request(options: Options, callback: js.Function1[/* res */ Response, _]): Request = js.native
}

