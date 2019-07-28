package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidNavigateInPageEvent extends Event {
  var isMainFrame: Boolean = js.native
  var url: String = js.native
}

