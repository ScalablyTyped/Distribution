package typings
package fscreenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fscreenMod {
  type Handler = js.Function1[/* e */ js.UndefOr[stdLib.Event], scala.Unit]
  type RequestFullScreenFunction = js.Function1[/* element */ stdLib.Element, scala.Unit]
}
