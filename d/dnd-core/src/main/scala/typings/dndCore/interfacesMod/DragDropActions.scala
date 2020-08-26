package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropActions extends js.Object {
  def beginDrag(): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.UndefOr[scala.Nothing], options: js.Any): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[Identifier]): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[Identifier], options: js.Any): js.UndefOr[Action[BeginDragPayload]] = js.native
  def drop(): Unit = js.native
  def drop(options: js.Any): Unit = js.native
  def endDrag(): SentinelAction = js.native
  def hover(targetIds: js.Array[Identifier]): Action[HoverPayload] = js.native
  def hover(targetIds: js.Array[Identifier], options: js.Any): Action[HoverPayload] = js.native
  def publishDragSource(): js.UndefOr[SentinelAction] = js.native
}

