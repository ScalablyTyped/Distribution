package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S]
  extends nodeLib.eventsMod.EventEmitter {
  var dehydrate: js.UndefOr[js.Function0[S]] = js.native
  var rehydrate: js.UndefOr[js.Function1[/* state */ S, scala.Unit]] = js.native
  var shouldDehydrate: js.UndefOr[js.Function0[scala.Boolean]] = js.native
  def emitChange(): scala.Unit = js.native
}

