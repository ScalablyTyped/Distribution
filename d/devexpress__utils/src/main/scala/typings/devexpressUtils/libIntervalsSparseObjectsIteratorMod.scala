package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import typings.devexpressUtils.libIntervalsSparseIntervalsMod.SparseIntervals
import typings.devexpressUtils.libIntervalsSparseIteratorMod.SparseIntervalsIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseObjectsIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/objects-iterator", "SparseObjectsIterator")
  @js.native
  open class SparseObjectsIterator[T /* <: ConstInterval */, ObjT] protected () extends SparseIntervalsIterator[T] {
    def this(sparseIntervals: SparseIntervals[T], objects: js.Array[ObjT]) = this()
    
    var obj: ObjT = js.native
    
    var objects: js.Array[ObjT] = js.native
  }
}
