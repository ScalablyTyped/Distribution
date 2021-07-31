package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.draw.ISprite
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object series {
  
  trait IArea
    extends StObject
       with ICartesian {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Highlight the specified item
      * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
      */
    @JSName("highlightItem")
    var highlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Highlight this entire series
      * @param item Object Info about the item; same format as returned by getItemForPoint.
      */
    var highlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Un highlights the specified item
      * @param item Object Info about the item; same format as returned by getItemForPoint
      */
    @JSName("unHighlightItem")
    var unHighlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] UnHighlight this entire series
      * @param item Object Info about the item; same format as returned by getItemForPoint.
      */
    var unHighlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IArea {
    
    @scala.inline
    def apply(): IArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArea]
    }
    
    @scala.inline
    implicit class IAreaMutableBuilder[Self <: IArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      @scala.inline
      def setHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightSeries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHighlightSeriesUndefined: Self = StObject.set(x, "highlightSeries", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      @scala.inline
      def setUnHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unHighlightSeries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnHighlightSeriesUndefined: Self = StObject.set(x, "unHighlightSeries", js.undefined)
    }
  }
  
  trait IBar
    extends StObject
       with ICartesian {
    
    /** [Config Option] (Boolean) */
    var column: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var groupGutter: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /** [Method] Highlight the given series item
      * @param item Object
      */
    @JSName("highlightItem")
    var highlightItem_IBar: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Un highlight any existing highlights */
    @JSName("unHighlightItem")
    var unHighlightItem_IBar: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var xPadding: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var yPadding: js.UndefOr[js.Any] = js.undefined
  }
  object IBar {
    
    @scala.inline
    def apply(): IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBar]
    }
    
    @scala.inline
    implicit class IBarMutableBuilder[Self <: IBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setGroupGutter(value: Double): Self = StObject.set(x, "groupGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupGutterUndefined: Self = StObject.set(x, "groupGutter", js.undefined)
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      @scala.inline
      def setXPadding(value: js.Any): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
      
      @scala.inline
      def setYPadding(value: js.Any): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
    }
  }
  
  trait ICartesian
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
  object ICartesian {
    
    @scala.inline
    def apply(): ICartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICartesian]
    }
    
    @scala.inline
    implicit class ICartesianMutableBuilder[Self <: ICartesian] (val x: Self) extends AnyVal {
      
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
  
  trait IColumn
    extends StObject
       with IBar {
    
    /** [Config Option] (String) */
    @JSName("axis")
    var axis_IColumn: js.UndefOr[String] = js.undefined
  }
  object IColumn {
    
    @scala.inline
    def apply(): IColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumn]
    }
    
    @scala.inline
    implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  trait IGauge
    extends StObject
       with ISeries {
    
    /** [Config Option] (String) */
    var angleField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean/Number) */
    var donut: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var highlightDuration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var needle: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the Gauge chart to the current specified value
      * @param value Object
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
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
      def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
      
      @scala.inline
      def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
      
      @scala.inline
      def setNeedle(value: Boolean): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
      
      @scala.inline
      def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ILine
    extends StObject
       with ICartesian {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var markerConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number) */
    var selectionTolerance: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showMarkers: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean/Number) */
    var smooth: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object ILine {
    
    @scala.inline
    def apply(): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILine]
    }
    
    @scala.inline
    implicit class ILineMutableBuilder[Self <: ILine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setMarkerConfig(value: js.Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      @scala.inline
      def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
      
      @scala.inline
      def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      @scala.inline
      def setSmooth(value: js.Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait IPie
    extends StObject
       with ISeries {
    
    /** [Config Option] (String) */
    var angleField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Array) */
    var colorSet: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Boolean/Number) */
    var donut: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var field: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var highlightDuration: js.UndefOr[Double] = js.undefined
    
    /** [Method] Highlight the specified item
      * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
      */
    @JSName("highlightItem")
    var highlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var lengthField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Un highlights the specified item
      * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
      */
    @JSName("unHighlightItem")
    var unHighlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var xField: js.UndefOr[String] = js.undefined
  }
  object IPie {
    
    @scala.inline
    def apply(): IPie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPie]
    }
    
    @scala.inline
    implicit class IPieMutableBuilder[Self <: IPie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
      
      @scala.inline
      def setColorSet(value: Array): Self = StObject.set(x, "colorSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSetUndefined: Self = StObject.set(x, "colorSet", js.undefined)
      
      @scala.inline
      def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
      
      @scala.inline
      def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      @scala.inline
      def setLengthField(value: String): Self = StObject.set(x, "lengthField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthFieldUndefined: Self = StObject.set(x, "lengthField", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      @scala.inline
      def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    }
  }
  
  trait IRadar
    extends StObject
       with ISeries {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var markerConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showMarkers: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var xField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var yField: js.UndefOr[String] = js.undefined
  }
  object IRadar {
    
    @scala.inline
    def apply(): IRadar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadar]
    }
    
    @scala.inline
    implicit class IRadarMutableBuilder[Self <: IRadar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setMarkerConfig(value: js.Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      @scala.inline
      def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      @scala.inline
      def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait IScatter
    extends StObject
       with ICartesian {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var markerConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object IScatter {
    
    @scala.inline
    def apply(): IScatter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScatter]
    }
    
    @scala.inline
    implicit class IScatterMutableBuilder[Self <: IScatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      @scala.inline
      def setMarkerConfig(value: js.Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.chart.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem
  - typings.extjs.Ext.chart.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ trait ISeries
    extends StObject
       with IObservable {
    
    /** [Method] Iterate over each of the records for this series
      * @param fn Function The function to execute for each record.
      * @param scope Object Scope for the fn.
      */
    var eachRecord: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
      * @param x Number
      * @param y Number
      * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
      */
    var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], js.Any]] = js.undefined
    
    /** [Method] Returns a string with the color to be used for the series legend item
      * @param index Object
      */
    var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Return the number of records being displayed in this series  */
    var getRecordCount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Hides all the elements in the series  */
    var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var highlight: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var highlightCfg: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Highlight the given series item
      * @param item Object Info about the item; same format as returned by #getItemForPoint.
      */
    var highlightItem: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Determines whether the series item at the given index has been excluded i e
      * @param index Object
      */
    var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var label: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Called each time a new label is created
      * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
      * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
      * @param i Number The index of the element created (i.e the first created label, second created label, etc).
      * @param display String The label.display type. May be false if the label is hidden
      * @returns Ext.draw.Sprite The created sprite that will draw the label.
      */
    var onCreateLabel: js.UndefOr[
        js.Function4[js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], ISprite]
      ] = js.undefined
    
    /** [Method] Called for updating the position of the label
      * @param label Ext.draw.Sprite The sprite that draws the label.
      * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
      * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
      * @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
      * @param display String The label.display type. May be false if the label is hidden
      * @param animate Boolean A boolean value to set or unset animations for the labels.
      * @param index Number The series index.
      */
    var onPlaceLabel: js.UndefOr[
        js.Function7[
          js.UndefOr[ISprite], 
          js.UndefOr[IModel], 
          js.UndefOr[js.Any], 
          js.UndefOr[Double], 
          js.UndefOr[String], 
          js.UndefOr[Boolean], 
          js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Function) */
    var renderer: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Changes the value of the title for the series
      * @param index Number
      * @param title String
      */
    var setTitle: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
      ] = js.undefined
    
    /** [Config Option] (Array) */
    var shadowAttributes: js.UndefOr[Array] = js.undefined
    
    /** [Method] Shows all the elements in the series  */
    var showAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showInLegend: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var tips: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** [Method] Un highlight any existing highlights */
    var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISeries {
    
    @scala.inline
    def apply(): ISeries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeries]
    }
    
    @scala.inline
    implicit class ISeriesMutableBuilder[Self <: ISeries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEachRecord(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachRecord", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEachRecordUndefined: Self = StObject.set(x, "eachRecord", js.undefined)
      
      @scala.inline
      def setGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
      
      @scala.inline
      def setGetLegendColor(value: /* index */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getLegendColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLegendColorUndefined: Self = StObject.set(x, "getLegendColor", js.undefined)
      
      @scala.inline
      def setGetRecordCount(value: () => Unit): Self = StObject.set(x, "getRecordCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordCountUndefined: Self = StObject.set(x, "getRecordCount", js.undefined)
      
      @scala.inline
      def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideAllUndefined: Self = StObject.set(x, "hideAll", js.undefined)
      
      @scala.inline
      def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCfg(value: js.Any): Self = StObject.set(x, "highlightCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCfgUndefined: Self = StObject.set(x, "highlightCfg", js.undefined)
      
      @scala.inline
      def setHighlightItem(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setIsExcluded(value: /* index */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "isExcluded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsExcludedUndefined: Self = StObject.set(x, "isExcluded", js.undefined)
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnCreateLabel(value: (js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String]) => ISprite): Self = StObject.set(x, "onCreateLabel", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCreateLabelUndefined: Self = StObject.set(x, "onCreateLabel", js.undefined)
      
      @scala.inline
      def setOnPlaceLabel(
        value: (js.UndefOr[ISprite], js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onPlaceLabel", js.Any.fromFunction7(value))
      
      @scala.inline
      def setOnPlaceLabelUndefined: Self = StObject.set(x, "onPlaceLabel", js.undefined)
      
      @scala.inline
      def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setSetTitle(value: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setShadowAttributes(value: Array): Self = StObject.set(x, "shadowAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowAttributesUndefined: Self = StObject.set(x, "shadowAttributes", js.undefined)
      
      @scala.inline
      def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowAllUndefined: Self = StObject.set(x, "showAll", js.undefined)
      
      @scala.inline
      def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
      
      @scala.inline
      def setTips(value: js.Any): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    }
  }
}
