package typings.firebaseDatabaseTypes.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDisconnect extends js.Object {
  def cancel(): js.Promise[Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
  def remove(): js.Promise[Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
  def set(value: js.Any): js.Promise[Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
  def setWithPriority(value: js.Any): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: String): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: Double): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
}

