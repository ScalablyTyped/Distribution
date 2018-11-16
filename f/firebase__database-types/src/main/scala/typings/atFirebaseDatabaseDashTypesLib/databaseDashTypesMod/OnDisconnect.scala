package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDisconnect extends js.Object {
  def cancel(): stdLib.Promise[scala.Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[scala.Unit] = js.native
  def remove(): stdLib.Promise[scala.Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[scala.Unit] = js.native
  def set(value: js.Any): stdLib.Promise[scala.Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any): stdLib.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: java.lang.String): stdLib.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def setWithPriority(value: js.Any, priority: scala.Double): stdLib.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def update(values: js.Object): stdLib.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
}

