package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize", "startNotarize")
@js.native
object startNotarize extends js.Object {
  def apply(opts: NotarizeStartOptions): js.Promise[NotarizeResult] = js.native
}

