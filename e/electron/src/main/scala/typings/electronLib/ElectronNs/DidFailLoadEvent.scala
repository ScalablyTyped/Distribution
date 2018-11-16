package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidFailLoadEvent extends Event {
  var errorCode: scala.Double = js.native
  var errorDescription: java.lang.String = js.native
  var isMainFrame: scala.Boolean = js.native
  var validatedURL: java.lang.String = js.native
}

