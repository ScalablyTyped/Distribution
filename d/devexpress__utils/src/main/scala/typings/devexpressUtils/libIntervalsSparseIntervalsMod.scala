package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import typings.devexpressUtils.libIntervalsSparseIteratorMod.SparseIntervalsIterator
import typings.devexpressUtils.libIntervalsSparseObjectsIteratorMod.SparseObjectsIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseIntervalsMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/intervals", "SparseIntervals")
  @js.native
  open class SparseIntervals[T /* <: ConstInterval */] () extends StObject {
    def this(list: js.Array[T]) = this()
    
    /* private */ var _count: Any = js.native
    
    /* private */ var _numIntervals: Any = js.native
    
    def count: Double = js.native
    
    def getInterval(index: Double): T = js.native
    
    def getNativeIterator(): SparseIntervalsIterator[T] = js.native
    
    def getObjectsIterator[ObjT /* <: Any */](objects: js.Array[ObjT]): SparseObjectsIterator[T, ObjT] = js.native
    
    /* private */ var list: Any = js.native
    
    def numIntervals: Double = js.native
  }
}
