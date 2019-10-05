package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidFailLoadEvent extends Event {
  var errorCode: Double = js.native
  var errorDescription: String = js.native
  var isMainFrame: Boolean = js.native
  var validatedURL: String = js.native
}

