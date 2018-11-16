package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fscreenLib {
  type EventName = fscreenLib.fscreenLibStrings.fullscreenEnabled | fscreenLib.fscreenLibStrings.fullscreenElement | fscreenLib.fscreenLibStrings.requestFullscreen | fscreenLib.fscreenLibStrings.exitFullscreen | fscreenLib.fscreenLibStrings.fullscreenchange | fscreenLib.fscreenLibStrings.fullscreenerror
  type Handler = js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]
  type RequestFullScreenFunction = js.Function1[/* element */ stdLib.Element, scala.Unit]
}
