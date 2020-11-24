package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.intervalsMod.SparseIntervals
import typings.devexpressUtils.iteratorMod.SparseIntervalsIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/sparse/objects-iterator", JSImport.Namespace)
@js.native
object objectsIteratorMod extends js.Object {
  
  @js.native
  class SparseObjectsIterator[T /* <: ConstInterval */, ObjT] protected () extends SparseIntervalsIterator[T] {
    def this(sparseIntervals: SparseIntervals[T], objects: js.Array[ObjT]) = this()
    
    var obj: ObjT = js.native
    
    var objects: js.Array[ObjT] = js.native
  }
}
