package typings.dndCore.distInterfacesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  def connectDragPreview(sourceId: Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: Any, node: Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: Any, node: Any, options: Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: Any, node: Unit, options: Any): Unsubscribe = js.native
  
  def connectDragSource(sourceId: Any): Unsubscribe = js.native
  def connectDragSource(sourceId: Any, node: Any): Unsubscribe = js.native
  def connectDragSource(sourceId: Any, node: Any, options: Any): Unsubscribe = js.native
  def connectDragSource(sourceId: Any, node: Unit, options: Any): Unsubscribe = js.native
  
  def connectDropTarget(targetId: Any): Unsubscribe = js.native
  def connectDropTarget(targetId: Any, node: Any): Unsubscribe = js.native
  def connectDropTarget(targetId: Any, node: Any, options: Any): Unsubscribe = js.native
  def connectDropTarget(targetId: Any, node: Unit, options: Any): Unsubscribe = js.native
  
  def profile(): Record[String, Double] = js.native
  
  def setup(): Unit = js.native
  
  def teardown(): Unit = js.native
}
