package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.axis.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAxis extends IAbstract {
  
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[Double] = js.native
  
  /** [Method] Renders the axis into the screen and updates its position
    * @param init Object
    */
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  
  /** [Method] Updates the title of this axis
    * @param title String
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
}
object IAxis {
  
  @scala.inline
  def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  
  @scala.inline
  implicit class IAxisMutableBuilder[Self <: IAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustEnd(value: Boolean): Self = StObject.set(x, "adjustEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustEndUndefined: Self = StObject.set(x, "adjustEnd", js.undefined)
    
    @scala.inline
    def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    @scala.inline
    def setDrawAxis(value: /* init */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "drawAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawAxisUndefined: Self = StObject.set(x, "drawAxis", js.undefined)
    
    @scala.inline
    def setDrawGrid(value: () => Unit): Self = StObject.set(x, "drawGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawGridUndefined: Self = StObject.set(x, "drawGrid", js.undefined)
    
    @scala.inline
    def setDrawLabel(value: () => Unit): Self = StObject.set(x, "drawLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawLabelUndefined: Self = StObject.set(x, "drawLabel", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMajorTickSteps(value: Double): Self = StObject.set(x, "majorTickSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTickStepsUndefined: Self = StObject.set(x, "majorTickSteps", js.undefined)
    
    @scala.inline
    def setMinorTickSteps(value: Double): Self = StObject.set(x, "minorTickSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickStepsUndefined: Self = StObject.set(x, "minorTickSteps", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
