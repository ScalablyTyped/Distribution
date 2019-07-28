package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends typings.std.Event {
  var altKey: js.UndefOr[Boolean] = js.native
  var ctrlKey: js.UndefOr[Boolean] = js.native
  var metaKey: js.UndefOr[Boolean] = js.native
  var sender: WebContents = js.native
  var shiftKey: js.UndefOr[Boolean] = js.native
}

