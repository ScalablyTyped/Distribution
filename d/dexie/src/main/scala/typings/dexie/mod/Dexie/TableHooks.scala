package typings.dexie.mod.Dexie

import typings.dexie.dexieStrings.creating
import typings.dexie.dexieStrings.deleting
import typings.dexie.dexieStrings.reading
import typings.dexie.dexieStrings.updating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHooks[T, Key] extends DexieEventSet {
  var creating: DexieEvent = js.native
  var deleting: DexieEvent = js.native
  var reading: DexieEvent = js.native
  var updating: DexieEvent = js.native
  def apply(
    eventName: creating,
    subscriber: js.ThisFunction3[
      /* this */ CreatingHookContext[T, Key], 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
  def apply(
    eventName: deleting,
    subscriber: js.ThisFunction3[
      /* this */ DeletingHookContext[T, Key], 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
  def apply(eventName: reading, subscriber: js.Function1[/* obj */ T, T | _]): Unit = js.native
  def apply(
    eventName: updating,
    subscriber: js.ThisFunction4[
      /* this */ UpdatingHookContext[T, Key], 
      /* modifications */ js.Object, 
      /* primKey */ Key, 
      /* obj */ T, 
      /* transaction */ Transaction, 
      _
    ]
  ): Unit = js.native
}

