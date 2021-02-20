package typings.devexpressUtils

import typings.devexpressUtils.mapIteratorMod.SparseIntervalsMapIterator
import typings.devexpressUtils.mutableMod.MutableInterval
import typings.devexpressUtils.reproducibleMod.IReproducibleInterval
import typings.devexpressUtils.typesMod.CmpFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapCollectorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/map-collector", "SparseIntervalsMapCollector")
  @js.native
  class SparseIntervalsMapCollector[IntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[IntervalT] */, ObjT] protected () extends StObject {
    def this(cmp: CmpFunc[ObjT], template: TemplateT) = this()
    
    def add(index: Double, value: ObjT): Unit = js.native
    
    var cmp: js.Any = js.native
    
    var curr: js.Any = js.native
    
    var currVal: js.Any = js.native
    
    def getIterator(): SparseIntervalsMapIterator[IntervalT, ObjT] = js.native
    
    var intervals: js.Any = js.native
    
    var template: js.Any = js.native
    
    var valMap: js.Any = js.native
  }
}
