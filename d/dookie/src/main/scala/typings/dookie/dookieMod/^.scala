package typings.dookie.dookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dookie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pull(uri: String): js.Promise[_] = js.native
  def pullToStream(uri: String, stream: js.Any): js.Promise[_] = js.native
  def push(uri: String, data: js.Any): js.Promise[_] = js.native
  def push(uri: String, data: js.Any, opts: PushOpts): js.Promise[_] = js.native
}

