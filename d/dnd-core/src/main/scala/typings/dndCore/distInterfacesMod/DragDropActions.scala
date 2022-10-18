package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDropActions extends StObject {
  
  def beginDrag(): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[Identifier]): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[Identifier], options: Any): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: Unit, options: Any): js.UndefOr[Action[BeginDragPayload]] = js.native
  
  def drop(): Unit = js.native
  def drop(options: Any): Unit = js.native
  
  def endDrag(): SentinelAction = js.native
  
  def hover(targetIds: js.Array[Identifier]): Action[HoverPayload] = js.native
  def hover(targetIds: js.Array[Identifier], options: Any): Action[HoverPayload] = js.native
  
  def publishDragSource(): js.UndefOr[SentinelAction] = js.native
}
