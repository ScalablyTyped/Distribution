package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropActions extends js.Object {
  def beginDrag(sourceIds: js.Array[Identifier]): Action[BeginDragPayload] = js.native
  def beginDrag(sourceIds: js.Array[Identifier], options: js.Any): Action[BeginDragPayload] = js.native
  def drop(): scala.Unit = js.native
  def drop(options: js.Any): scala.Unit = js.native
  def endDrag(): SentinelAction = js.native
  def hover(targetIds: js.Array[Identifier]): Action[HoverPayload] = js.native
  def hover(targetIds: js.Array[Identifier], options: js.Any): Action[HoverPayload] = js.native
  def publishDragSource(): SentinelAction = js.native
}

