package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends Query {
  var key: java.lang.String | scala.Null = js.native
  var parent: Reference | scala.Null = js.native
  var root: Reference = js.native
  def child(path: java.lang.String): Reference = js.native
  def onDisconnect(): OnDisconnect = js.native
  def push(): ThenableReference = js.native
  def push(value: js.Any): ThenableReference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): ThenableReference = js.native
  def remove(): stdLib.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
  def set(value: js.Any): stdLib.Promise[_] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
  def setPriority(priority: java.lang.String, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
  def setPriority(priority: scala.Double, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
  def setPriority(priority: scala.Null, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
  def setWithPriority(newVal: js.Any): stdLib.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: java.lang.String): stdLib.Promise[_] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: scala.Double): stdLib.Promise[_] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): stdLib.Promise[_] = js.native
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): stdLib.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ DataSnapshot | scala.Null, 
      _
    ]
  ): stdLib.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ DataSnapshot | scala.Null, 
      _
    ],
    applyLocally: scala.Boolean
  ): stdLib.Promise[_] = js.native
  def update(values: js.Object): stdLib.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): stdLib.Promise[_] = js.native
}

