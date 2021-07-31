package typings.extjs.Ext.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumericAxis
  extends StObject
     with typings.extjs.Ext.chart.axis.IAxis {
  
  /** [Config Option] (Boolean) */
  var adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.undefined
}
object INumericAxis {
  
  @scala.inline
  def apply(): INumericAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumericAxis]
  }
  
  @scala.inline
  implicit class INumericAxisMutableBuilder[Self <: INumericAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustMaximumByMajorUnit(value: Boolean): Self = StObject.set(x, "adjustMaximumByMajorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "adjustMaximumByMajorUnit", js.undefined)
    
    @scala.inline
    def setAdjustMinimumByMajorUnit(value: Boolean): Self = StObject.set(x, "adjustMinimumByMajorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "adjustMinimumByMajorUnit", js.undefined)
    
    @scala.inline
    def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
