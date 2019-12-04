package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.Action
import typings.dndDashCore.libInterfacesMod.BeginDragOptions
import typings.dndDashCore.libInterfacesMod.BeginDragPayload
import typings.dndDashCore.libInterfacesMod.HoverOptions
import typings.dndDashCore.libInterfacesMod.HoverPayload
import typings.dndDashCore.libInterfacesMod.SentinelAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BeginDrag extends js.Object {
  def beginDrag(): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[String]): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[String], options: BeginDragOptions): js.UndefOr[Action[BeginDragPayload]] = js.native
  def drop(): Unit = js.native
  def drop(options: js.Object): Unit = js.native
  def endDrag(): SentinelAction = js.native
  def hover(targetIdsArg: js.Array[String]): Action[HoverPayload] = js.native
  def hover(targetIdsArg: js.Array[String], hasClientOffset: HoverOptions): Action[HoverPayload] = js.native
  def publishDragSource(): js.UndefOr[SentinelAction] = js.native
}

