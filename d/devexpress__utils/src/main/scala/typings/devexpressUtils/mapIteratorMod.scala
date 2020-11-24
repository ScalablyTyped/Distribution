package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/sparse/map-iterator", JSImport.Namespace)
@js.native
object mapIteratorMod extends js.Object {
  
  @js.native
  class SparseIntervalsMapIterator[T /* <: ConstInterval */, ObjT] protected () extends js.Object {
    def this(intervals: js.Array[T], valMap: Record[Double, ObjT]) = this()
    
    var interval: T = js.native
    
    var intervalIndex: Double = js.native
    
    def moveToNextInterval(): Boolean = js.native
    
    def moveToNextPosition(): Boolean = js.native
    
    val numIntervals: Double = js.native
    
    var `object`: ObjT = js.native
    
    var posInInterval: Double = js.native
    
    var position: Double = js.native
    
    var sparseIntervals: js.Any = js.native
    
    var valMap: js.Any = js.native
  }
}
