package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import typings.devexpressUtils.libIntervalsSparseIntervalsMod.SparseIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/iterator", "SparseIntervalsIterator")
  @js.native
  open class SparseIntervalsIterator[T /* <: ConstInterval */] protected () extends StObject {
    def this(sparseIntervals: SparseIntervals[T]) = this()
    
    /* private */ var curr: Any = js.native
    
    var index: Double = js.native
    
    /* protected */ def initObject(): Unit = js.native
    
    /* private */ var intervalIndex: Any = js.native
    
    def isStarted: Boolean = js.native
    
    def moveNext(): Boolean = js.native
    
    def movePrev(): Boolean = js.native
    
    /* private */ var posInInterval: Any = js.native
    
    /* private */ var sparseIntervals: Any = js.native
  }
}
