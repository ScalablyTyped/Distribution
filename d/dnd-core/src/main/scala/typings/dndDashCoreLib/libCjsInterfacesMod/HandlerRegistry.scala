package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerRegistry extends js.Object {
  def addSource(`type`: SourceType, source: DragSource): Identifier = js.native
  def addTarget(`type`: TargetType, target: DropTarget): Identifier = js.native
  def containsHandler(handler: DragSource): scala.Boolean = js.native
  def containsHandler(handler: DropTarget): scala.Boolean = js.native
  def getSource(sourceId: Identifier): DragSource = js.native
  def getSource(sourceId: Identifier, includePinned: scala.Boolean): DragSource = js.native
  def getSourceType(sourceId: Identifier): SourceType = js.native
  def getTarget(targetId: Identifier): DropTarget = js.native
  def getTargetType(targetId: Identifier): TargetType = js.native
  def isSourceId(handlerId: Identifier): scala.Boolean = js.native
  def isTargetId(handlerId: Identifier): scala.Boolean = js.native
  def pinSource(sourceId: Identifier): scala.Unit = js.native
  def removeSource(sourceId: Identifier): scala.Unit = js.native
  def removeTarget(targetId: Identifier): scala.Unit = js.native
  def unpinSource(): scala.Unit = js.native
}

