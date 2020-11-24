package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.series.ISeries
import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICartesianSeries extends ISeries {
  
  /** [Config Option] (String/String[]) */
  var axis: js.UndefOr[js.Any] = js.native
  
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
  ] = js.native
  
  /** [Method] Calculate the min and max values for this series s xField
    * @returns Array [min, max]
    */
  var getMinMaxXValues: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Calculate the min and max values for this series s yField s
    * @returns Array [min, max]
    */
  var getMinMaxYValues: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns an array of functions each of which returns the value of the yField corresponding to function s index in the
    * @returns Array array of accessor functions
    */
  var getYValueAccessors: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the number of yField values taking into account fields combined via legend drag drop
    * @returns Number
    */
  var getYValueCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/String[]) */
  var yField: js.UndefOr[js.Any] = js.native
}
object ICartesianSeries {
  
  @scala.inline
  def apply(): ICartesianSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesianSeries]
  }
  
  @scala.inline
  implicit class ICartesianSeriesOps[Self <: ICartesianSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: js.Any): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setEachYValue(
      value: (/* record */ js.UndefOr[IModel], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("eachYValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEachYValue: Self = this.set("eachYValue", js.undefined)
    
    @scala.inline
    def setGetMinMaxXValues(value: () => Array): Self = this.set("getMinMaxXValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinMaxXValues: Self = this.set("getMinMaxXValues", js.undefined)
    
    @scala.inline
    def setGetMinMaxYValues(value: () => Array): Self = this.set("getMinMaxYValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinMaxYValues: Self = this.set("getMinMaxYValues", js.undefined)
    
    @scala.inline
    def setGetYValueAccessors(value: () => Array): Self = this.set("getYValueAccessors", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYValueAccessors: Self = this.set("getYValueAccessors", js.undefined)
    
    @scala.inline
    def setGetYValueCount(value: () => Double): Self = this.set("getYValueCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYValueCount: Self = this.set("getYValueCount", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    
    @scala.inline
    def setYField(value: js.Any): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
