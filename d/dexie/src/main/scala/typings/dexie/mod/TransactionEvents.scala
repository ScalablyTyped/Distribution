package typings.dexie.mod

import typings.dexie.dexieStrings.abort
import typings.dexie.dexieStrings.complete
import typings.dexie.dexieStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionEvents extends DexieEventSet {
  var abort: DexieEvent = js.native
  var complete: DexieEvent = js.native
  var error: DexieEvent = js.native
  def apply(eventName: abort, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: complete, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: error, subscriber: js.Function1[/* error */ js.Any, _]): Unit = js.native
}

