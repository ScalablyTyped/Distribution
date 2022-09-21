package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/map-iterator", "SparseIntervalsMapIterator")
  @js.native
  open class SparseIntervalsMapIterator[T /* <: ConstInterval */, ObjT] protected () extends StObject {
    def this(intervals: js.Array[T], valMap: Record[Double, ObjT]) = this()
    
    var interval: T = js.native
    
    var intervalIndex: Double = js.native
    
    def moveToNextInterval(): Boolean = js.native
    
    def moveToNextPosition(): Boolean = js.native
    
    def numIntervals: Double = js.native
    
    var `object`: ObjT = js.native
    
    var posInInterval: Double = js.native
    
    var position: Double = js.native
    
    /* private */ var sparseIntervals: Any = js.native
    
    /* private */ var valMap: Any = js.native
  }
}
