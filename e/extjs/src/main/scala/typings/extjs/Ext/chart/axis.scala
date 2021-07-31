package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axis {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Config Option] (String[]) */
    var fields: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Ext.chart.Label) */
    var label: js.UndefOr[ILabel] = js.undefined
  }
  object IAbstract {
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Array): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setLabel(value: ILabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait IAxis
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Boolean) */
    var adjustEnd: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var dashSize: js.UndefOr[Double] = js.undefined
    
    /** [Method] Renders the axis into the screen and updates its position
      * @param init Object
      */
    var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Renders an horizontal and or vertical grid into the Surface  */
    var drawGrid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Renders the labels in the axes  */
    var drawLabel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var grid: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var length: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var majorTickSteps: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minorTickSteps: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var position: js.UndefOr[String] = js.undefined
    
    /** [Method] Updates the title of this axis
      * @param title String
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IAxis {
    
    @scala.inline
    def apply(): typings.extjs.Ext.chart.axis.IAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.chart.axis.IAxis]
    }
    
    @scala.inline
    implicit class IAxisMutableBuilder[Self <: typings.extjs.Ext.chart.axis.IAxis] (val x: Self) extends AnyVal {
      
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
  
  trait ICategory
    extends StObject
       with typings.extjs.Ext.chart.axis.IAxis {
    
    /** [Config Option] (Boolean) */
    var calculateCategoryCount: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var categoryNames: js.UndefOr[String] = js.undefined
  }
  object ICategory {
    
    @scala.inline
    def apply(): ICategory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICategory]
    }
    
    @scala.inline
    implicit class ICategoryMutableBuilder[Self <: ICategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateCategoryCount(value: Boolean): Self = StObject.set(x, "calculateCategoryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculateCategoryCountUndefined: Self = StObject.set(x, "calculateCategoryCount", js.undefined)
      
      @scala.inline
      def setCategoryNames(value: String): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
    }
  }
  
  trait IGauge
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Number) */
    var margin: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** [Method] Updates the title of this axis
      * @param title String
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var steps: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[String] = js.undefined
  }
  object IGauge {
    
    @scala.inline
    def apply(): IGauge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGauge]
    }
    
    @scala.inline
    implicit class IGaugeMutableBuilder[Self <: IGauge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait INumeric
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
  object INumeric {
    
    @scala.inline
    def apply(): INumeric = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INumeric]
    }
    
    @scala.inline
    implicit class INumericMutableBuilder[Self <: INumeric] (val x: Self) extends AnyVal {
      
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
  
  trait IRadial
    extends StObject
       with INumeric {
    
    /** [Config Option] (Number) */
    var steps: js.UndefOr[Double] = js.undefined
  }
  object IRadial {
    
    @scala.inline
    def apply(): IRadial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadial]
    }
    
    @scala.inline
    implicit class IRadialMutableBuilder[Self <: IRadial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    }
  }
  
  trait ITime
    extends StObject
       with INumeric {
    
    /** [Config Option] (String/Boolean) */
    var dateFormat: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Date) */
    var fromDate: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Array) */
    var step: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Date) */
    var toDate: js.UndefOr[js.Any] = js.undefined
  }
  object ITime {
    
    @scala.inline
    def apply(): ITime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITime]
    }
    
    @scala.inline
    implicit class ITimeMutableBuilder[Self <: ITime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFormat(value: js.Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setFromDate(value: js.Any): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      @scala.inline
      def setStep(value: Array): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setToDate(value: js.Any): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    }
  }
}
