package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManager[Context] extends js.Object {
  def dispatch(action: js.Any): scala.Unit
  def getActions(): DragDropActions
  def getBackend(): Backend
  def getContext(): Context
  def getMonitor(): DragDropMonitor
  def getRegistry(): HandlerRegistry
}

