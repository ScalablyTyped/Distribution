package typings.devexpressUtils.batchUpdatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/batch-updatable", "BatchUpdatableObject")
@js.native
abstract class BatchUpdatableObject () extends IBatchUpdatableObjectExtend {
  
  def isLocked(): Boolean = js.native
  
  var occurredEvents: js.Any = js.native
  
  def onUpdateUnlocked(occurredEvents: Double): Unit = js.native
  
  def registerOccurredEvent(eventMask: Double): Unit = js.native
  
  def resetOccurredEvents(): Unit = js.native
  
  var suspendUpdateCount: js.Any = js.native
}
