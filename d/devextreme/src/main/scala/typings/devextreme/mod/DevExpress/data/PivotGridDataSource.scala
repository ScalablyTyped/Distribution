package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.ColumnPath
import typings.devextreme.anon.keyinEventNameFunctionFieldsPrepared
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.EventName
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSource extends StObject {
  
  def collapseAll(id: String): Unit = js.native
  /**
    * Collapses all header items of a field with the specified identifier.
    */
  def collapseAll(id: Double): Unit = js.native
  
  /**
    * Collapses a specific header item.
    */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | js.Date]): Unit = js.native
  
  /**
    * Provides access to the facts that were used to calculate a specific summary value.
    */
  def createDrillDownDataSource(options: ColumnPath): DataSource[Any, Any] = js.native
  
  /**
    * Disposes of all the resources allocated to the PivotGridDataSource instance.
    */
  def dispose(): Unit = js.native
  
  def expandAll(id: String): Unit = js.native
  /**
    * Expands all the header items of a field with the specified identifier.
    */
  def expandAll(id: Double): Unit = js.native
  
  /**
    * Expands a specific header item.
    */
  def expandHeaderItem(area: String, path: js.Array[Any]): Unit = js.native
  
  def field(id: String): Any = js.native
  def field(id: String, options: Any): Unit = js.native
  /**
    * Gets all the properties of a field with the specified identifier.
    */
  def field(id: Double): Any = js.native
  /**
    * Updates field options&apos; values.
    */
  def field(id: Double, options: Any): Unit = js.native
  
  /**
    * Gets all the fields including those generated automatically.
    */
  def fields(): js.Array[Field] = js.native
  /**
    * Specifies a new fields collection.
    */
  def fields(fields: js.Array[Field]): Unit = js.native
  
  /**
    * Gets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(): Any = js.native
  /**
    * Sets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(filterExpr: Any): Unit = js.native
  
  /**
    * Gets all the fields within an area.
    */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[Field] = js.native
  
  /**
    * Gets the loaded data. Another data portion is loaded every time a header item is expanded.
    */
  def getData(): Any = js.native
  
  /**
    * Checks whether the PivotGridDataSource is loading data.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxPromise[Any] = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunctionFieldsPrepared): this.type = js.native
  
  /**
    * Clears the loaded PivotGridDataSource data and calls the load() method.
    */
  def reload(): DxPromise[Any] = js.native
  
  /**
    * Gets the current PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(): Any = js.native
  /**
    * Sets the PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(state: Any): Unit = js.native
}
object PivotGridDataSource {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.changed
    - typings.devextreme.devextremeStrings.fieldsPrepared
    - typings.devextreme.devextremeStrings.loadError
    - typings.devextreme.devextremeStrings.loadingChanged
  */
  trait EventName extends StObject
  object EventName {
    
    inline def changed: typings.devextreme.devextremeStrings.changed = "changed".asInstanceOf[typings.devextreme.devextremeStrings.changed]
    
    inline def fieldsPrepared: typings.devextreme.devextremeStrings.fieldsPrepared = "fieldsPrepared".asInstanceOf[typings.devextreme.devextremeStrings.fieldsPrepared]
    
    inline def loadError: typings.devextreme.devextremeStrings.loadError = "loadError".asInstanceOf[typings.devextreme.devextremeStrings.loadError]
    
    inline def loadingChanged: typings.devextreme.devextremeStrings.loadingChanged = "loadingChanged".asInstanceOf[typings.devextreme.devextremeStrings.loadingChanged]
  }
  
  type Field = PivotGridDataSourceField
  
  type Options = PivotGridDataSourceOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.column
    - typings.devextreme.devextremeStrings.data
    - typings.devextreme.devextremeStrings.filter
    - typings.devextreme.devextremeStrings.row
  */
  trait PivotGridArea extends StObject
  object PivotGridArea {
    
    inline def column: typings.devextreme.devextremeStrings.column = "column".asInstanceOf[typings.devextreme.devextremeStrings.column]
    
    inline def data: typings.devextreme.devextremeStrings.data = "data".asInstanceOf[typings.devextreme.devextremeStrings.data]
    
    inline def filter: typings.devextreme.devextremeStrings.filter = "filter".asInstanceOf[typings.devextreme.devextremeStrings.filter]
    
    inline def row: typings.devextreme.devextremeStrings.row = "row".asInstanceOf[typings.devextreme.devextremeStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.date
    - typings.devextreme.devextremeStrings.number
    - typings.devextreme.devextremeStrings.string_
  */
  trait PivotGridDataType extends StObject
  object PivotGridDataType {
    
    inline def date: typings.devextreme.devextremeStrings.date = "date".asInstanceOf[typings.devextreme.devextremeStrings.date]
    
    inline def number: typings.devextreme.devextremeStrings.number = "number".asInstanceOf[typings.devextreme.devextremeStrings.number]
    
    inline def string: string_ = "string".asInstanceOf[string_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.day
    - typings.devextreme.devextremeStrings.dayOfWeek
    - typings.devextreme.devextremeStrings.month
    - typings.devextreme.devextremeStrings.quarter
    - typings.devextreme.devextremeStrings.year
  */
  trait PivotGridGroupInterval extends StObject
  object PivotGridGroupInterval {
    
    inline def day: typings.devextreme.devextremeStrings.day = "day".asInstanceOf[typings.devextreme.devextremeStrings.day]
    
    inline def dayOfWeek: typings.devextreme.devextremeStrings.dayOfWeek = "dayOfWeek".asInstanceOf[typings.devextreme.devextremeStrings.dayOfWeek]
    
    inline def month: typings.devextreme.devextremeStrings.month = "month".asInstanceOf[typings.devextreme.devextremeStrings.month]
    
    inline def quarter: typings.devextreme.devextremeStrings.quarter = "quarter".asInstanceOf[typings.devextreme.devextremeStrings.quarter]
    
    inline def year: typings.devextreme.devextremeStrings.year = "year".asInstanceOf[typings.devextreme.devextremeStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.column
    - typings.devextreme.devextremeStrings.row
  */
  trait PivotGridRunningTotalMode extends StObject
  object PivotGridRunningTotalMode {
    
    inline def column: typings.devextreme.devextremeStrings.column = "column".asInstanceOf[typings.devextreme.devextremeStrings.column]
    
    inline def row: typings.devextreme.devextremeStrings.row = "row".asInstanceOf[typings.devextreme.devextremeStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.displayText
    - typings.devextreme.devextremeStrings.value
    - typings.devextreme.devextremeStrings.none
  */
  trait PivotGridSortBy extends StObject
  object PivotGridSortBy {
    
    inline def displayText: typings.devextreme.devextremeStrings.displayText = "displayText".asInstanceOf[typings.devextreme.devextremeStrings.displayText]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def value: typings.devextreme.devextremeStrings.value = "value".asInstanceOf[typings.devextreme.devextremeStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.array
    - typings.devextreme.devextremeStrings.local
    - typings.devextreme.devextremeStrings.odata
    - typings.devextreme.devextremeStrings.xmla
  */
  trait PivotGridStoreType extends StObject
  object PivotGridStoreType {
    
    inline def array: typings.devextreme.devextremeStrings.array = "array".asInstanceOf[typings.devextreme.devextremeStrings.array]
    
    inline def local: typings.devextreme.devextremeStrings.local = "local".asInstanceOf[typings.devextreme.devextremeStrings.local]
    
    inline def odata: typings.devextreme.devextremeStrings.odata = "odata".asInstanceOf[typings.devextreme.devextremeStrings.odata]
    
    inline def xmla: typings.devextreme.devextremeStrings.xmla = "xmla".asInstanceOf[typings.devextreme.devextremeStrings.xmla]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.absoluteVariation
    - typings.devextreme.devextremeStrings.percentOfColumnGrandTotal
    - typings.devextreme.devextremeStrings.percentOfColumnTotal
    - typings.devextreme.devextremeStrings.percentOfGrandTotal
    - typings.devextreme.devextremeStrings.percentOfRowGrandTotal
    - typings.devextreme.devextremeStrings.percentOfRowTotal
    - typings.devextreme.devextremeStrings.percentVariation
  */
  trait PivotGridSummaryDisplayMode extends StObject
  object PivotGridSummaryDisplayMode {
    
    inline def absoluteVariation: typings.devextreme.devextremeStrings.absoluteVariation = "absoluteVariation".asInstanceOf[typings.devextreme.devextremeStrings.absoluteVariation]
    
    inline def percentOfColumnGrandTotal: typings.devextreme.devextremeStrings.percentOfColumnGrandTotal = "percentOfColumnGrandTotal".asInstanceOf[typings.devextreme.devextremeStrings.percentOfColumnGrandTotal]
    
    inline def percentOfColumnTotal: typings.devextreme.devextremeStrings.percentOfColumnTotal = "percentOfColumnTotal".asInstanceOf[typings.devextreme.devextremeStrings.percentOfColumnTotal]
    
    inline def percentOfGrandTotal: typings.devextreme.devextremeStrings.percentOfGrandTotal = "percentOfGrandTotal".asInstanceOf[typings.devextreme.devextremeStrings.percentOfGrandTotal]
    
    inline def percentOfRowGrandTotal: typings.devextreme.devextremeStrings.percentOfRowGrandTotal = "percentOfRowGrandTotal".asInstanceOf[typings.devextreme.devextremeStrings.percentOfRowGrandTotal]
    
    inline def percentOfRowTotal: typings.devextreme.devextremeStrings.percentOfRowTotal = "percentOfRowTotal".asInstanceOf[typings.devextreme.devextremeStrings.percentOfRowTotal]
    
    inline def percentVariation: typings.devextreme.devextremeStrings.percentVariation = "percentVariation".asInstanceOf[typings.devextreme.devextremeStrings.percentVariation]
  }
}
