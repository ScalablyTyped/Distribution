package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.series.ISeries
import typings.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICartesianSeries
  extends StObject
     with ISeries {
  
  /** [Config Option] (String/String[]) */
  var axis: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Iterates over a given record s values for each of this series s yFields executing a given function for each value
    * @param record Ext.data.Model
    * @param fn Function
    * @param scope Object
    */
  var eachYValue: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[IModel], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Calculate the min and max values for this series s xField
    * @returns Array [min, max]
    */
  var getMinMaxXValues: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Calculate the min and max values for this series s yField s
    * @returns Array [min, max]
    */
  var getMinMaxYValues: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns an array of functions each of which returns the value of the yField corresponding to function s index in the
    * @returns Array array of accessor functions
    */
  var getYValueAccessors: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the number of yField values taking into account fields combined via legend drag drop
    * @returns Number
    */
  var getYValueCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var yField: js.UndefOr[js.Any] = js.undefined
}
object ICartesianSeries {
  
  @scala.inline
  def apply(): ICartesianSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesianSeries]
  }
  
  @scala.inline
  implicit class ICartesianSeriesMutableBuilder[Self <: ICartesianSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setEachYValue(
      value: (/* record */ js.UndefOr[IModel], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "eachYValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEachYValueUndefined: Self = StObject.set(x, "eachYValue", js.undefined)
    
    @scala.inline
    def setGetMinMaxXValues(value: () => Array): Self = StObject.set(x, "getMinMaxXValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinMaxXValuesUndefined: Self = StObject.set(x, "getMinMaxXValues", js.undefined)
    
    @scala.inline
    def setGetMinMaxYValues(value: () => Array): Self = StObject.set(x, "getMinMaxYValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinMaxYValuesUndefined: Self = StObject.set(x, "getMinMaxYValues", js.undefined)
    
    @scala.inline
    def setGetYValueAccessors(value: () => Array): Self = StObject.set(x, "getYValueAccessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYValueAccessorsUndefined: Self = StObject.set(x, "getYValueAccessors", js.undefined)
    
    @scala.inline
    def setGetYValueCount(value: () => Double): Self = StObject.set(x, "getYValueCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYValueCountUndefined: Self = StObject.set(x, "getYValueCount", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    
    @scala.inline
    def setYField(value: js.Any): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
  }
}
