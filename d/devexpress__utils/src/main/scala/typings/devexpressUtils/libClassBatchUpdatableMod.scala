package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassBatchUpdatableMod {
  
  /* note: abstract class */ @JSImport("@devexpress/utils/lib/class/batch-updatable", "BatchUpdatableObject")
  @js.native
  open class BatchUpdatableObject ()
    extends StObject
       with IBatchUpdatableObjectExtend {
    
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def continueUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
    
    def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def isUpdateLocked(): Boolean = js.native
    
    /* private */ var occurredEvents: Any = js.native
    
    /* CompleteClass */
    override def onUpdateLocked(): Unit = js.native
    
    def onUpdateUnlocked(occurredEvents: Double): Unit = js.native
    
    def registerOccurredEvent(eventMask: Double): Unit = js.native
    
    def resetOccurredEvents(): Unit = js.native
    
    /* CompleteClass */
    override def suspendUpdate(): Unit = js.native
    
    /* private */ var suspendUpdateCount: Any = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/batch-updatable", "EmptyBatchUpdatableObject")
  @js.native
  open class EmptyBatchUpdatableObject ()
    extends StObject
       with IBatchUpdatableObject {
    
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
  }
  
  trait IBatchUpdatableObject extends StObject {
    
    def beginUpdate(): Unit
    
    def endUpdate(): Unit
  }
  object IBatchUpdatableObject {
    
    inline def apply(beginUpdate: () => Unit, endUpdate: () => Unit): IBatchUpdatableObject = {
      val __obj = js.Dynamic.literal(beginUpdate = js.Any.fromFunction0(beginUpdate), endUpdate = js.Any.fromFunction0(endUpdate))
      __obj.asInstanceOf[IBatchUpdatableObject]
    }
    
    extension [Self <: IBatchUpdatableObject](x: Self) {
      
      inline def setBeginUpdate(value: () => Unit): Self = StObject.set(x, "beginUpdate", js.Any.fromFunction0(value))
      
      inline def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
    }
  }
  
  trait IBatchUpdatableObjectExtend
    extends StObject
       with IBatchUpdatableObject {
    
    def continueUpdate(): Unit
    
    def isUpdateLocked(): Boolean
    
    def onUpdateLocked(): Unit
    
    def suspendUpdate(): Unit
  }
  object IBatchUpdatableObjectExtend {
    
    inline def apply(
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
    
    extension [Self <: IBatchUpdatableObjectExtend](x: Self) {
      
      inline def setContinueUpdate(value: () => Unit): Self = StObject.set(x, "continueUpdate", js.Any.fromFunction0(value))
      
      inline def setIsUpdateLocked(value: () => Boolean): Self = StObject.set(x, "isUpdateLocked", js.Any.fromFunction0(value))
      
      inline def setOnUpdateLocked(value: () => Unit): Self = StObject.set(x, "onUpdateLocked", js.Any.fromFunction0(value))
      
      inline def setSuspendUpdate(value: () => Unit): Self = StObject.set(x, "suspendUpdate", js.Any.fromFunction0(value))
    }
  }
}
