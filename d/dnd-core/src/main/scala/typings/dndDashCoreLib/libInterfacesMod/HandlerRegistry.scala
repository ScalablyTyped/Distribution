package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerRegistry extends js.Object {
  def addSource(`type`: SourceType, source: DragSource): java.lang.String = js.native
  def addTarget(`type`: TargetType, target: DropTarget): java.lang.String = js.native
  def containsHandler(handler: DragSource): scala.Boolean = js.native
  def containsHandler(handler: DropTarget): scala.Boolean = js.native
  def getSource(sourceId: java.lang.String): DragSource = js.native
  def getSource(sourceId: java.lang.String, includePinned: scala.Boolean): DragSource = js.native
  def getSourceType(sourceId: java.lang.String): SourceType = js.native
  def getTarget(targetId: java.lang.String): DropTarget = js.native
  def getTargetType(targetId: java.lang.String): TargetType = js.native
  def isSourceId(handlerId: java.lang.String): scala.Boolean = js.native
  def isTargetId(handlerId: java.lang.String): scala.Boolean = js.native
  def pinSource(sourceId: java.lang.String): scala.Unit = js.native
  def removeSource(sourceId: java.lang.String): scala.Unit = js.native
  def removeTarget(targetId: java.lang.String): scala.Unit = js.native
  def unpinSource(): scala.Unit = js.native
}

