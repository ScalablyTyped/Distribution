package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
  def drop(monitor: DragDropMonitor, targetId: java.lang.String): js.Any
  def hover(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
}

