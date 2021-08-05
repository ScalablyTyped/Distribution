package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.intervalsMod.SparseIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/iterator", "SparseIntervalsIterator")
  @js.native
  class SparseIntervalsIterator[T /* <: ConstInterval */] protected () extends StObject {
    def this(sparseIntervals: SparseIntervals[T]) = this()
    
    /* private */ var curr: js.Any = js.native
    
    var index: Double = js.native
    
    /* protected */ def initObject(): Unit = js.native
    
    /* private */ var intervalIndex: js.Any = js.native
    
    val isStarted: Boolean = js.native
    
    def moveNext(): Boolean = js.native
    
    def movePrev(): Boolean = js.native
    
    /* private */ var posInInterval: js.Any = js.native
    
    /* private */ var sparseIntervals: js.Any = js.native
  }
}
