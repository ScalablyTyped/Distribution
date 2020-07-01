package typings.electronNotarize.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize/lib/helpers", "withTempDir")
@js.native
object withTempDir extends js.Object {
  def apply[T](fn: js.Function1[/* dir */ String, js.Promise[T]]): js.Promise[T] = js.native
}

