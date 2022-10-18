package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsMutableMod.MutableInterval
import typings.devexpressUtils.libIntervalsReproducibleMod.IReproducibleInterval
import typings.devexpressUtils.libIntervalsSparseMapIteratorMod.SparseIntervalsMapIterator
import typings.devexpressUtils.libTypesMod.CmpFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseMapCollectorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/map-collector", "SparseIntervalsMapCollector")
  @js.native
  open class SparseIntervalsMapCollector[IntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[IntervalT] */, ObjT] protected () extends StObject {
    def this(cmp: CmpFunc[ObjT], template: TemplateT) = this()
    
    def add(index: Double, value: ObjT): Unit = js.native
    
    /* private */ var cmp: Any = js.native
    
    /* private */ var curr: Any = js.native
    
    /* private */ var currVal: Any = js.native
    
    def getIterator(): SparseIntervalsMapIterator[IntervalT, ObjT] = js.native
    
    /* private */ var intervals: Any = js.native
    
    /* private */ var template: Any = js.native
    
    /* private */ var valMap: Any = js.native
  }
}
