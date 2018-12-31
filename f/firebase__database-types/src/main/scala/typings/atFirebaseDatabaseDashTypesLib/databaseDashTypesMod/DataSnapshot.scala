package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

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

