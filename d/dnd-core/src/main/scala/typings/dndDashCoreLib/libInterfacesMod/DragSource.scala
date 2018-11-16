package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
  def canDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
  def endDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
  def isDragging(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
}

