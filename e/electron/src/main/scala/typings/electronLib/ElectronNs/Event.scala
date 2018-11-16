package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends stdLib.Event {
  var altKey: js.UndefOr[scala.Boolean] = js.native
  var ctrlKey: js.UndefOr[scala.Boolean] = js.native
  var metaKey: js.UndefOr[scala.Boolean] = js.native
  var sender: WebContents = js.native
  var shiftKey: js.UndefOr[scala.Boolean] = js.native
}

