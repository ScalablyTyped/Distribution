package typings.fusioncharts

import org.scalablytyped.runtime.Shortcut
import typings.fusioncharts.mod.ChartObject
import typings.fusioncharts.mod.DataStore
import typings.fusioncharts.mod.FusionChartStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FusionCharts extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("FusionCharts")
    @js.native
    open class ^ protected ()
      extends StObject
         with typings.fusioncharts.mod.FusionCharts {
      def this(chartObject: js.Object) = this()
      def this(chartObject: ChartObject) = this()
    }
    
    @JSGlobal("FusionCharts")
    @js.native
    val ^ : FusionChartStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("FusionCharts.DataStore")
    @js.native
    open class DataStoreCls ()
      extends StObject
         with DataStore
    
    type _To = FusionChartStatic
    
    /* This means you don't have to write `^`, but can instead just say `FusionCharts.foo` */
    override def _to: FusionChartStatic = ^
  }
}
