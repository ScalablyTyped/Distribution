package typings.dygraphs

import typings.dygraphs.dygraphsBooleans.`false`
import typings.dygraphs.dygraphsStrings.x
import typings.dygraphs.dygraphsStrings.y
import typings.dygraphs.mod.Dygraph
import typings.dygraphs.mod.dygraphs.Annotation
import typings.dygraphs.mod.dygraphs.AnnotationClickHandler
import typings.dygraphs.mod.dygraphs.AnnotationDblClickHandler
import typings.dygraphs.mod.dygraphs.AnnotationMouseOutHandler
import typings.dygraphs.mod.dygraphs.AnnotationMouseOverHandler
import typings.dygraphs.mod.dygraphs.Area
import typings.dygraphs.mod.dygraphs.Options
import typings.dygraphs.mod.dygraphs.PerAxisOptions
import typings.dygraphs.mod.dygraphs.SeriesProperties
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ErrorPlotter extends StObject {
    
    def errorPlotter(event: Any): Unit
    
    def fillPlotter(event: Any): Unit
    
    def linePlotter(event: Any): Unit
  }
  object ErrorPlotter {
    
    inline def apply(errorPlotter: Any => Unit, fillPlotter: Any => Unit, linePlotter: Any => Unit): ErrorPlotter = {
      val __obj = js.Dynamic.literal(errorPlotter = js.Any.fromFunction1(errorPlotter), fillPlotter = js.Any.fromFunction1(fillPlotter), linePlotter = js.Any.fromFunction1(linePlotter))
      __obj.asInstanceOf[ErrorPlotter]
    }
    
    extension [Self <: ErrorPlotter](x: Self) {
      
      inline def setErrorPlotter(value: Any => Unit): Self = StObject.set(x, "errorPlotter", js.Any.fromFunction1(value))
      
      inline def setFillPlotter(value: Any => Unit): Self = StObject.set(x, "fillPlotter", js.Any.fromFunction1(value))
      
      inline def setLinePlotter(value: Any => Unit): Self = StObject.set(x, "linePlotter", js.Any.fromFunction1(value))
    }
  }
  
  trait Idx extends StObject {
    
    var idx: Double
    
    var name: String
    
    var x: js.UndefOr[Double] = js.undefined
    
    var xval: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var y_bottom: js.UndefOr[Double] = js.undefined
    
    var y_stacked: js.UndefOr[Double] = js.undefined
    
    var y_top: js.UndefOr[Double] = js.undefined
    
    var yval: js.UndefOr[Double] = js.undefined
    
    var yval_minus: js.UndefOr[Double] = js.undefined
    
    var yval_plus: js.UndefOr[Double] = js.undefined
    
    var yval_stacked: js.UndefOr[Double] = js.undefined
  }
  object Idx {
    
    inline def apply(idx: Double, name: String): Idx = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    extension [Self <: Idx](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXval(value: Double): Self = StObject.set(x, "xval", value.asInstanceOf[js.Any])
      
      inline def setXvalUndefined: Self = StObject.set(x, "xval", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setY_bottom(value: Double): Self = StObject.set(x, "y_bottom", value.asInstanceOf[js.Any])
      
      inline def setY_bottomUndefined: Self = StObject.set(x, "y_bottom", js.undefined)
      
      inline def setY_stacked(value: Double): Self = StObject.set(x, "y_stacked", value.asInstanceOf[js.Any])
      
      inline def setY_stackedUndefined: Self = StObject.set(x, "y_stacked", js.undefined)
      
      inline def setY_top(value: Double): Self = StObject.set(x, "y_top", value.asInstanceOf[js.Any])
      
      inline def setY_topUndefined: Self = StObject.set(x, "y_top", js.undefined)
      
      inline def setYval(value: Double): Self = StObject.set(x, "yval", value.asInstanceOf[js.Any])
      
      inline def setYvalUndefined: Self = StObject.set(x, "yval", js.undefined)
      
      inline def setYval_minus(value: Double): Self = StObject.set(x, "yval_minus", value.asInstanceOf[js.Any])
      
      inline def setYval_minusUndefined: Self = StObject.set(x, "yval_minus", js.undefined)
      
      inline def setYval_plus(value: Double): Self = StObject.set(x, "yval_plus", value.asInstanceOf[js.Any])
      
      inline def setYval_plusUndefined: Self = StObject.set(x, "yval_plus", js.undefined)
      
      inline def setYval_stacked(value: Double): Self = StObject.set(x, "yval_stacked", value.asInstanceOf[js.Any])
      
      inline def setYval_stackedUndefined: Self = StObject.set(x, "yval_stacked", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var v: Double
  }
  object Label {
    
    inline def apply(label: String, v: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<dygraphs.dygraphs.dygraphs.Axis, dygraphs.dygraphs.dygraphs.PerAxisOptions>> */
  trait PartialRecordAxisPerAxisO extends StObject {
    
    var x: js.UndefOr[PerAxisOptions] = js.undefined
    
    var y: js.UndefOr[PerAxisOptions] = js.undefined
    
    var y2: js.UndefOr[PerAxisOptions] = js.undefined
  }
  object PartialRecordAxisPerAxisO {
    
    inline def apply(): PartialRecordAxisPerAxisO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordAxisPerAxisO]
    }
    
    extension [Self <: PartialRecordAxisPerAxisO](x: Self) {
      
      inline def setX(value: PerAxisOptions): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: PerAxisOptions): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: PerAxisOptions): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<dygraphs.dygraphs.dygraphs.Annotation> */
  trait ReadonlyAnnotation extends StObject {
    
    val attachAtBottom: js.UndefOr[Boolean] = js.undefined
    
    val clickHandler: js.UndefOr[AnnotationClickHandler] = js.undefined
    
    val cssClass: js.UndefOr[String] = js.undefined
    
    val dblClickHandler: js.UndefOr[AnnotationDblClickHandler] = js.undefined
    
    val div: js.UndefOr[HTMLDivElement] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val icon: js.UndefOr[String] = js.undefined
    
    val mouseOutHandler: js.UndefOr[AnnotationMouseOutHandler] = js.undefined
    
    val mouseOverHandler: js.UndefOr[AnnotationMouseOverHandler] = js.undefined
    
    val series: String
    
    val shortText: js.UndefOr[String] = js.undefined
    
    val text: js.UndefOr[String] = js.undefined
    
    val tickColor: js.UndefOr[String] = js.undefined
    
    val tickHeight: js.UndefOr[Double] = js.undefined
    
    val tickWidth: js.UndefOr[Double] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
    
    val x: js.UndefOr[Double | String] = js.undefined
  }
  object ReadonlyAnnotation {
    
    inline def apply(series: String): ReadonlyAnnotation = {
      val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyAnnotation]
    }
    
    extension [Self <: ReadonlyAnnotation](x: Self) {
      
      inline def setAttachAtBottom(value: Boolean): Self = StObject.set(x, "attachAtBottom", value.asInstanceOf[js.Any])
      
      inline def setAttachAtBottomUndefined: Self = StObject.set(x, "attachAtBottom", js.undefined)
      
      inline def setClickHandler(
        value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
      ): Self = StObject.set(x, "clickHandler", js.Any.fromFunction4(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDblClickHandler(
        value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
      ): Self = StObject.set(x, "dblClickHandler", js.Any.fromFunction4(value))
      
      inline def setDblClickHandlerUndefined: Self = StObject.set(x, "dblClickHandler", js.undefined)
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMouseOutHandler(
        value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
      ): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction4(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(
        value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
      ): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction4(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
      
      inline def setShortTextUndefined: Self = StObject.set(x, "shortText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTickColor(value: String): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickHeight(value: Double): Self = StObject.set(x, "tickHeight", value.asInstanceOf[js.Any])
      
      inline def setTickHeightUndefined: Self = StObject.set(x, "tickHeight", js.undefined)
      
      inline def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<dygraphs.dygraphs.dygraphs.Area> */
  trait ReadonlyArea extends StObject {
    
    val h: Double
    
    val w: Double
    
    val x: Double
    
    val y: Double
  }
  object ReadonlyArea {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): ReadonlyArea = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyArea]
    }
    
    extension [Self <: ReadonlyArea](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<dygraphs.dygraphs.Dygraph> */
  @js.native
  trait ReadonlyDygraph extends StObject {
    
    def adjustRoll(length: Double): Unit = js.native
    
    def annotations(): js.Array[Annotation] = js.native
    
    def clearSelection(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def eventToDomCoords(event: MouseEvent): js.Tuple2[Double, Double] = js.native
    
    def getArea(): Area = js.native
    
    def getColors(): js.Array[String] = js.native
    
    def getHighlightSeries(): String = js.native
    
    def getLabels(): js.Array[String] | Null = js.native
    
    def getOption(name: String): Any = js.native
    def getOption(name: String, seriesName: String): Any = js.native
    
    def getPropertiesForSeries(seriesName: String): SeriesProperties | Null = js.native
    
    def getRowForX(xVal: Double): Double | Null = js.native
    
    def getSelection(): Double = js.native
    
    def getValue(row: Double, col: Double): Double | Null = js.native
    
    def indexFromSetName(name: String): Double = js.native
    
    def isSeriesLocked(): Boolean = js.native
    
    def isZoomed(): Boolean = js.native
    def isZoomed(axis: x | y): Boolean = js.native
    
    def numAxes(): Double = js.native
    
    def numColumns(): Double = js.native
    
    def numRows(): Double = js.native
    
    def ready(callback: js.Function1[/* g */ Dygraph, Any]): Unit = js.native
    
    def resetZoom(): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def rollPeriod(): Double = js.native
    
    def setAnnotations(ann: js.Array[Annotation]): Unit = js.native
    def setAnnotations(ann: js.Array[Annotation], suppressDraw: Boolean): Unit = js.native
    
    def setSelection(row: Double): Unit = js.native
    def setSelection(row: Double, seriesName: String): Unit = js.native
    def setSelection(row: Double, seriesName: String, locked: Boolean): Unit = js.native
    def setSelection(row: Double, seriesName: Unit, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: Unit, locked: Boolean): Unit = js.native
    
    def setVisibility(num: js.Array[Double], value: Boolean): Unit = js.native
    def setVisibility(num: js.Object, value: Boolean): Unit = js.native
    def setVisibility(num: Double, value: Boolean): Unit = js.native
    
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    def toDataXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDataYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDataYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    def toDomXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDomYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDomYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toPercentXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    def toPercentYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    def toPercentYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    def updateOptions(inputAttrs: Options): Unit = js.native
    def updateOptions(inputAttrs: Options, blockRedraw: Boolean): Unit = js.native
    
    def visibility(): js.Array[Boolean] = js.native
    
    def xAxisExtremes(): js.Tuple2[Double, Double] = js.native
    
    def xAxisRange(): js.Tuple2[Double, Double] = js.native
    
    def yAxisExtremes(): js.Array[js.Tuple2[Double, Double]] = js.native
    
    def yAxisRange(): js.Tuple2[Double, Double] = js.native
    def yAxisRange(idx: Double): js.Tuple2[Double, Double] = js.native
    
    def yAxisRanges(): js.Array[js.Tuple2[Double, Double]] = js.native
  }
  
  /* Inlined std.Readonly<dygraphs.dygraphs.Dygraph> */
  @js.native
  trait ReadonlyDygraphAdjustRoll extends StObject {
    
    def adjustRoll(length: Double): Unit = js.native
    
    def annotations(): js.Array[Annotation] = js.native
    
    def clearSelection(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def eventToDomCoords(event: MouseEvent): js.Tuple2[Double, Double] = js.native
    
    def getArea(): Area = js.native
    
    def getColors(): js.Array[String] = js.native
    
    def getHighlightSeries(): String = js.native
    
    def getLabels(): js.Array[String] | Null = js.native
    
    def getOption(name: String): Any = js.native
    def getOption(name: String, seriesName: String): Any = js.native
    
    def getPropertiesForSeries(seriesName: String): SeriesProperties | Null = js.native
    
    def getRowForX(xVal: Double): Double | Null = js.native
    
    def getSelection(): Double = js.native
    
    def getValue(row: Double, col: Double): Double | Null = js.native
    
    def indexFromSetName(name: String): Double = js.native
    
    def isSeriesLocked(): Boolean = js.native
    
    def isZoomed(): Boolean = js.native
    def isZoomed(axis: x | y): Boolean = js.native
    
    def numAxes(): Double = js.native
    
    def numColumns(): Double = js.native
    
    def numRows(): Double = js.native
    
    def ready(callback: js.Function1[/* g */ Dygraph, Any]): Unit = js.native
    
    def resetZoom(): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def rollPeriod(): Double = js.native
    
    def setAnnotations(ann: js.Array[Annotation]): Unit = js.native
    def setAnnotations(ann: js.Array[Annotation], suppressDraw: Boolean): Unit = js.native
    
    def setSelection(row: Double): Unit = js.native
    def setSelection(row: Double, seriesName: String): Unit = js.native
    def setSelection(row: Double, seriesName: String, locked: Boolean): Unit = js.native
    def setSelection(row: Double, seriesName: Unit, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: Unit, locked: Boolean): Unit = js.native
    
    def setVisibility(num: js.Array[Double], value: Boolean): Unit = js.native
    def setVisibility(num: js.Object, value: Boolean): Unit = js.native
    def setVisibility(num: Double, value: Boolean): Unit = js.native
    
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    def toDataXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDataYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDataYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    def toDomXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toDomYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDomYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    def toPercentXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    def toPercentYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    def toPercentYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    def updateOptions(inputAttrs: this.type): Unit = js.native
    def updateOptions(inputAttrs: this.type, blockRedraw: Boolean): Unit = js.native
    
    def visibility(): js.Array[Boolean] = js.native
    
    def xAxisExtremes(): js.Tuple2[Double, Double] = js.native
    
    def xAxisRange(): js.Tuple2[Double, Double] = js.native
    
    def yAxisExtremes(): js.Array[js.Tuple2[Double, Double]] = js.native
    
    def yAxisRange(): js.Tuple2[Double, Double] = js.native
    def yAxisRange(idx: Double): js.Tuple2[Double, Double] = js.native
    
    def yAxisRanges(): js.Array[js.Tuple2[Double, Double]] = js.native
  }
  
  /* Inlined std.Readonly<dygraphs.dygraphs.dygraphs.Point> */
  trait ReadonlyPoint extends StObject {
    
    val annotation: js.UndefOr[Annotation] = js.undefined
    
    val idx: Double
    
    val name: String
    
    val x: js.UndefOr[Double] = js.undefined
    
    val xval: js.UndefOr[Double] = js.undefined
    
    val y: js.UndefOr[Double] = js.undefined
    
    val y_bottom: js.UndefOr[Double] = js.undefined
    
    val y_stacked: js.UndefOr[Double] = js.undefined
    
    val y_top: js.UndefOr[Double] = js.undefined
    
    val yval: js.UndefOr[Double] = js.undefined
    
    val yval_minus: js.UndefOr[Double] = js.undefined
    
    val yval_plus: js.UndefOr[Double] = js.undefined
    
    val yval_stacked: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyPoint {
    
    inline def apply(idx: Double, name: String): ReadonlyPoint = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPoint]
    }
    
    extension [Self <: ReadonlyPoint](x: Self) {
      
      inline def setAnnotation(value: Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXval(value: Double): Self = StObject.set(x, "xval", value.asInstanceOf[js.Any])
      
      inline def setXvalUndefined: Self = StObject.set(x, "xval", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setY_bottom(value: Double): Self = StObject.set(x, "y_bottom", value.asInstanceOf[js.Any])
      
      inline def setY_bottomUndefined: Self = StObject.set(x, "y_bottom", js.undefined)
      
      inline def setY_stacked(value: Double): Self = StObject.set(x, "y_stacked", value.asInstanceOf[js.Any])
      
      inline def setY_stackedUndefined: Self = StObject.set(x, "y_stacked", js.undefined)
      
      inline def setY_top(value: Double): Self = StObject.set(x, "y_top", value.asInstanceOf[js.Any])
      
      inline def setY_topUndefined: Self = StObject.set(x, "y_top", js.undefined)
      
      inline def setYval(value: Double): Self = StObject.set(x, "yval", value.asInstanceOf[js.Any])
      
      inline def setYvalUndefined: Self = StObject.set(x, "yval", js.undefined)
      
      inline def setYval_minus(value: Double): Self = StObject.set(x, "yval_minus", value.asInstanceOf[js.Any])
      
      inline def setYval_minusUndefined: Self = StObject.set(x, "yval_minus", js.undefined)
      
      inline def setYval_plus(value: Double): Self = StObject.set(x, "yval_plus", value.asInstanceOf[js.Any])
      
      inline def setYval_plusUndefined: Self = StObject.set(x, "yval_plus", js.undefined)
      
      inline def setYval_stacked(value: Double): Self = StObject.set(x, "yval_stacked", value.asInstanceOf[js.Any])
      
      inline def setYval_stackedUndefined: Self = StObject.set(x, "yval_stacked", js.undefined)
    }
  }
}
