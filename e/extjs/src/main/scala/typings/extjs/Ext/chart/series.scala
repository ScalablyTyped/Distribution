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
    var highlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Highlight this entire series
      * @param item Object Info about the item; same format as returned by getItemForPoint.
      */
    var highlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
    
    /** [Method] Un highlights the specified item
      * @param item Object Info about the item; same format as returned by getItemForPoint
      */
    @JSName("unHighlightItem")
    var unHighlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] UnHighlight this entire series
      * @param item Object Info about the item; same format as returned by getItemForPoint.
      */
    var unHighlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IArea {
    
    inline def apply(): IArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArea]
    }
    
    extension [Self <: IArea](x: Self) {
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      inline def setHighlightSeries(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightSeries", js.Any.fromFunction1(value))
      
      inline def setHighlightSeriesUndefined: Self = StObject.set(x, "highlightSeries", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1(value))
      
      inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      inline def setUnHighlightSeries(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "unHighlightSeries", js.Any.fromFunction1(value))
      
      inline def setUnHighlightSeriesUndefined: Self = StObject.set(x, "unHighlightSeries", js.undefined)
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
    var highlightItem_IBar: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
    
    /** [Method] Un highlight any existing highlights */
    @JSName("unHighlightItem")
    var unHighlightItem_IBar: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var xPadding: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var yPadding: js.UndefOr[Any] = js.undefined
  }
  object IBar {
    
    inline def apply(): IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBar]
    }
    
    extension [Self <: IBar](x: Self) {
      
      inline def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setGroupGutter(value: Double): Self = StObject.set(x, "groupGutter", value.asInstanceOf[js.Any])
      
      inline def setGroupGutterUndefined: Self = StObject.set(x, "groupGutter", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
      
      inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      inline def setXPadding(value: Any): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
      
      inline def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
      
      inline def setYPadding(value: Any): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
      
      inline def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
    }
  }
  
  trait ICartesian
    extends StObject
       with ISeries {
    
    /** [Config Option] (String/String[]) */
    var axis: js.UndefOr[Any] = js.undefined
    
    /** [Method] Iterates over a given record s values for each of this series s yFields executing a given function for each value
      * @param record Ext.data.Model
      * @param fn Function
      * @param scope Object
      */
    var eachYValue: js.UndefOr[
        js.Function3[
          /* record */ js.UndefOr[IModel], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
    var yField: js.UndefOr[Any] = js.undefined
  }
  object ICartesian {
    
    inline def apply(): ICartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICartesian]
    }
    
    extension [Self <: ICartesian](x: Self) {
      
      inline def setAxis(value: Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setEachYValue(
        value: (/* record */ js.UndefOr[IModel], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "eachYValue", js.Any.fromFunction3(value))
      
      inline def setEachYValueUndefined: Self = StObject.set(x, "eachYValue", js.undefined)
      
      inline def setGetMinMaxXValues(value: () => Array): Self = StObject.set(x, "getMinMaxXValues", js.Any.fromFunction0(value))
      
      inline def setGetMinMaxXValuesUndefined: Self = StObject.set(x, "getMinMaxXValues", js.undefined)
      
      inline def setGetMinMaxYValues(value: () => Array): Self = StObject.set(x, "getMinMaxYValues", js.Any.fromFunction0(value))
      
      inline def setGetMinMaxYValuesUndefined: Self = StObject.set(x, "getMinMaxYValues", js.undefined)
      
      inline def setGetYValueAccessors(value: () => Array): Self = StObject.set(x, "getYValueAccessors", js.Any.fromFunction0(value))
      
      inline def setGetYValueAccessorsUndefined: Self = StObject.set(x, "getYValueAccessors", js.undefined)
      
      inline def setGetYValueCount(value: () => Double): Self = StObject.set(x, "getYValueCount", js.Any.fromFunction0(value))
      
      inline def setGetYValueCountUndefined: Self = StObject.set(x, "getYValueCount", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: Any): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
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
    
    inline def apply(): IColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumn]
    }
    
    extension [Self <: IColumn](x: Self) {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  trait IGauge
    extends StObject
       with ISeries {
    
    /** [Config Option] (String) */
    var angleField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean/Number) */
    var donut: js.UndefOr[Any] = js.undefined
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var highlightDuration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var needle: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the Gauge chart to the current specified value
      * @param value Object
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
  }
  object IGauge {
    
    inline def apply(): IGauge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGauge]
    }
    
    extension [Self <: IGauge](x: Self) {
      
      inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      inline def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
      
      inline def setDonut(value: Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
      
      inline def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
      
      inline def setNeedle(value: Boolean): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
      
      inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
      
      inline def setSetValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    var markerConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var selectionTolerance: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showMarkers: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean/Number) */
    var smooth: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
  }
  object ILine {
    
    inline def apply(): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILine]
    }
    
    extension [Self <: ILine](x: Self) {
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setMarkerConfig(value: Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      inline def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      inline def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
      
      inline def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
      
      inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      inline def setSmooth(value: Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    var donut: js.UndefOr[Any] = js.undefined
    
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
    var highlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var lengthField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
    
    /** [Method] Un highlights the specified item
      * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
      */
    @JSName("unHighlightItem")
    var unHighlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var xField: js.UndefOr[String] = js.undefined
  }
  object IPie {
    
    inline def apply(): IPie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPie]
    }
    
    extension [Self <: IPie](x: Self) {
      
      inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      inline def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
      
      inline def setColorSet(value: Array): Self = StObject.set(x, "colorSet", value.asInstanceOf[js.Any])
      
      inline def setColorSetUndefined: Self = StObject.set(x, "colorSet", js.undefined)
      
      inline def setDonut(value: Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
      
      inline def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
      
      inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      inline def setLengthField(value: String): Self = StObject.set(x, "lengthField", value.asInstanceOf[js.Any])
      
      inline def setLengthFieldUndefined: Self = StObject.set(x, "lengthField", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1(value))
      
      inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    }
  }
  
  trait IRadar
    extends StObject
       with ISeries {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var markerConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showMarkers: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var xField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var yField: js.UndefOr[String] = js.undefined
  }
  object IRadar {
    
    inline def apply(): IRadar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadar]
    }
    
    extension [Self <: IRadar](x: Self) {
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setMarkerConfig(value: Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      inline def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait IScatter
    extends StObject
       with ICartesian {
    
    /** [Method] Draws the series for the current chart  */
    var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var markerConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
  }
  object IScatter {
    
    inline def apply(): IScatter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScatter]
    }
    
    extension [Self <: IScatter](x: Self) {
      
      inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
      
      inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
      
      inline def setMarkerConfig(value: Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
      
      inline def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    var eachRecord: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
      * @param x Number
      * @param y Number
      * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
      */
    var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Any]] = js.undefined
    
    /** [Method] Returns a string with the color to be used for the series legend item
      * @param index Object
      */
    var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Return the number of records being displayed in this series  */
    var getRecordCount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Hides all the elements in the series  */
    var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var highlight: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Object) */
    var highlightCfg: js.UndefOr[Any] = js.undefined
    
    /** [Method] Highlight the given series item
      * @param item Object Info about the item; same format as returned by #getItemForPoint.
      */
    var highlightItem: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Determines whether the series item at the given index has been excluded i e
      * @param index Object
      */
    var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var label: js.UndefOr[Any] = js.undefined
    
    /** [Method] Called each time a new label is created
      * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
      * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
      * @param i Number The index of the element created (i.e the first created label, second created label, etc).
      * @param display String The label.display type. May be false if the label is hidden
      * @returns Ext.draw.Sprite The created sprite that will draw the label.
      */
    var onCreateLabel: js.UndefOr[
        js.Function4[js.UndefOr[IModel], js.UndefOr[Any], js.UndefOr[Double], js.UndefOr[String], ISprite]
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
          js.UndefOr[Any], 
          js.UndefOr[Double], 
          js.UndefOr[String], 
          js.UndefOr[Boolean], 
          js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Function) */
    var renderer: js.UndefOr[Any] = js.undefined
    
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
    var tips: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** [Method] Un highlight any existing highlights */
    var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISeries {
    
    inline def apply(): ISeries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeries]
    }
    
    extension [Self <: ISeries](x: Self) {
      
      inline def setEachRecord(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "eachRecord", js.Any.fromFunction2(value))
      
      inline def setEachRecordUndefined: Self = StObject.set(x, "eachRecord", js.undefined)
      
      inline def setGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Any): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
      
      inline def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
      
      inline def setGetLegendColor(value: /* index */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getLegendColor", js.Any.fromFunction1(value))
      
      inline def setGetLegendColorUndefined: Self = StObject.set(x, "getLegendColor", js.undefined)
      
      inline def setGetRecordCount(value: () => Unit): Self = StObject.set(x, "getRecordCount", js.Any.fromFunction0(value))
      
      inline def setGetRecordCountUndefined: Self = StObject.set(x, "getRecordCount", js.undefined)
      
      inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
      
      inline def setHideAllUndefined: Self = StObject.set(x, "hideAll", js.undefined)
      
      inline def setHighlight(value: Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightCfg(value: Any): Self = StObject.set(x, "highlightCfg", value.asInstanceOf[js.Any])
      
      inline def setHighlightCfgUndefined: Self = StObject.set(x, "highlightCfg", js.undefined)
      
      inline def setHighlightItem(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
      
      inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setIsExcluded(value: /* index */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "isExcluded", js.Any.fromFunction1(value))
      
      inline def setIsExcludedUndefined: Self = StObject.set(x, "isExcluded", js.undefined)
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnCreateLabel(value: (js.UndefOr[IModel], js.UndefOr[Any], js.UndefOr[Double], js.UndefOr[String]) => ISprite): Self = StObject.set(x, "onCreateLabel", js.Any.fromFunction4(value))
      
      inline def setOnCreateLabelUndefined: Self = StObject.set(x, "onCreateLabel", js.undefined)
      
      inline def setOnPlaceLabel(
        value: (js.UndefOr[ISprite], js.UndefOr[IModel], js.UndefOr[Any], js.UndefOr[Double], js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onPlaceLabel", js.Any.fromFunction7(value))
      
      inline def setOnPlaceLabelUndefined: Self = StObject.set(x, "onPlaceLabel", js.undefined)
      
      inline def setRenderer(value: Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSetTitle(value: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction2(value))
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setShadowAttributes(value: Array): Self = StObject.set(x, "shadowAttributes", value.asInstanceOf[js.Any])
      
      inline def setShadowAttributesUndefined: Self = StObject.set(x, "shadowAttributes", js.undefined)
      
      inline def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
      
      inline def setShowAllUndefined: Self = StObject.set(x, "showAll", js.undefined)
      
      inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
      
      inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
      
      inline def setTips(value: Any): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
      
      inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    }
  }
}
