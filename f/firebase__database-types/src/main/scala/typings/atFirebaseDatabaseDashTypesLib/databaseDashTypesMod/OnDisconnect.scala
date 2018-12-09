package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDisconnect extends js.Object {
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def remove(): js.Promise[scala.Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def set(value: js.Any): js.Promise[scala.Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: java.lang.String): js.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: scala.Double): js.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[_] = js.native
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[_] = js.native
}

