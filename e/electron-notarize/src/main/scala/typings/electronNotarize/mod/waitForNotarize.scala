package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize", "waitForNotarize")
@js.native
object waitForNotarize extends js.Object {
  def apply(opts: NotarizeWaitOptions): js.Promise[Unit] = js.native
}

