package typings
package firebaseLib.firebaseMod.firebaseNs.databaseNs

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
  def toJSON(): coreDashJsLib.Object | scala.Null
  def `val`(): js.Any
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: js.Function1[java.lang.String, DataSnapshot],
    exists: js.Function0[scala.Boolean],
    exportVal: js.Function0[js.Any],
    forEach: js.Function1[js.Function1[DataSnapshot, scala.Boolean | scala.Unit], scala.Boolean],
    getPriority: js.Function0[java.lang.String | scala.Double | scala.Null],
    hasChild: js.Function1[java.lang.String, scala.Boolean],
    hasChildren: js.Function0[scala.Boolean],
    numChildren: js.Function0[scala.Double],
    ref: Reference,
    toJSON: js.Function0[coreDashJsLib.Object | scala.Null],
    `val`: js.Function0[js.Any],
    key: java.lang.String = null
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = child, exists = exists, exportVal = exportVal, forEach = forEach, getPriority = getPriority, hasChild = hasChild, hasChildren = hasChildren, numChildren = numChildren, ref = ref, toJSON = toJSON)
    __obj.updateDynamic("val")(`val`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DataSnapshot]
  }
}

