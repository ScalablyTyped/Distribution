package typings.devexpressUtils

import typings.devexpressUtils.intervalsMod.SparseIntervals
import typings.devexpressUtils.mutableMod.MutableInterval
import typings.devexpressUtils.reproducibleMod.IReproducibleInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/sparse/collector", JSImport.Namespace)
@js.native
object collectorMod extends js.Object {
  
  @js.native
  class SparseIntervalsCollector[IntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[IntervalT] */] protected () extends js.Object {
    def this(template: TemplateT) = this()
    
    def add(index: Double): Unit = js.native
    
    var curr: js.Any = js.native
    
    def getIntervals(): SparseIntervals[IntervalT] = js.native
    
    var intervals: js.Any = js.native
    
    var template: js.Any = js.native
  }
}
