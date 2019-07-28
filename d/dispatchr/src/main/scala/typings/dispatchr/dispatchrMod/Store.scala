package typings.dispatchr.dispatchrMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S] extends EventEmitter {
  var dehydrate: js.UndefOr[js.Function0[S]] = js.native
  var rehydrate: js.UndefOr[js.Function1[/* state */ S, Unit]] = js.native
  var shouldDehydrate: js.UndefOr[js.Function0[Boolean]] = js.native
  def emitChange(): Unit = js.native
}

