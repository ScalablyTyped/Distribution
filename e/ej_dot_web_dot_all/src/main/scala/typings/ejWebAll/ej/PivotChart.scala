package typings.ejWebAll.ej

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import typings.ejWebAll.ej.PivotAnalysis.FilterType
import typings.ejWebAll.ej.PivotAnalysis.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotChart
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Posts an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** Exports the pivot chart to the format that is specified in the parameter.
    * @returns {void}
    */
  def exportPivotChart(): Unit = js.native
  
  /** Renders the control with the pivot engine that is obtained from the OLAP cube.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  
  /** Returns the JSON records that are formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[js.Any] = js.native
  
  /** Returns the OlapReport string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  /** Returns the PivotEngine that is formed to render the control.
    * @returns {any[]}
    */
  def getPivotEngine(): js.Array[js.Any] = js.native
  
  @JSName("model")
  var model_PivotChart: Model = js.native
  
  /** Re-renders the control with the datasource at instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  
  /** Navigates to the specified page number in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotChart(): Unit = js.native
  
  /** This function renders the pivot chart control with the JSON formatted data source.
    * @returns {void}
    */
  def renderChartFromJSON(): Unit = js.native
  
  /** This function receives the update from the service-end, which will be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): Unit = js.native
  
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
  
  /** Sets the PivotEngine that is required to render the control.
    * @returns {void}
    */
  def setPivotEngine(): Unit = js.native
}
object PivotChart {
  
  @js.native
  sealed trait ChartTypes extends StObject
  @JSGlobal("ej.PivotChart.ChartTypes")
  @js.native
  object ChartTypes extends StObject {
    
    ///To render an Area type PivotChart.
    @js.native
    sealed trait Area
      extends StObject
         with ChartTypes
    
    ///To render a Bar type PivotChart.
    @js.native
    sealed trait Bar
      extends StObject
         with ChartTypes
    
    ///To render a Bubble type PivotChart.
    @js.native
    sealed trait Bubble
      extends StObject
         with ChartTypes
    
    ///To render a Column type PivotChart.
    @js.native
    sealed trait Column
      extends StObject
         with ChartTypes
    
    ///To render a Doughnut type PivotChart.
    @js.native
    sealed trait Doughnut
      extends StObject
         with ChartTypes
    
    ///To render a Funnel type PivotChart.
    @js.native
    sealed trait Funnel
      extends StObject
         with ChartTypes
    
    ///To render a Line type PivotChart.
    @js.native
    sealed trait Line
      extends StObject
         with ChartTypes
    
    ///To render a Pie type PivotChart.
    @js.native
    sealed trait Pie
      extends StObject
         with ChartTypes
    
    ///To render a Pyramid type PivotChart.
    @js.native
    sealed trait Pyramid
      extends StObject
         with ChartTypes
    
    ///To render a Scatter type PivotChart.
    @js.native
    sealed trait Scatter
      extends StObject
         with ChartTypes
    
    ///To render a Spline type PivotChart.
    @js.native
    sealed trait Spline
      extends StObject
         with ChartTypes
    
    ///To render a SplineArea type PivotChart.
    @js.native
    sealed trait SplineArea
      extends StObject
         with ChartTypes
    
    ///To render a StackingArea type PivotChart.
    @js.native
    sealed trait StackingArea
      extends StObject
         with ChartTypes
    
    ///To render a StackingBar type PivotChart.
    @js.native
    sealed trait StackingBar
      extends StObject
         with ChartTypes
    
    ///To render a StackingColumn type PivotChart.
    @js.native
    sealed trait StackingColumn
      extends StObject
         with ChartTypes
    
    ///To render a StepArea type PivotChart.
    @js.native
    sealed trait StepArea
      extends StObject
         with ChartTypes
    
    ///To render a StepLine type PivotChart.
    @js.native
    sealed trait StepLine
      extends StObject
         with ChartTypes
  }
  
  trait AfterServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotChart control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotChart control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotChart control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object AfterServiceInvokeEventArgs {
    
    inline def apply(): AfterServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterServiceInvokeEventArgs]
    }
    
    extension [Self <: AfterServiceInvokeEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait BeforeExportEventArgs extends StObject {
    
    /** contains the name of the exporting file.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** contains the url of the service responsible for exporting.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object BeforeExportEventArgs {
    
    inline def apply(): BeforeExportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExportEventArgs]
    }
    
    extension [Self <: BeforeExportEventArgs](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait BeforeSeriesRenderEventArgs extends StObject {
    
    /** series - Instance of the series which is about to get rendered
      */
    var data: js.UndefOr[js.Any] = js.undefined
  }
  object BeforeSeriesRenderEventArgs {
    
    inline def apply(): BeforeSeriesRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSeriesRenderEventArgs]
    }
    
    extension [Self <: BeforeSeriesRenderEventArgs](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait BeforeServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotChart control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotChart control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotChart control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object BeforeServiceInvokeEventArgs {
    
    inline def apply(): BeforeServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
    }
    
    extension [Self <: BeforeServiceInvokeEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait CommonSeriesOptions extends StObject {
    
    /** Allows you to set the specific chart type for the pivot chart widget.
      * @Default {ej.PivotChart.ChartTypes.Column}
      */
    var `type`: js.UndefOr[ChartTypes | String] = js.undefined
  }
  object CommonSeriesOptions {
    
    inline def apply(): CommonSeriesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptions]
    }
    
    extension [Self <: CommonSeriesOptions](x: Self) {
      
      inline def setType(value: ChartTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataSource extends StObject {
    
    /** In connection with the OLAP database, this property contains the database name as string to fetch the data from the given connection string.
      * @Default {â€œâ€}
      */
    var catalog: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be displayed as series of the pivot chart.
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
    
    /** Contains the respective cube name from the OLAP database as string type.
      * @Default {â€œâ€}
      */
    var cube: js.UndefOr[String] = js.undefined
    
    /** Provides the raw datasource for the pivot chart.
      * @Default {null}
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Lists out the items that supports filtering of values without displaying the members in UI of the pivot chart.
      * @Default {[]}
      */
    var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
    
    /** Sets the provider name for the pivot chart to identify whether the provider is SSAS or Mondrian.
      * @Default {ssas}
      */
    var providerName: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be displayed as segments of the pivot chart.
      * @Default {[]}
      */
    var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
    
    /** To set the datasource name to fetch the data from that.
      * @Default {â€œâ€}
      */
    var sourceInfo: js.UndefOr[String] = js.undefined
    
    /** Lists out the items support calculation in the pivot chart.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[DataSourceValue]] = js.undefined
  }
  object DataSource {
    
    inline def apply(): DataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSource]
    }
    
    extension [Self <: DataSource](x: Self) {
      
      inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
      
      inline def setColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
      
      inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      inline def setRows(value: js.Array[DataSourceRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: DataSourceRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      inline def setSourceInfo(value: String): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
      
      inline def setValues(value: js.Array[DataSourceValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: DataSourceValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceColumn extends StObject {
    
    /** Allows you to set the display caption for the item.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.undefined
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the sorting order of field members.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  }
  object DataSourceColumn {
    
    inline def apply(): DataSourceColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumn]
    }
    
    extension [Self <: DataSourceColumn](x: Self) {
      
      inline def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      inline def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setFilterItems(value: DataSourceColumnsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      inline def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      inline def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait DataSourceColumnsFilterItems extends StObject {
    
    /** Sets the type of filter whether to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.undefined
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSourceColumnsFilterItems {
    
    inline def apply(): DataSourceColumnsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumnsFilterItems]
    }
    
    extension [Self <: DataSourceColumnsFilterItems](x: Self) {
      
      inline def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceFilter extends StObject {
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
  }
  object DataSourceFilter {
    
    inline def apply(): DataSourceFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFilter]
    }
    
    extension [Self <: DataSourceFilter](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setFilterItems(value: DataSourceFiltersFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
    }
  }
  
  trait DataSourceFiltersFilterItems extends StObject {
    
    /** Sets the type of filter whether to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.undefined
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSourceFiltersFilterItems {
    
    inline def apply(): DataSourceFiltersFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFiltersFilterItems]
    }
    
    extension [Self <: DataSourceFiltersFilterItems](x: Self) {
      
      inline def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceRow extends StObject {
    
    /** Allows you to set the display caption for the item.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the sorting order of field members.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  }
  object DataSourceRow {
    
    inline def apply(): DataSourceRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRow]
    }
    
    extension [Self <: DataSourceRow](x: Self) {
      
      inline def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      inline def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setFilterItems(value: DataSourceRowsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      inline def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      inline def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait DataSourceRowsFilterItems extends StObject {
    
    /** Sets the type of filter whether to include/exclude the mentioned values.
      * @Default {ej.PivotAnalysis.FilterType.Exclude}
      */
    var filterType: js.UndefOr[FilterType | String] = js.undefined
    
    /** Contains the collection of items to be included/excluded among the field members.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSourceRowsFilterItems {
    
    inline def apply(): DataSourceRowsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRowsFilterItems]
    }
    
    extension [Self <: DataSourceRowsFilterItems](x: Self) {
      
      inline def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceValue extends StObject {
    
    /** Allows you to set the axis name to place the measures items.
      * @Default {rows}
      */
    var axis: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the display caption for the item of the relational datasource.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name for the relational datasource.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the formula to calculate the values for calculated members in the relational datasource.
      */
    var formula: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the field is a calculated field with the relational datasource or not.
      * @Default {false}
      */
    var isCalculatedField: js.UndefOr[Boolean] = js.undefined
    
    /** Holds the list of unique names of measures to bind them from the OLAP cube.
      * @Default {[]}
      */
    var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
  }
  object DataSourceValue {
    
    inline def apply(): DataSourceValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValue]
    }
    
    extension [Self <: DataSourceValue](x: Self) {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      inline def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      inline def setIsCalculatedField(value: Boolean): Self = StObject.set(x, "isCalculatedField", value.asInstanceOf[js.Any])
      
      inline def setIsCalculatedFieldUndefined: Self = StObject.set(x, "isCalculatedField", js.undefined)
      
      inline def setMeasures(value: js.Array[DataSourceValuesMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
      
      inline def setMeasuresVarargs(value: DataSourceValuesMeasure*): Self = StObject.set(x, "measures", js.Array(value :_*))
    }
  }
  
  trait DataSourceValuesMeasure extends StObject {
    
    /** Allows you to bind the measure from the OLAP datasource by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
  }
  object DataSourceValuesMeasure {
    
    inline def apply(): DataSourceValuesMeasure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValuesMeasure]
    }
    
    extension [Self <: DataSourceValuesMeasure](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    }
  }
  
  trait DrillSuccessEventArgs extends StObject {
    
    /** returns the current instance of PivotChart.
      */
    var chartObj: js.UndefOr[js.Any] = js.undefined
    
    /** returns the drill action of PivotChart.
      */
    var drillAction: js.UndefOr[String] = js.undefined
    
    /** contains the name of the member drilled.
      */
    var drilledMember: js.UndefOr[String] = js.undefined
    
    /** returns the event object.
      */
    var event: js.UndefOr[js.Any] = js.undefined
  }
  object DrillSuccessEventArgs {
    
    inline def apply(): DrillSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillSuccessEventArgs]
    }
    
    extension [Self <: DrillSuccessEventArgs](x: Self) {
      
      inline def setChartObj(value: js.Any): Self = StObject.set(x, "chartObj", value.asInstanceOf[js.Any])
      
      inline def setChartObjUndefined: Self = StObject.set(x, "chartObj", js.undefined)
      
      inline def setDrillAction(value: String): Self = StObject.set(x, "drillAction", value.asInstanceOf[js.Any])
      
      inline def setDrillActionUndefined: Self = StObject.set(x, "drillAction", js.undefined)
      
      inline def setDrilledMember(value: String): Self = StObject.set(x, "drilledMember", value.asInstanceOf[js.Any])
      
      inline def setDrilledMemberUndefined: Self = StObject.set(x, "drilledMember", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns the current action of PivotChart control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotChart control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotChart control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    extension [Self <: LoadEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers when it reaches the client-side after any AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Sets the mode for the pivot chart widget to bind either the OLAP or relational datasource.
      * @Default {ej.Pivot.AnalysisMode.Pivot}
      */
    var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
    
    /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array.
      * @Default {[]}
      */
    var axes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Triggers before performing export operation in the pivot chart.
      */
    var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.undefined
    
    /** Triggers before rendering multiple series with multiple axes.
      */
    var beforeSeriesRender: js.UndefOr[js.Function1[/* e */ BeforeSeriesRenderEventArgs, Unit]] = js.undefined
    
    /** Triggers before any AJAX request is passed from the pivot chart to service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Options available to configure the properties of entire series. You can also override the options for specific series by using the series collection.
      * @Default {{}}
      */
    var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.undefined
    
    /** Specifies the CSS class to the pivot chart for achieving the custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in the server mode.
      * @Default {{}}
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** Initializes the datasource for the pivot chart widget, when it functions completely on the client-side.
      * @Default {{}}
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    
    /** Triggers when performing drill up/down operation in the pivot chart control.
      */
    var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.undefined
    
    /** Allows you to enable the 3D view of the pivot chart.
      * @Default {false}
      */
    var enable3D: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable/disable context menu options in the pivot chart.
      * @Default {false}
      */
    var enableContextMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to render the complete pivot chart on drill operation, when expanding and collapsing members are shown in multi-level labels.
      * @Default {false}
      */
    var enableMultiLevelLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to view the pivot chart from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
      * @Default {false}
      */
    var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable the responsiveness of pivot chart in the browser layout.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** You can customize the legend items and their labels.
      * @Default {{}}
      */
    var legend: js.UndefOr[js.Any] = js.undefined
    
    /** Triggers when the pivot chart starts to render.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Allows you to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the mode for the pivot chart widget to bind the data source either in the server-side or client-side.
      * @Default {ej.Pivot.OperationalMode.ClientMode}
      */
    var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
    
    /** This is a horizontal axis that contains options to configure the axis and it is the primary x-axis for all series in the series array. To override x-axis for particular series,
      * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both
      * the axis and the series.
      * @Default {{}}
      */
    var primaryXAxis: js.UndefOr[js.Any] = js.undefined
    
    /** This is a vertical axis that contains options to configure the axis. This is the primary y-axis for all the series in the series array. To override y-axis for particular series,
      * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both
      * the axis and the series.
      * @Default {{}}
      */
    var primaryYAxis: js.UndefOr[js.Any] = js.undefined
    
    /** Triggers when the pivot chart widget completes all operations at client-side after the AJAX request.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when the error occurs on the AJAX request.
      */
    var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when the pivot chart successfully reaches the client-side after the AJAX request.
      */
    var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
    
    /** Allows you to rotate the angle of pivot chart in 3D view.
      * @Default {0}
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /** Allows you to set the custom name for methods at service-end, when you are communicating on AJAX post.
      * @Default {{}}
      */
    var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
    
    /** Options to customize the size of the pivot chart control.
      * @Default {{}}
      */
    var size: js.UndefOr[js.Any] = js.undefined
    
    /** Options for customizing the title of PivotChart.
      */
    var title: js.UndefOr[Title] = js.undefined
    
    /** Connects the service by using the specified URL for any server updates while operating the control in the server mode.
      * @Default {â€œâ€}
      */
    var url: js.UndefOr[String] = js.undefined
    
    /** Options for enabling the zooming feature of the pivot chart.
      * @Default {{}}
      */
    var zooming: js.UndefOr[Zooming] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.PivotChart.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotChart.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.PivotChart.Model](x: Self) {
      
      inline def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      inline def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      inline def setAnalysisMode(value: AnalysisMode | String): Self = StObject.set(x, "analysisMode", value.asInstanceOf[js.Any])
      
      inline def setAnalysisModeUndefined: Self = StObject.set(x, "analysisMode", js.undefined)
      
      inline def setAxes(value: js.Array[js.Any]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxesVarargs(value: js.Any*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      inline def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = StObject.set(x, "beforeExport", js.Any.fromFunction1(value))
      
      inline def setBeforeExportUndefined: Self = StObject.set(x, "beforeExport", js.undefined)
      
      inline def setBeforeSeriesRender(value: /* e */ BeforeSeriesRenderEventArgs => Unit): Self = StObject.set(x, "beforeSeriesRender", js.Any.fromFunction1(value))
      
      inline def setBeforeSeriesRenderUndefined: Self = StObject.set(x, "beforeSeriesRender", js.undefined)
      
      inline def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      inline def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
      inline def setCommonSeriesOptions(value: CommonSeriesOptions): Self = StObject.set(x, "commonSeriesOptions", value.asInstanceOf[js.Any])
      
      inline def setCommonSeriesOptionsUndefined: Self = StObject.set(x, "commonSeriesOptions", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = StObject.set(x, "drillSuccess", js.Any.fromFunction1(value))
      
      inline def setDrillSuccessUndefined: Self = StObject.set(x, "drillSuccess", js.undefined)
      
      inline def setEnable3D(value: Boolean): Self = StObject.set(x, "enable3D", value.asInstanceOf[js.Any])
      
      inline def setEnable3DUndefined: Self = StObject.set(x, "enable3D", js.undefined)
      
      inline def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      inline def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      inline def setEnableMultiLevelLabels(value: Boolean): Self = StObject.set(x, "enableMultiLevelLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableMultiLevelLabelsUndefined: Self = StObject.set(x, "enableMultiLevelLabels", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableXHRCredentials(value: Boolean): Self = StObject.set(x, "enableXHRCredentials", value.asInstanceOf[js.Any])
      
      inline def setEnableXHRCredentialsUndefined: Self = StObject.set(x, "enableXHRCredentials", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOperationalMode(value: OperationalMode | String): Self = StObject.set(x, "operationalMode", value.asInstanceOf[js.Any])
      
      inline def setOperationalModeUndefined: Self = StObject.set(x, "operationalMode", js.undefined)
      
      inline def setPrimaryXAxis(value: js.Any): Self = StObject.set(x, "primaryXAxis", value.asInstanceOf[js.Any])
      
      inline def setPrimaryXAxisUndefined: Self = StObject.set(x, "primaryXAxis", js.undefined)
      
      inline def setPrimaryYAxis(value: js.Any): Self = StObject.set(x, "primaryYAxis", value.asInstanceOf[js.Any])
      
      inline def setPrimaryYAxisUndefined: Self = StObject.set(x, "primaryYAxis", js.undefined)
      
      inline def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      inline def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      inline def setRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = StObject.set(x, "renderFailure", js.Any.fromFunction1(value))
      
      inline def setRenderFailureUndefined: Self = StObject.set(x, "renderFailure", js.undefined)
      
      inline def setRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = StObject.set(x, "renderSuccess", js.Any.fromFunction1(value))
      
      inline def setRenderSuccessUndefined: Self = StObject.set(x, "renderSuccess", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setServiceMethodSettings(value: ServiceMethodSettings): Self = StObject.set(x, "serviceMethodSettings", value.asInstanceOf[js.Any])
      
      inline def setServiceMethodSettingsUndefined: Self = StObject.set(x, "serviceMethodSettings", js.undefined)
      
      inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setZooming(value: Zooming): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the current action of PivotChart control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotChart control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotChart control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object RenderCompleteEventArgs {
    
    inline def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    extension [Self <: RenderCompleteEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait RenderFailureEventArgs extends StObject {
    
    /** returns the current action of PivotChart control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotChart control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotChart control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the error stack trace of the original exception.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object RenderFailureEventArgs {
    
    inline def apply(): RenderFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderFailureEventArgs]
    }
    
    extension [Self <: RenderFailureEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      inline def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait RenderSuccessEventArgs extends StObject {
    
    /** returns the current instance of PivotChart.
      */
    var args: js.UndefOr[js.Any] = js.undefined
  }
  object RenderSuccessEventArgs {
    
    inline def apply(): RenderSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSuccessEventArgs]
    }
    
    extension [Self <: RenderSuccessEventArgs](x: Self) {
      
      inline def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
  
  trait ServiceMethodSettings extends StObject {
    
    /** Allows you to set the custom name for the service method that is responsible for drilling up/down in the pivot chart.
      * @Default {DrillChart}
      */
    var drillDown: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method which is responsible for exporting the pivot chart.
      * @Default {Export}
      */
    var exportPivotChart: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method which is responsible for initializing the pivot chart.
      * @Default {InitializeChart}
      */
    var initialize: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method which is responsible for navigating between pages in the paged pivot chart.
      * @Default {Paging}
      */
    var paging: js.UndefOr[String] = js.undefined
  }
  object ServiceMethodSettings {
    
    inline def apply(): ServiceMethodSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceMethodSettings]
    }
    
    extension [Self <: ServiceMethodSettings](x: Self) {
      
      inline def setDrillDown(value: String): Self = StObject.set(x, "drillDown", value.asInstanceOf[js.Any])
      
      inline def setDrillDownUndefined: Self = StObject.set(x, "drillDown", js.undefined)
      
      inline def setExportPivotChart(value: String): Self = StObject.set(x, "exportPivotChart", value.asInstanceOf[js.Any])
      
      inline def setExportPivotChartUndefined: Self = StObject.set(x, "exportPivotChart", js.undefined)
      
      inline def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setPaging(value: String): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    }
  }
  
  trait Title extends StObject {
    
    /** Text to be displayed in PivotChart title.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object Title {
    
    inline def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Zooming extends StObject {
    
    /** Enables or disables the horizontal scrollbar.
      * @Default {false}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.undefined
  }
  object Zooming {
    
    inline def apply(): Zooming = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zooming]
    }
    
    extension [Self <: Zooming](x: Self) {
      
      inline def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
    }
  }
}
