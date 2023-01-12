package typings.fusioncharts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.fusioncharts.anon.AddGroup
import typings.fusioncharts.anon.CreditLabel
import typings.std.Element
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fusioncharts", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FusionCharts {
    def this(chartObject: js.Object) = this()
    def this(chartObject: ChartObject) = this()
  }
  @JSImport("fusioncharts", JSImport.Namespace)
  @js.native
  val ^ : FusionChartStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("fusioncharts", "DataStore")
  @js.native
  open class DataStoreCls ()
    extends StObject
       with DataStore
  
  /* Rewritten from type alias, can be one of: 
    - typings.fusioncharts.fusionchartsStrings.json
    - typings.fusioncharts.fusionchartsStrings.jsonurl
    - typings.fusioncharts.fusionchartsStrings.csv
    - typings.fusioncharts.fusionchartsStrings.xml
    - typings.fusioncharts.fusionchartsStrings.xmlurl
  */
  trait ChartDataFormats extends StObject
  object ChartDataFormats {
    
    inline def csv: typings.fusioncharts.fusionchartsStrings.csv = "csv".asInstanceOf[typings.fusioncharts.fusionchartsStrings.csv]
    
    inline def json: typings.fusioncharts.fusionchartsStrings.json = "json".asInstanceOf[typings.fusioncharts.fusionchartsStrings.json]
    
    inline def jsonurl: typings.fusioncharts.fusionchartsStrings.jsonurl = "jsonurl".asInstanceOf[typings.fusioncharts.fusionchartsStrings.jsonurl]
    
    inline def xml: typings.fusioncharts.fusionchartsStrings.xml = "xml".asInstanceOf[typings.fusioncharts.fusionchartsStrings.xml]
    
    inline def xmlurl: typings.fusioncharts.fusionchartsStrings.xmlurl = "xmlurl".asInstanceOf[typings.fusioncharts.fusionchartsStrings.xmlurl]
  }
  
  trait ChartObject extends StObject {
    
    var baseChartMessageColor: js.UndefOr[String] = js.undefined
    
    var baseChartMessageFont: js.UndefOr[String] = js.undefined
    
    var baseChartMessageFontSize: js.UndefOr[String] = js.undefined
    
    var baseChartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var containerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var containerBackgroundOpacity: js.UndefOr[Double] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var dataEmptyMessage: js.UndefOr[String] = js.undefined
    
    var dataEmptyMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var dataEmptyMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var dataEmptyMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var dataEmptyMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var dataFormat: js.UndefOr[ChartDataFormats] = js.undefined
    
    var dataInvalidMessage: js.UndefOr[String] = js.undefined
    
    var dataInvalidMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var dataInvalidMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var dataInvalidMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var dataInvalidMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var dataLoadErrorMessage: js.UndefOr[String] = js.undefined
    
    var dataLoadErrorMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var dataLoadErrorMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var dataLoadErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var dataLoadStartMessage: js.UndefOr[String] = js.undefined
    
    var dataLoadStartMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var dataLoadStartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var dataLoadStartMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var dataLoadStartMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var dataSource: js.UndefOr[String | js.Object] = js.undefined
    
    var events: js.UndefOr[js.Object] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[js.Object] = js.undefined
    
    var loadMessage: js.UndefOr[String] = js.undefined
    
    var loadMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var loadMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var loadMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var loadMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var renderAt: js.UndefOr[String] = js.undefined
    
    var renderErrorMessage: js.UndefOr[String] = js.undefined
    
    var renderErrorMessageImageAlpha: js.UndefOr[Double] = js.undefined
    
    var renderErrorMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
    
    var renderErrorMessageImageScale: js.UndefOr[Double] = js.undefined
    
    var renderErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
    
    var showChartLoadingMessage: js.UndefOr[Boolean] = js.undefined
    
    var showDataLoadingMessage: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeNotSupportedMessage: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ChartObject {
    
    inline def apply(): ChartObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartObject] (val x: Self) extends AnyVal {
      
      inline def setBaseChartMessageColor(value: String): Self = StObject.set(x, "baseChartMessageColor", value.asInstanceOf[js.Any])
      
      inline def setBaseChartMessageColorUndefined: Self = StObject.set(x, "baseChartMessageColor", js.undefined)
      
      inline def setBaseChartMessageFont(value: String): Self = StObject.set(x, "baseChartMessageFont", value.asInstanceOf[js.Any])
      
      inline def setBaseChartMessageFontSize(value: String): Self = StObject.set(x, "baseChartMessageFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseChartMessageFontSizeUndefined: Self = StObject.set(x, "baseChartMessageFontSize", js.undefined)
      
      inline def setBaseChartMessageFontUndefined: Self = StObject.set(x, "baseChartMessageFont", js.undefined)
      
      inline def setBaseChartMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "baseChartMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setBaseChartMessageImageHAlignUndefined: Self = StObject.set(x, "baseChartMessageImageHAlign", js.undefined)
      
      inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
      
      inline def setContainerBackgroundOpacity(value: Double): Self = StObject.set(x, "containerBackgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setContainerBackgroundOpacityUndefined: Self = StObject.set(x, "containerBackgroundOpacity", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDataEmptyMessage(value: String): Self = StObject.set(x, "dataEmptyMessage", value.asInstanceOf[js.Any])
      
      inline def setDataEmptyMessageImageAlpha(value: Double): Self = StObject.set(x, "dataEmptyMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setDataEmptyMessageImageAlphaUndefined: Self = StObject.set(x, "dataEmptyMessageImageAlpha", js.undefined)
      
      inline def setDataEmptyMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataEmptyMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setDataEmptyMessageImageHAlignUndefined: Self = StObject.set(x, "dataEmptyMessageImageHAlign", js.undefined)
      
      inline def setDataEmptyMessageImageScale(value: Double): Self = StObject.set(x, "dataEmptyMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setDataEmptyMessageImageScaleUndefined: Self = StObject.set(x, "dataEmptyMessageImageScale", js.undefined)
      
      inline def setDataEmptyMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataEmptyMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setDataEmptyMessageImageVAlignUndefined: Self = StObject.set(x, "dataEmptyMessageImageVAlign", js.undefined)
      
      inline def setDataEmptyMessageUndefined: Self = StObject.set(x, "dataEmptyMessage", js.undefined)
      
      inline def setDataFormat(value: ChartDataFormats): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDataInvalidMessage(value: String): Self = StObject.set(x, "dataInvalidMessage", value.asInstanceOf[js.Any])
      
      inline def setDataInvalidMessageImageAlpha(value: Double): Self = StObject.set(x, "dataInvalidMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setDataInvalidMessageImageAlphaUndefined: Self = StObject.set(x, "dataInvalidMessageImageAlpha", js.undefined)
      
      inline def setDataInvalidMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataInvalidMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setDataInvalidMessageImageHAlignUndefined: Self = StObject.set(x, "dataInvalidMessageImageHAlign", js.undefined)
      
      inline def setDataInvalidMessageImageScale(value: Double): Self = StObject.set(x, "dataInvalidMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setDataInvalidMessageImageScaleUndefined: Self = StObject.set(x, "dataInvalidMessageImageScale", js.undefined)
      
      inline def setDataInvalidMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataInvalidMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setDataInvalidMessageImageVAlignUndefined: Self = StObject.set(x, "dataInvalidMessageImageVAlign", js.undefined)
      
      inline def setDataInvalidMessageUndefined: Self = StObject.set(x, "dataInvalidMessage", js.undefined)
      
      inline def setDataLoadErrorMessage(value: String): Self = StObject.set(x, "dataLoadErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setDataLoadErrorMessageImageAlpha(value: Double): Self = StObject.set(x, "dataLoadErrorMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setDataLoadErrorMessageImageAlphaUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageAlpha", js.undefined)
      
      inline def setDataLoadErrorMessageImageScale(value: Double): Self = StObject.set(x, "dataLoadErrorMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setDataLoadErrorMessageImageScaleUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageScale", js.undefined)
      
      inline def setDataLoadErrorMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataLoadErrorMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setDataLoadErrorMessageImageVAlignUndefined: Self = StObject.set(x, "dataLoadErrorMessageImageVAlign", js.undefined)
      
      inline def setDataLoadErrorMessageUndefined: Self = StObject.set(x, "dataLoadErrorMessage", js.undefined)
      
      inline def setDataLoadStartMessage(value: String): Self = StObject.set(x, "dataLoadStartMessage", value.asInstanceOf[js.Any])
      
      inline def setDataLoadStartMessageImageAlpha(value: Double): Self = StObject.set(x, "dataLoadStartMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setDataLoadStartMessageImageAlphaUndefined: Self = StObject.set(x, "dataLoadStartMessageImageAlpha", js.undefined)
      
      inline def setDataLoadStartMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "dataLoadStartMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setDataLoadStartMessageImageHAlignUndefined: Self = StObject.set(x, "dataLoadStartMessageImageHAlign", js.undefined)
      
      inline def setDataLoadStartMessageImageScale(value: Double): Self = StObject.set(x, "dataLoadStartMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setDataLoadStartMessageImageScaleUndefined: Self = StObject.set(x, "dataLoadStartMessageImageScale", js.undefined)
      
      inline def setDataLoadStartMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "dataLoadStartMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setDataLoadStartMessageImageVAlignUndefined: Self = StObject.set(x, "dataLoadStartMessageImageVAlign", js.undefined)
      
      inline def setDataLoadStartMessageUndefined: Self = StObject.set(x, "dataLoadStartMessage", js.undefined)
      
      inline def setDataSource(value: String | js.Object): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLink(value: js.Object): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLoadMessage(value: String): Self = StObject.set(x, "loadMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadMessageImageAlpha(value: Double): Self = StObject.set(x, "loadMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setLoadMessageImageAlphaUndefined: Self = StObject.set(x, "loadMessageImageAlpha", js.undefined)
      
      inline def setLoadMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "loadMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setLoadMessageImageHAlignUndefined: Self = StObject.set(x, "loadMessageImageHAlign", js.undefined)
      
      inline def setLoadMessageImageScale(value: Double): Self = StObject.set(x, "loadMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setLoadMessageImageScaleUndefined: Self = StObject.set(x, "loadMessageImageScale", js.undefined)
      
      inline def setLoadMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "loadMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setLoadMessageImageVAlignUndefined: Self = StObject.set(x, "loadMessageImageVAlign", js.undefined)
      
      inline def setLoadMessageUndefined: Self = StObject.set(x, "loadMessage", js.undefined)
      
      inline def setRenderAt(value: String): Self = StObject.set(x, "renderAt", value.asInstanceOf[js.Any])
      
      inline def setRenderAtUndefined: Self = StObject.set(x, "renderAt", js.undefined)
      
      inline def setRenderErrorMessage(value: String): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setRenderErrorMessageImageAlpha(value: Double): Self = StObject.set(x, "renderErrorMessageImageAlpha", value.asInstanceOf[js.Any])
      
      inline def setRenderErrorMessageImageAlphaUndefined: Self = StObject.set(x, "renderErrorMessageImageAlpha", js.undefined)
      
      inline def setRenderErrorMessageImageHAlign(value: ImageHAlign): Self = StObject.set(x, "renderErrorMessageImageHAlign", value.asInstanceOf[js.Any])
      
      inline def setRenderErrorMessageImageHAlignUndefined: Self = StObject.set(x, "renderErrorMessageImageHAlign", js.undefined)
      
      inline def setRenderErrorMessageImageScale(value: Double): Self = StObject.set(x, "renderErrorMessageImageScale", value.asInstanceOf[js.Any])
      
      inline def setRenderErrorMessageImageScaleUndefined: Self = StObject.set(x, "renderErrorMessageImageScale", js.undefined)
      
      inline def setRenderErrorMessageImageVAlign(value: ImageVAlign): Self = StObject.set(x, "renderErrorMessageImageVAlign", value.asInstanceOf[js.Any])
      
      inline def setRenderErrorMessageImageVAlignUndefined: Self = StObject.set(x, "renderErrorMessageImageVAlign", js.undefined)
      
      inline def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
      
      inline def setShowChartLoadingMessage(value: Boolean): Self = StObject.set(x, "showChartLoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setShowChartLoadingMessageUndefined: Self = StObject.set(x, "showChartLoadingMessage", js.undefined)
      
      inline def setShowDataLoadingMessage(value: Boolean): Self = StObject.set(x, "showDataLoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setShowDataLoadingMessageUndefined: Self = StObject.set(x, "showDataLoadingMessage", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNotSupportedMessage(value: String): Self = StObject.set(x, "typeNotSupportedMessage", value.asInstanceOf[js.Any])
      
      inline def setTypeNotSupportedMessageUndefined: Self = StObject.set(x, "typeNotSupportedMessage", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait DataStore extends StObject {
    
    def appendRows(rows: js.Array[js.Array[Any]]): Unit = js.native
    def appendRows(rows: js.Array[js.Array[Any]], id: String): Unit = js.native
    
    def createDataTable(data: js.Array[Any], schema: js.Array[Any]): DataTable = js.native
    def createDataTable(data: js.Array[Any], schema: js.Array[Any], config: Any): DataTable = js.native
    def createDataTable(data: js.Array[Any], schema: js.Array[Any], config: Any, id: String): DataTable = js.native
    def createDataTable(data: js.Array[Any], schema: js.Array[Any], config: Unit, id: String): DataTable = js.native
    
    def dispose(): Unit = js.native
    
    def getDataTable(id: String): DataTable = js.native
    
    def off(eventName: String, handler: js.Array[Handler]): Unit = js.native
    def off(eventName: String, handler: Handler): Unit = js.native
    
    def on(eventName: String, handler: js.Array[Handler]): Unit = js.native
    def on(eventName: String, handler: Handler): Unit = js.native
    
    def trigger(eventName: String): Unit = js.native
    def trigger(eventName: String, data: Any): Unit = js.native
  }
  
  @js.native
  trait DataStoreStatic
    extends StObject
       with Instantiable0[DataStore] {
    
    var Aggregators: Any = js.native
    
    var Operators: typings.fusioncharts.mod.Operators = js.native
  }
  
  @js.native
  trait DataTable extends StObject {
    
    def addColumns(args: Any*): Unit = js.native
    
    def count(): Double = js.native
    
    def dispose(): Unit = js.native
    
    def extents(columnName: String): Any = js.native
    
    def getData(): Any = js.native
    def getData(offset: Double): Any = js.native
    def getData(offset: Double, numberOfItems: Double): Any = js.native
    def getData(offset: Unit, numberOfItems: Double): Any = js.native
    
    def getDataStore(): DataStore = js.native
    
    def getSchema(): js.Array[Any] = js.native
    
    def indexOf(columnName: String): Double = js.native
    
    def max(columnName: String): Double = js.native
    
    def min(columnName: String): Double = js.native
    
    def off(eventName: String, handler: js.Array[Handler]): Unit = js.native
    def off(eventName: String, handler: Handler): Unit = js.native
    
    def on(eventName: String, handler: js.Array[Handler]): Unit = js.native
    def on(eventName: String, handler: Handler): Unit = js.native
    
    def query(queryOperations: js.Array[Any]): DataTable = js.native
    def query(queryOperations: Any): DataTable = js.native
    
    def unique(columnName: String): js.Array[Any] = js.native
  }
  
  trait DatetimeUnits extends StObject {
    
    var Day: Any
    
    var Hour: Any
    
    var Millisecond: Any
    
    var Minute: Any
    
    var Month: Any
    
    var Quarter: Any
    
    var Second: Any
    
    var Week: Any
    
    var Year: Any
  }
  object DatetimeUnits {
    
    inline def apply(
      Day: Any,
      Hour: Any,
      Millisecond: Any,
      Minute: Any,
      Month: Any,
      Quarter: Any,
      Second: Any,
      Week: Any,
      Year: Any
    ): DatetimeUnits = {
      val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Hour = Hour.asInstanceOf[js.Any], Millisecond = Millisecond.asInstanceOf[js.Any], Minute = Minute.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Quarter = Quarter.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], Week = Week.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatetimeUnits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatetimeUnits] (val x: Self) extends AnyVal {
      
      inline def setDay(value: Any): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Any): Self = StObject.set(x, "Hour", value.asInstanceOf[js.Any])
      
      inline def setMillisecond(value: Any): Self = StObject.set(x, "Millisecond", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Any): Self = StObject.set(x, "Minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Any): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
      
      inline def setQuarter(value: Any): Self = StObject.set(x, "Quarter", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Any): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: Any): Self = StObject.set(x, "Week", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Any): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Debugger extends StObject {
    
    def enable(state: Any): Unit = js.native
    def enable(state: Any, outputTo: js.Function1[/* message */ Any, Any]): Unit = js.native
    def enable(state: Any, outputTo: js.Function1[/* message */ Any, Any], outputFormat: Any): Unit = js.native
    def enable(state: Any, outputTo: Unit, outputFormat: Any): Unit = js.native
    
    def enableFirebugLite(): Any = js.native
    
    def outputFormat(format: Any): Unit = js.native
    
    def outputTo(callback: js.Function1[/* message */ Any, Any]): Unit = js.native
  }
  
  trait Duration extends StObject {
    
    var Unit: String
    
    var ms: Double
    
    var number: Double
  }
  object Duration {
    
    inline def apply(Unit: String, ms: Double, number: Double): Duration = {
      val __obj = js.Dynamic.literal(Unit = Unit.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventObject extends StObject {
    
    var cancelled: Boolean
    
    def detachHandler(): Unit
    
    var detached: Boolean
    
    var eventId: Double
    
    def preventDefault(): Unit
    
    var prevented: Boolean
    
    var sender: FusionCharts
    
    def stopPropagation(): Unit
    
    var `type`: String
  }
  object EventObject {
    
    inline def apply(
      cancelled: Boolean,
      detachHandler: () => Unit,
      detached: Boolean,
      eventId: Double,
      preventDefault: () => Unit,
      prevented: Boolean,
      sender: FusionCharts,
      stopPropagation: () => Unit,
      `type`: String
    ): EventObject = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detachHandler = js.Any.fromFunction0(detachHandler), detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setDetachHandler(value: () => Unit): Self = StObject.set(x, "detachHandler", js.Any.fromFunction0(value))
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPrevented(value: Boolean): Self = StObject.set(x, "prevented", value.asInstanceOf[js.Any])
      
      inline def setSender(value: FusionCharts): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FusionChartStatic
    extends StObject
       with Instantiable1[(/* chartObject */ ChartObject) | (/* chartObject */ js.Object), FusionCharts] {
    
    def apply(chartId: String): FusionCharts = js.native
    
    var DataStore: DataStoreStatic = js.native
    
    var Utils: typings.fusioncharts.mod.Utils = js.native
    
    def addDep(dep: Any): Unit = js.native
    
    def addEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def batchExport(options: js.Object): Unit = js.native
    
    var debugger: Debugger = js.native
    
    def formatNumber(num: Double): Element = js.native
    def formatNumber(num: Double, `type`: String): Element = js.native
    def formatNumber(num: Double, `type`: String, config: js.Object): Element = js.native
    def formatNumber(num: Double, `type`: Unit, config: js.Object): Element = js.native
    
    def getChartFromId(id: String): ChartObject = js.native
    
    def getCurrentRenderer(): String = js.native
    
    def getDep(name: String, `type`: String): Any = js.native
    
    def getObjectReference(elementId: String): Element = js.native
    
    def getScriptBaseURI(): String = js.native
    
    def on(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def on(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    var options: CreditLabel = js.native
    
    def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], Any]): FusionChartStatic = js.native
    def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], Any], context: Any): FusionChartStatic = js.native
    
    def removeEventListener(
      `type`: String,
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: js.Array[String],
      listener: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def render(): FusionCharts = js.native
    def render(options: Unit, callback: js.Function0[Any]): FusionCharts = js.native
    def render(options: ChartObject): FusionCharts = js.native
    def render(options: ChartObject, callback: js.Function0[Any]): FusionCharts = js.native
    
    def setAnimation(rule: Any): Unit = js.native
    
    def setCurrentRenderer(name: String): Unit = js.native
    
    def setEasingEffect(name: String, fn: js.Function0[Any]): Unit = js.native
    
    def setScriptBaseURI(scriptBaseURI: String): Unit = js.native
    
    def transcodeData(data: String, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): Any = js.native
    def transcodeData(data: js.Object, source: ChartDataFormats, target: ChartDataFormats, advanced: Boolean): Any = js.native
    
    var version: js.Array[String] = js.native
  }
  
  @js.native
  trait FusionCharts extends StObject {
    
    def addEventListener(
      eventType: String,
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Any = js.native
    def addEventListener(
      eventType: String,
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ],
      options: js.Object
    ): Any = js.native
    def addEventListener(
      eventType: js.Array[String],
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Any = js.native
    def addEventListener(
      eventType: js.Array[String],
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ],
      options: js.Object
    ): Any = js.native
    
    var annotations: AddGroup = js.native
    
    def centerLabel(labelText: String): Unit = js.native
    def centerLabel(labelText: String, options: js.Object): Unit = js.native
    
    def chartType(): String = js.native
    def chartType(value: String): String = js.native
    def chartType(value: String, options: Any): String = js.native
    def chartType(value: Unit, options: Any): String = js.native
    
    def clearChart(): Unit = js.native
    
    def clearLog(): Unit = js.native
    
    def clone(overrides: js.Object): Any = js.native
    def clone(overrides: js.Object, argsOnly: Boolean): Any = js.native
    def clone(overrides: Unit, argsOnly: Boolean): Any = js.native
    
    def configure(options: js.Object): Unit = js.native
    
    def configureLink(param: js.Array[Any]): Unit = js.native
    def configureLink(param: js.Array[Any], level: Double): Unit = js.native
    def configureLink(param: js.Object): Unit = js.native
    def configureLink(param: js.Object, level: Double): Unit = js.native
    
    def dataReady(): Boolean = js.native
    def dataReady(available: Boolean): Boolean = js.native
    
    def dispose(): Unit = js.native
    
    def exportChart(): Boolean = js.native
    def exportChart(options: js.Object): Boolean = js.native
    
    def feedData(stream: String): Unit = js.native
    
    def getCSVData(): Any = js.native
    
    def getChartAttribute(): ChartObject = js.native
    def getChartAttribute(attribute: String): ChartObject = js.native
    def getChartAttribute(attribute: js.Array[String]): ChartObject = js.native
    
    def getChartData(format: ChartDataFormats): Any = js.native
    def getChartData(format: ChartDataFormats, advanced: Boolean): Any = js.native
    def getChartData(format: ChartDataFormats, advanced: Boolean, update: Boolean): Any = js.native
    def getChartData(format: ChartDataFormats, advanced: Unit, update: Boolean): Any = js.native
    
    def getData(): Any = js.native
    
    def getDataAsCSV(): Any = js.native
    
    def getDataForId(id: Any): Any = js.native
    def getDataForId(id: Any, callback: js.Function1[/* value */ Any, Unit]): Any = js.native
    
    def getDataWithId(): Any = js.native
    
    def getJSONData(): JSON = js.native
    
    def getLowerLimit(): Double = js.native
    def getLowerLimit(callback: js.Function1[/* lowerLimit */ Double, Unit]): Double = js.native
    
    def getSVGString(): String = js.native
    def getSVGString(callback: js.Function1[/* svg */ String, Unit]): String = js.native
    
    def getUpperLimit(): Double = js.native
    def getUpperLimit(callback: js.Function1[/* upperLimit */ Double, Unit]): Double = js.native
    
    def getViewEndIndex(): Double = js.native
    def getViewEndIndex(callback: js.Function1[/* endIndex */ Double, Unit]): Double = js.native
    
    def getViewStartIndex(): Double = js.native
    def getViewStartIndex(callback: js.Function1[/* startIndex */ Double, Unit]): Double = js.native
    
    def getXMLData(): Any = js.native
    
    def hasRendered(): Boolean = js.native
    
    def hideChartMessage(): Unit = js.native
    
    def hideLog(): Unit = js.native
    
    def isActive(): Boolean = js.native
    
    def isPlotItemSliced(index: Double): Boolean = js.native
    
    def isUpdateActive(): Boolean = js.native
    
    def lockResize(state: Boolean): Boolean = js.native
    
    def print(): Any = js.native
    def print(options: js.Object): Any = js.native
    
    def removeEventListener(
      eventType: String,
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def removeEventListener(
      eventType: js.Array[String],
      callback: js.Function2[
          /* eventObject */ js.UndefOr[EventObject], 
          /* eventArgs */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    
    def render(): FusionCharts = js.native
    def render(containerElement: String): FusionCharts = js.native
    def render(containerElement: String, insertMode: String): FusionCharts = js.native
    def render(containerElement: String, insertMode: String, callback: js.Function0[Any]): FusionCharts = js.native
    def render(containerElement: String, insertMode: Unit, callback: js.Function0[Any]): FusionCharts = js.native
    def render(containerElement: Unit, insertMode: String): FusionCharts = js.native
    def render(containerElement: Unit, insertMode: String, callback: js.Function0[Any]): FusionCharts = js.native
    def render(containerElement: Unit, insertMode: Unit, callback: js.Function0[Any]): FusionCharts = js.native
    def render(containerElement: Element): FusionCharts = js.native
    def render(containerElement: Element, insertMode: String): FusionCharts = js.native
    def render(containerElement: Element, insertMode: String, callback: js.Function0[Any]): FusionCharts = js.native
    def render(containerElement: Element, insertMode: Unit, callback: js.Function0[Any]): FusionCharts = js.native
    
    def resetChart(): Unit = js.native
    
    def resizeTo(width: String, height: String): Any = js.native
    def resizeTo(width: String, height: String, silent: Boolean): Any = js.native
    def resizeTo(width: String, height: Double): Any = js.native
    def resizeTo(width: String, height: Double, silent: Boolean): Any = js.native
    def resizeTo(width: Double, height: String): Any = js.native
    def resizeTo(width: Double, height: String, silent: Boolean): Any = js.native
    def resizeTo(width: Double, height: Double): Any = js.native
    def resizeTo(width: Double, height: Double, silent: Boolean): Any = js.native
    
    def restartUpdate(): Unit = js.native
    
    def scrollTo(value: Double): Unit = js.native
    
    def setChartAttribute(attributes: String): Unit = js.native
    def setChartAttribute(attributes: String, value: String): Unit = js.native
    def setChartAttribute(attributes: ChartObject): Unit = js.native
    def setChartAttribute(attributes: ChartObject, value: String): Unit = js.native
    
    def setChartData(data: js.Object, format: ChartDataFormats): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats, config: Any): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats, config: Any, callback: js.Function0[Any]): Unit = js.native
    def setChartData(
      data: js.Object,
      format: ChartDataFormats,
      config: Any,
      callback: js.Function0[Any],
      silent: Boolean
    ): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats, config: Any, callback: Unit, silent: Boolean): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats, config: Unit, callback: js.Function0[Any]): Unit = js.native
    def setChartData(
      data: js.Object,
      format: ChartDataFormats,
      config: Unit,
      callback: js.Function0[Any],
      silent: Boolean
    ): Unit = js.native
    def setChartData(data: js.Object, format: ChartDataFormats, config: Unit, callback: Unit, silent: Boolean): Unit = js.native
    
    def setChartDataUrl(url: String, format: ChartDataFormats): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Any): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Any, callback: js.Function0[Any]): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Any, callback: js.Function0[Any], silent: Boolean): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Any, callback: Unit, silent: Boolean): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Unit, callback: js.Function0[Any]): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Unit, callback: js.Function0[Any], silent: Boolean): Any = js.native
    def setChartDataUrl(url: String, format: ChartDataFormats, config: Unit, callback: Unit, silent: Boolean): Any = js.native
    
    def setData(value: Double, label: String): Unit = js.native
    
    def setDataForId(id: Any, value: Any): Unit = js.native
    
    def setDataURL(url: String, dataType: ChartDataFormats): Unit = js.native
    
    def setDataXML(data: String): Unit = js.native
    def setDataXML(data: js.Object): Unit = js.native
    
    def setJSONData(data: String): Unit = js.native
    def setJSONData(data: js.Object): Unit = js.native
    
    def setJSONUrl(url: String): Unit = js.native
    
    def setLowerLimit(limit: Double): Unit = js.native
    def setLowerLimit(limit: Double, callback: js.Function1[/* isApplied */ Boolean, Unit]): Unit = js.native
    
    def setTransparent(): Unit = js.native
    def setTransparent(transparency: Boolean): Unit = js.native
    
    def setUpperLimit(limit: Double): Unit = js.native
    def setUpperLimit(limit: Double, callback: js.Function1[/* isApplied */ Boolean, Unit]): Unit = js.native
    
    def setXMLData(data: String): Unit = js.native
    def setXMLData(data: js.Object): Unit = js.native
    
    def setXMLUrl(url: String): Unit = js.native
    
    def setZoomMode(yes: Boolean): Unit = js.native
    
    def showChartMessage(text: String): Unit = js.native
    def showChartMessage(text: String, modal: Boolean): Unit = js.native
    def showChartMessage(text: String, modal: Boolean, cancelable: Boolean): Unit = js.native
    def showChartMessage(text: String, modal: Boolean, cancelable: Boolean, customAttrs: Any): Unit = js.native
    def showChartMessage(text: String, modal: Boolean, cancelable: Unit, customAttrs: Any): Unit = js.native
    def showChartMessage(text: String, modal: Unit, cancelable: Boolean): Unit = js.native
    def showChartMessage(text: String, modal: Unit, cancelable: Boolean, customAttrs: Any): Unit = js.native
    def showChartMessage(text: String, modal: Unit, cancelable: Unit, customAttrs: Any): Unit = js.native
    
    def showLog(): Unit = js.native
    
    def showMessage(msg: String): Unit = js.native
    def showMessage(msg: String, attrs: Any): Unit = js.native
    def showMessage(msg: String, attrs: Any, cancelable: Boolean): Unit = js.native
    def showMessage(msg: String, attrs: Unit, cancelable: Boolean): Unit = js.native
    
    def slicePlotItem(index: Double): Unit = js.native
    def slicePlotItem(index: Double, slice: Boolean): Unit = js.native
    def slicePlotItem(index: Double, slice: Boolean, callback: js.Function0[Any]): Unit = js.native
    def slicePlotItem(index: Double, slice: Unit, callback: js.Function0[Any]): Unit = js.native
    
    def startingAngle(): Any = js.native
    def startingAngle(angle: Double): Any = js.native
    def startingAngle(angle: Double, relative: Boolean): Any = js.native
    def startingAngle(angle: Double, relative: Boolean, callback: js.Function1[/* output */ Any, Unit]): Any = js.native
    def startingAngle(angle: Double, relative: Unit, callback: js.Function1[/* output */ Any, Unit]): Any = js.native
    def startingAngle(angle: Unit, relative: Boolean): Any = js.native
    def startingAngle(angle: Unit, relative: Boolean, callback: js.Function1[/* output */ Any, Unit]): Any = js.native
    def startingAngle(angle: Unit, relative: Unit, callback: js.Function1[/* output */ Any, Unit]): Any = js.native
    
    def stopUpdate(): Unit = js.native
    
    def zoomOut(): Unit = js.native
    
    def zoomTo(startIndex: Double, endIndex: Double): Unit = js.native
    def zoomTo(startIndex: Double, endIndex: Double, event: Any): Unit = js.native
  }
  
  type Handler = js.Function1[/* eventObj */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fusioncharts.fusionchartsStrings.left
    - typings.fusioncharts.fusionchartsStrings.right
    - typings.fusioncharts.fusionchartsStrings.middle
  */
  trait ImageHAlign extends StObject
  object ImageHAlign {
    
    inline def left: typings.fusioncharts.fusionchartsStrings.left = "left".asInstanceOf[typings.fusioncharts.fusionchartsStrings.left]
    
    inline def middle: typings.fusioncharts.fusionchartsStrings.middle = "middle".asInstanceOf[typings.fusioncharts.fusionchartsStrings.middle]
    
    inline def right: typings.fusioncharts.fusionchartsStrings.right = "right".asInstanceOf[typings.fusioncharts.fusionchartsStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fusioncharts.fusionchartsStrings.top
    - typings.fusioncharts.fusionchartsStrings.bottom
    - typings.fusioncharts.fusionchartsStrings.middle
  */
  trait ImageVAlign extends StObject
  object ImageVAlign {
    
    inline def bottom: typings.fusioncharts.fusionchartsStrings.bottom = "bottom".asInstanceOf[typings.fusioncharts.fusionchartsStrings.bottom]
    
    inline def middle: typings.fusioncharts.fusionchartsStrings.middle = "middle".asInstanceOf[typings.fusioncharts.fusionchartsStrings.middle]
    
    inline def top: typings.fusioncharts.fusionchartsStrings.top = "top".asInstanceOf[typings.fusioncharts.fusionchartsStrings.top]
  }
  
  @js.native
  trait Operators extends StObject {
    
    def between(columnName: String, startValue: Double, endValue: Double): Any = js.native
    
    def equals(columnName: String, value: Double): Any = js.native
    
    def filter(customFilterQuery: js.Function2[/* row */ js.Array[Any], /* columns */ Any, Any]): Any = js.native
    
    def greater(columnName: String, value: Double): Any = js.native
    
    def greaterEquals(columnName: String, value: Double): Any = js.native
    
    def groupBy(groupConfigArr: js.Array[Any], aggrConfigArr: js.Array[Any]): Any = js.native
    def groupBy(groupConfigArr: js.Array[Any], aggrConfigArr: Any): Any = js.native
    def groupBy(groupConfigArr: Any, aggrConfigArr: js.Array[Any]): Any = js.native
    def groupBy(groupConfigArr: Any, aggrConfigArr: Any): Any = js.native
    
    def less(columnName: String, value: Double): Any = js.native
    
    def lessEquals(columnName: String, value: Double): Any = js.native
    
    def pipe(args: Any*): js.Array[Any] = js.native
    
    def pivot(groupConfigArr: js.Array[Any], pivotColumn: String, aggrConfigArr: js.Array[Any]): Any = js.native
    def pivot(groupConfigArr: js.Array[Any], pivotColumn: String, aggrConfigArr: Any): Any = js.native
    def pivot(groupConfigArr: Any, pivotColumn: String, aggrConfigArr: js.Array[Any]): Any = js.native
    def pivot(groupConfigArr: Any, pivotColumn: String, aggrConfigArr: Any): Any = js.native
    
    def select(columnName: String): Any = js.native
    def select(columnName: js.Array[String]): Any = js.native
    
    def sort(customSortQuery: js.Array[Any]): Any = js.native
    def sort(customSortQuery: js.Function2[/* a */ Any, /* b */ Any, Any]): Any = js.native
    def sort(customSortQuery: Any): Any = js.native
  }
  
  @js.native
  trait Utils extends StObject {
    
    var DatetimeUnits: typings.fusioncharts.mod.DatetimeUnits = js.native
    
    var Weekdays: typings.fusioncharts.mod.Weekdays = js.native
    
    def after(duration: Duration): Double = js.native
    def after(duration: Duration, date: Double): Double = js.native
    def after(duration: Duration, date: Double, isUTC: Boolean): Double = js.native
    def after(duration: Duration, date: Double, isUTC: Boolean, weekStartFrom: Weekdays): Double = js.native
    def after(duration: Duration, date: Double, isUTC: Unit, weekStartFrom: Weekdays): Double = js.native
    def after(duration: Duration, date: Unit, isUTC: Boolean): Double = js.native
    def after(duration: Duration, date: Unit, isUTC: Boolean, weekStartFrom: Weekdays): Double = js.native
    def after(duration: Duration, date: Unit, isUTC: Unit, weekStartFrom: Weekdays): Double = js.native
    
    def before(duration: Duration): Double = js.native
    def before(duration: Duration, date: Double): Double = js.native
    def before(duration: Duration, date: Double, isUTC: Boolean): Double = js.native
    def before(duration: Duration, date: Double, isUTC: Boolean, weekStartFrom: Weekdays): Double = js.native
    def before(duration: Duration, date: Double, isUTC: Unit, weekStartFrom: Weekdays): Double = js.native
    def before(duration: Duration, date: Unit, isUTC: Boolean): Double = js.native
    def before(duration: Duration, date: Unit, isUTC: Boolean, weekStartFrom: Weekdays): Double = js.native
    def before(duration: Duration, date: Unit, isUTC: Unit, weekStartFrom: Weekdays): Double = js.native
    
    def duration(DatetimeUnits: DatetimeUnits, number: Double): Any = js.native
    
    def formatDate(timestamp: Double): Double = js.native
    def formatDate(timestamp: Double, format: String): Double = js.native
    def formatDate(timestamp: Double, format: String, isUTC: Boolean): Double = js.native
    def formatDate(timestamp: Double, format: Unit, isUTC: Boolean): Double = js.native
    
    def parseDate(date: String): Double = js.native
    def parseDate(date: String, format: String): Double = js.native
    def parseDate(date: String, format: String, isUTC: Boolean): Double = js.native
    def parseDate(date: String, format: Unit, isUTC: Boolean): Double = js.native
  }
  
  trait Weekdays extends StObject {
    
    var Friday: Any
    
    var Monday: Any
    
    var Saturday: Any
    
    var Sunday: Any
    
    var Thursday: Any
    
    var Tuesday: Any
    
    var Wednesday: Any
  }
  object Weekdays {
    
    inline def apply(Friday: Any, Monday: Any, Saturday: Any, Sunday: Any, Thursday: Any, Tuesday: Any, Wednesday: Any): Weekdays = {
      val __obj = js.Dynamic.literal(Friday = Friday.asInstanceOf[js.Any], Monday = Monday.asInstanceOf[js.Any], Saturday = Saturday.asInstanceOf[js.Any], Sunday = Sunday.asInstanceOf[js.Any], Thursday = Thursday.asInstanceOf[js.Any], Tuesday = Tuesday.asInstanceOf[js.Any], Wednesday = Wednesday.asInstanceOf[js.Any])
      __obj.asInstanceOf[Weekdays]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Weekdays] (val x: Self) extends AnyVal {
      
      inline def setFriday(value: Any): Self = StObject.set(x, "Friday", value.asInstanceOf[js.Any])
      
      inline def setMonday(value: Any): Self = StObject.set(x, "Monday", value.asInstanceOf[js.Any])
      
      inline def setSaturday(value: Any): Self = StObject.set(x, "Saturday", value.asInstanceOf[js.Any])
      
      inline def setSunday(value: Any): Self = StObject.set(x, "Sunday", value.asInstanceOf[js.Any])
      
      inline def setThursday(value: Any): Self = StObject.set(x, "Thursday", value.asInstanceOf[js.Any])
      
      inline def setTuesday(value: Any): Self = StObject.set(x, "Tuesday", value.asInstanceOf[js.Any])
      
      inline def setWednesday(value: Any): Self = StObject.set(x, "Wednesday", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FusionChartStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FusionChartStatic = ^
}
