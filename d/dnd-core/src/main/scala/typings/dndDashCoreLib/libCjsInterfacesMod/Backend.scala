package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends js.Object {
  def connectDragPreview(sourceId: js.Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  def setup(): scala.Unit = js.native
  def teardown(): scala.Unit = js.native
}

