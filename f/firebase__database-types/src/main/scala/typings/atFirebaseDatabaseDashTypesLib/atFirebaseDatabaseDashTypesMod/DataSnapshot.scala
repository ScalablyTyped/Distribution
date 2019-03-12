package typings
package atFirebaseDatabaseDashTypesLib.atFirebaseDatabaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSnapshot extends js.Object {
  var key: java.lang.String | scala.Null
  var ref: Reference
  def child(path: java.lang.String): DataSnapshot
  def exists(): scala.Boolean
  def exportVal(): js.Any
  def forEach(action: js.Function1[/* a */ this.type, scala.Boolean | scala.Unit]): scala.Boolean
  def getPriority(): java.lang.String | scala.Double | scala.Null
  def hasChild(path: java.lang.String): scala.Boolean
  def hasChildren(): scala.Boolean
  def numChildren(): scala.Double
  def toJSON(): js.Object | scala.Null
  def `val`(): js.Any
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: java.lang.String => DataSnapshot,
    exists: () => scala.Boolean,
    exportVal: () => js.Any,
    forEach: js.Function1[DataSnapshot, scala.Boolean | scala.Unit] => scala.Boolean,
    getPriority: () => java.lang.String | scala.Double | scala.Null,
    hasChild: java.lang.String => scala.Boolean,
    hasChildren: () => scala.Boolean,
    numChildren: () => scala.Double,
    ref: Reference,
    toJSON: () => js.Object | scala.Null,
    `val`: () => js.Any,
    key: java.lang.String = null
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DataSnapshot]
  }
}

