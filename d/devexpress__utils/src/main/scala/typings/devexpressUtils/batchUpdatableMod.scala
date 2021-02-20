package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchUpdatableMod {
  
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
  
  @JSImport("@devexpress/utils/lib/class/batch-updatable", "EmptyBatchUpdatableObject")
  @js.native
  class EmptyBatchUpdatableObject () extends IBatchUpdatableObject
  
  @js.native
  trait IBatchUpdatableObject extends StObject {
    
    def beginUpdate(): Unit = js.native
    
    def endUpdate(): Unit = js.native
  }
  object IBatchUpdatableObject {
    
    @scala.inline
    def apply(beginUpdate: () => Unit, endUpdate: () => Unit): IBatchUpdatableObject = {
      val __obj = js.Dynamic.literal(beginUpdate = js.Any.fromFunction0(beginUpdate), endUpdate = js.Any.fromFunction0(endUpdate))
      __obj.asInstanceOf[IBatchUpdatableObject]
    }
    
    @scala.inline
    implicit class IBatchUpdatableObjectMutableBuilder[Self <: IBatchUpdatableObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginUpdate(value: () => Unit): Self = StObject.set(x, "beginUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IBatchUpdatableObjectExtend extends IBatchUpdatableObject {
    
    def continueUpdate(): Unit = js.native
    
    def isUpdateLocked(): Boolean = js.native
    
    def onUpdateLocked(): Unit = js.native
    
    def suspendUpdate(): Unit = js.native
  }
  object IBatchUpdatableObjectExtend {
    
    @scala.inline
    def apply(
      beginUpdate: () => Unit,
      continueUpdate: () => Unit,
      endUpdate: () => Unit,
      isUpdateLocked: () => Boolean,
      onUpdateLocked: () => Unit,
      suspendUpdate: () => Unit
    ): IBatchUpdatableObjectExtend = {
      val __obj = js.Dynamic.literal(beginUpdate = js.Any.fromFunction0(beginUpdate), continueUpdate = js.Any.fromFunction0(continueUpdate), endUpdate = js.Any.fromFunction0(endUpdate), isUpdateLocked = js.Any.fromFunction0(isUpdateLocked), onUpdateLocked = js.Any.fromFunction0(onUpdateLocked), suspendUpdate = js.Any.fromFunction0(suspendUpdate))
      __obj.asInstanceOf[IBatchUpdatableObjectExtend]
    }
    
    @scala.inline
    implicit class IBatchUpdatableObjectExtendMutableBuilder[Self <: IBatchUpdatableObjectExtend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinueUpdate(value: () => Unit): Self = StObject.set(x, "continueUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUpdateLocked(value: () => Boolean): Self = StObject.set(x, "isUpdateLocked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUpdateLocked(value: () => Unit): Self = StObject.set(x, "onUpdateLocked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSuspendUpdate(value: () => Unit): Self = StObject.set(x, "suspendUpdate", js.Any.fromFunction0(value))
    }
  }
}
