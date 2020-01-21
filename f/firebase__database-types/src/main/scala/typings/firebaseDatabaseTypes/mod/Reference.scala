package typings.firebaseDatabaseTypes.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends Query {
  var key: String | Null = js.native
  var parent: Reference | Null = js.native
  var root: Reference = js.native
  def child(path: String): Reference = js.native
  def onDisconnect(): OnDisconnect = js.native
  def push(): Reference = js.native
  def push(value: js.Any): Reference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): Reference = js.native
  def remove(): js.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def set(value: js.Any): js.Promise[_] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _]
  ): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _],
    applyLocally: Boolean
  ): js.Promise[_] = js.native
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
}

