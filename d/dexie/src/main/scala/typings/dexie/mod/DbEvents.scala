package typings.dexie.mod

import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbEvents extends DexieEventSet {
  
  def apply(eventName: blocked, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def apply(eventName: populate, subscriber: js.Function1[/* trans */ Transaction, _]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  
  var blocked: DexieEvent = js.native
  
  var populate: DexiePopulateEvent = js.native
  
  var ready: DexieOnReadyEvent = js.native
  
  var versionchange: DexieVersionChangeEvent = js.native
}
