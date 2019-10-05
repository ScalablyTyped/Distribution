package typings.dexie.dexieMod.Dexie

import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbEvents extends DexieEventSet {
  var blocked: DexieEvent = js.native
  var populate: DexieEvent = js.native
  var ready: DexieOnReadyEvent = js.native
  var versionchange: DexieVersionChangeEvent = js.native
  def apply(eventName: blocked, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: populate, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
}

