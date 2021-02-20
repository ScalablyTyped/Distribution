package typings.devexpressUtils

import typings.devexpressUtils.intervalsMod.SparseIntervals
import typings.devexpressUtils.mutableMod.MutableInterval
import typings.devexpressUtils.reproducibleMod.IReproducibleInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/collector", "SparseIntervalsCollector")
  @js.native
  class SparseIntervalsCollector[IntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[IntervalT] */] protected () extends StObject {
    def this(template: TemplateT) = this()
    
    def add(index: Double): Unit = js.native
    
    var curr: js.Any = js.native
    
    def getIntervals(): SparseIntervals[IntervalT] = js.native
    
    var intervals: js.Any = js.native
    
    var template: js.Any = js.native
  }
}
