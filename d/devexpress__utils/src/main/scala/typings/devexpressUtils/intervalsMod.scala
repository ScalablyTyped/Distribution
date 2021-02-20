package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.iteratorMod.SparseIntervalsIterator
import typings.devexpressUtils.objectsIteratorMod.SparseObjectsIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalsMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/intervals", "SparseIntervals")
  @js.native
  class SparseIntervals[T /* <: ConstInterval */] () extends StObject {
    def this(list: js.Array[T]) = this()
    
    var _count: js.Any = js.native
    
    var _numIntervals: js.Any = js.native
    
    val count: Double = js.native
    
    def getInterval(index: Double): T = js.native
    
    def getNativeIterator(): SparseIntervalsIterator[T] = js.native
    
    def getObjectsIterator[ObjT /* <: js.Any */](objects: js.Array[ObjT]): SparseObjectsIterator[T, ObjT] = js.native
    
    var list: js.Any = js.native
    
    val numIntervals: Double = js.native
  }
}
