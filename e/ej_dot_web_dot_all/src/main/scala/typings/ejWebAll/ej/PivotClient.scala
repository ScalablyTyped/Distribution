package typings.ejWebAll.ej

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import typings.ejWebAll.ej.PivotAnalysis.FilterType
import typings.ejWebAll.ej.PivotAnalysis.SortOrder
import typings.ejWebAll.ej.PivotAnalysis.SummaryType
import typings.ejWebAll.ej.PivotChart.ChartTypes
import typings.ejWebAll.ej.PivotGrid.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotClient
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (full post) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** Renders the pivot chart and the pivot grid with the provided JSON data.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  
  /** Returns the control tab string that displays currently in the pivot client.
    * @returns {void}
    */
  def getActiveTab(): Unit = js.native
  
  /** Returns the formed JSON records to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[js.Any] = js.native
  
  /** Returns the OLAP report string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  @JSName("model")
  var model_PivotClient: Model = js.native
  
  /** Re-renders the control with the report at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  
  /** Navigates to a specified page in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotClient(): Unit = js.native
  
  /** Updates the pivot client component with the JSON data that is fetched from the service while navigating between the pages.
    * @returns {void}
    */
  def refreshPagedPivotClientSuccess(): Unit = js.native
  
  /** Sets the formed JSON records to render the control to a property.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OLAP report string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
object PivotClient {
  
  @js.native
  sealed trait ClientExportMode extends StObject
  @JSGlobal("ej.PivotClient.ClientExportMode")
  @js.native
  object ClientExportMode extends StObject {
    
    ///Exports both the PivotChart and PivotGrid on exporting.
    @js.native
    sealed trait ChartAndGrid
      extends StObject
         with ClientExportMode
    
    ///Exports the PivotChart control alone on exporting.
    @js.native
    sealed trait ChartOnly
      extends StObject
         with ClientExportMode
    
    ///Exports the PivotGrid control alone on exporting.
    @js.native
    sealed trait GridOnly
      extends StObject
         with ClientExportMode
  }
  
  @js.native
  sealed trait ControlPlacement extends StObject
  @JSGlobal("ej.PivotClient.ControlPlacement")
  @js.native
  object ControlPlacement extends StObject {
    
    ///Displays PivotChart and PivotGrid widgets in separate tabs.
    @js.native
    sealed trait Tab
      extends StObject
         with ControlPlacement
    
    ///Displays PivotChart and PivotGrid widgets one above the other.
    @js.native
    sealed trait Tile
      extends StObject
         with ControlPlacement
  }
  
  @js.native
  sealed trait DefaultView extends StObject
  @JSGlobal("ej.PivotClient.DefaultView")
  @js.native
  object DefaultView extends StObject {
    
    ///To set PivotChart as a default control in view.
    @js.native
    sealed trait Chart
      extends StObject
         with DefaultView
    
    ///To set PivotGrid as a default control in view.
    @js.native
    sealed trait Grid
      extends StObject
         with DefaultView
  }
  
  @js.native
  sealed trait DisplayMode extends StObject
  @JSGlobal("ej.PivotClient.DisplayMode")
  @js.native
  object DisplayMode extends StObject {
    
    ///To display both PivotChart and PivotGrid widgets.
    @js.native
    sealed trait ChartAndGrid
      extends StObject
         with DisplayMode
    
    ///To display only PivotChart widget.
    @js.native
    sealed trait ChartOnly
      extends StObject
         with DisplayMode
    
    ///To display only PivotGrid widget.
    @js.native
    sealed trait GridOnly
      extends StObject
         with DisplayMode
  }
  
  trait AfterServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotClient control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bounds with PivotClient control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object AfterServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): AfterServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class AfterServiceInvokeEventArgsMutableBuilder[Self <: AfterServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait AxesLabelRenderingEventArgs extends StObject {
    
    /** returns the Chart label information.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** returns the model object bound with PivotClient control.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current action of PivotClient control.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxesLabelRenderingEventArgs {
    
    @scala.inline
    def apply(): AxesLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit class AxesLabelRenderingEventArgsMutableBuilder[Self <: AxesLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeExportEventArgs extends StObject {
    
    /** holds the name of the file to be exported.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** holds the url of the service method responsible for exporting the PivotClient control.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object BeforeExportEventArgs {
    
    @scala.inline
    def apply(): BeforeExportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExportEventArgs]
    }
    
    @scala.inline
    implicit class BeforeExportEventArgsMutableBuilder[Self <: BeforeExportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait BeforeServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotClient control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bounds with PivotClient control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object BeforeServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): BeforeServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeServiceInvokeEventArgsMutableBuilder[Self <: BeforeServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait CellClickEventArgs extends StObject {
    
    /** returns the custom object bound with PivotClient control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the JSON details of the respective on cell.
      */
    var selectedData: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object CellClickEventArgs {
    
    @scala.inline
    def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit class CellClickEventArgsMutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSelectedData(value: js.Array[js.Any]): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      @scala.inline
      def setSelectedDataVarargs(value: js.Any*): Self = StObject.set(x, "selectedData", js.Array(value :_*))
    }
  }
  
  trait ChartLoadEventArgs extends StObject {
    
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
  object ChartLoadEventArgs {
    
    @scala.inline
    def apply(): ChartLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartLoadEventArgs]
    }
    
    @scala.inline
    implicit class ChartLoadEventArgsMutableBuilder[Self <: ChartLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait DataSource extends StObject {
    
    /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
      * @Default {â€œâ€}
      */
    var catalog: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be arranged in the columns section of the pivot client.
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
    
    /** Contains the respective cube name from the OLAP database as string type.
      * @Default {â€œâ€}
      */
    var cube: js.UndefOr[String] = js.undefined
    
    /** Provides the raw data source for the pivot client.
      * @Default {null}
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Allows you to filter the members (by its name and values) through the advanced filtering (e.g., Microsoft Excel) option in the client-mode.
      * @Default {false}
      */
    var enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Lists out the items which supports filtering of values without displaying the members in UI of the pivot client.
      * @Default {[]}
      */
    var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
    
    /** Allows to set the page size and current page number for each axis on applying the paging.
      * @Default {{}}
      */
    var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.undefined
    
    /** Sets the provider name for the pivot client to identify whether the provider is SSAS or Mondrian.
      * @Default {ssas}
      */
    var providerName: js.UndefOr[String] = js.undefined
    
    /** Sets a name to the report bound to the control.
      */
    var reportName: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be arranged in the rows section of the pivot client.
      * @Default {[]}
      */
    var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
    
    /** Allows to set the data source name to fetch the data from that.
      * @Default {â€œâ€}
      */
    var sourceInfo: js.UndefOr[String] = js.undefined
    
    /** Lists out the items which supports calculation in the pivot client.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[DataSourceValue]] = js.undefined
  }
  object DataSource {
    
    @scala.inline
    def apply(): DataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSource]
    }
    
    @scala.inline
    implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnableAdvancedFilter(value: Boolean): Self = StObject.set(x, "enableAdvancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAdvancedFilterUndefined: Self = StObject.set(x, "enableAdvancedFilter", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setPagerOptions(value: DataSourcePagerOptions): Self = StObject.set(x, "pagerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerOptionsUndefined: Self = StObject.set(x, "pagerOptions", js.undefined)
      
      @scala.inline
      def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[DataSourceRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: DataSourceRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setSourceInfo(value: String): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[DataSourceValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: DataSourceValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceColumn extends StObject {
    
    /** Allows you to filter the report by default using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in the client-mode.
      * @Default {[]}
      */
    var advancedFilter: js.UndefOr[js.Array[DataSourceColumnsAdvancedFilter]] = js.undefined
    
    /** Allows you to set the custom theme for the column headers.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Contains the list of members need to be drilled down by default in the field.
      * @Default {[]}
      */
    var drilledItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Allows you to set the display caption for an item.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies the filter to field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.undefined
    
    /** Allows to set the format for the column headers.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** This property is set to display the formatted values with format types in the pivot grid.
      */
    var formatString: js.UndefOr[String] = js.undefined
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
    
    /** Shows/hides the sub-total of the field in the pivot grid.
      * @Default {true}
      */
    var showSubTotal: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the sorting order of members of the field.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  }
  object DataSourceColumn {
    
    @scala.inline
    def apply(): DataSourceColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumn]
    }
    
    @scala.inline
    implicit class DataSourceColumnMutableBuilder[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilter(value: js.Array[DataSourceColumnsAdvancedFilter]): Self = StObject.set(x, "advancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterUndefined: Self = StObject.set(x, "advancedFilter", js.undefined)
      
      @scala.inline
      def setAdvancedFilterVarargs(value: DataSourceColumnsAdvancedFilter*): Self = StObject.set(x, "advancedFilter", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDrilledItems(value: js.Array[js.Any]): Self = StObject.set(x, "drilledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrilledItemsUndefined: Self = StObject.set(x, "drilledItems", js.undefined)
      
      @scala.inline
      def setDrilledItemsVarargs(value: js.Any*): Self = StObject.set(x, "drilledItems", js.Array(value :_*))
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceColumnsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      @scala.inline
      def setShowSubTotal(value: Boolean): Self = StObject.set(x, "showSubTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSubTotalUndefined: Self = StObject.set(x, "showSubTotal", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait DataSourceColumnsAdvancedFilter extends StObject {
    
    /** Allows you to set the filtering type while performing the advanced filtering.
      */
    var advancedFilterType: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the operator to perform label filtering.
      * @Default {none}
      */
    var labelFilterOperator: js.UndefOr[String] = js.undefined
    
    /** In value filtering, this property contains the measure name to which the filter is applied.
      */
    var measure: js.UndefOr[String] = js.undefined
    
    /** Allows you to provide a level unique name to perform the advanced filtering.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the operator to perform value filtering.
      * @Default {none}
      */
    var valueFilterOperator: js.UndefOr[String] = js.undefined
    
    /** Allows you to hold the filter operand values in the advanced filtering.
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSourceColumnsAdvancedFilter {
    
    @scala.inline
    def apply(): DataSourceColumnsAdvancedFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumnsAdvancedFilter]
    }
    
    @scala.inline
    implicit class DataSourceColumnsAdvancedFilterMutableBuilder[Self <: DataSourceColumnsAdvancedFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilterType(value: String): Self = StObject.set(x, "advancedFilterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterTypeUndefined: Self = StObject.set(x, "advancedFilterType", js.undefined)
      
      @scala.inline
      def setLabelFilterOperator(value: String): Self = StObject.set(x, "labelFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFilterOperatorUndefined: Self = StObject.set(x, "labelFilterOperator", js.undefined)
      
      @scala.inline
      def setMeasure(value: String): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueFilterOperator(value: String): Self = StObject.set(x, "valueFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFilterOperatorUndefined: Self = StObject.set(x, "valueFilterOperator", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): DataSourceColumnsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceColumnsFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceColumnsFilterItemsMutableBuilder[Self <: DataSourceColumnsFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceFilter extends StObject {
    
    /** Allows you to set the display name for an item.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to the field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
  }
  object DataSourceFilter {
    
    @scala.inline
    def apply(): DataSourceFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFilter]
    }
    
    @scala.inline
    implicit class DataSourceFilterMutableBuilder[Self <: DataSourceFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceFiltersFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
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
    
    @scala.inline
    def apply(): DataSourceFiltersFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceFiltersFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceFiltersFilterItemsMutableBuilder[Self <: DataSourceFiltersFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourcePagerOptions extends StObject {
    
    /** Allows to set the page number in the categorical axis to be loaded by default.
      * @Default {1}
      */
    var categoricalCurrentPage: js.UndefOr[Double] = js.undefined
    
    /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
      * @Default {0}
      */
    var categoricalPageSize: js.UndefOr[Double] = js.undefined
    
    /** Allows to set the page number in the series axis to be loaded by default.
      * @Default {1}
      */
    var seriesCurrentPage: js.UndefOr[Double] = js.undefined
    
    /** Allows to set the number of series rows to be displayed in each page on applying the paging.
      * @Default {0}
      */
    var seriesPageSize: js.UndefOr[Double] = js.undefined
  }
  object DataSourcePagerOptions {
    
    @scala.inline
    def apply(): DataSourcePagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourcePagerOptions]
    }
    
    @scala.inline
    implicit class DataSourcePagerOptionsMutableBuilder[Self <: DataSourcePagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategoricalCurrentPage(value: Double): Self = StObject.set(x, "categoricalCurrentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoricalCurrentPageUndefined: Self = StObject.set(x, "categoricalCurrentPage", js.undefined)
      
      @scala.inline
      def setCategoricalPageSize(value: Double): Self = StObject.set(x, "categoricalPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoricalPageSizeUndefined: Self = StObject.set(x, "categoricalPageSize", js.undefined)
      
      @scala.inline
      def setSeriesCurrentPage(value: Double): Self = StObject.set(x, "seriesCurrentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesCurrentPageUndefined: Self = StObject.set(x, "seriesCurrentPage", js.undefined)
      
      @scala.inline
      def setSeriesPageSize(value: Double): Self = StObject.set(x, "seriesPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesPageSizeUndefined: Self = StObject.set(x, "seriesPageSize", js.undefined)
    }
  }
  
  trait DataSourceRow extends StObject {
    
    /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in the client-mode.
      * @Default {[]}
      */
    var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.undefined
    
    /** Allows to set the custom theme for row headers.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Contains the list of members need to be drilled down by default in the field.
      * @Default {[]}
      */
    var drilledItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Allows you to set the display caption for an item.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies the filter to the field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
    
    /** Allows to set the format for row headers.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** This property is set to display the formatted values with format types in the pivot grid.
      */
    var formatString: js.UndefOr[String] = js.undefined
    
    /** Allows you to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
    
    /** Shows/hides the sub-total of the field.
      * @Default {true}
      */
    var showSubTotal: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the sorting order for the field members.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  }
  object DataSourceRow {
    
    @scala.inline
    def apply(): DataSourceRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRow]
    }
    
    @scala.inline
    implicit class DataSourceRowMutableBuilder[Self <: DataSourceRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilter(value: js.Array[DataSourceRowsAdvancedFilter]): Self = StObject.set(x, "advancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterUndefined: Self = StObject.set(x, "advancedFilter", js.undefined)
      
      @scala.inline
      def setAdvancedFilterVarargs(value: DataSourceRowsAdvancedFilter*): Self = StObject.set(x, "advancedFilter", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDrilledItems(value: js.Array[js.Any]): Self = StObject.set(x, "drilledItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrilledItemsUndefined: Self = StObject.set(x, "drilledItems", js.undefined)
      
      @scala.inline
      def setDrilledItemsVarargs(value: js.Any*): Self = StObject.set(x, "drilledItems", js.Array(value :_*))
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceRowsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
      
      @scala.inline
      def setShowSubTotal(value: Boolean): Self = StObject.set(x, "showSubTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSubTotalUndefined: Self = StObject.set(x, "showSubTotal", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait DataSourceRowsAdvancedFilter extends StObject {
    
    /** Allows you to set the filtering type while performing the advanced filtering.
      */
    var advancedFilterType: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the operator to perform the label filtering.
      * @Default {none}
      */
    var labelFilterOperator: js.UndefOr[String] = js.undefined
    
    /** In value filtering, this property contains the measure name to which the filter is applied.
      */
    var measure: js.UndefOr[String] = js.undefined
    
    /** Allows you to provide a level unique name to perform the advanced filtering.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the operator to perform the value filtering.
      * @Default {none}
      */
    var valueFilterOperator: js.UndefOr[String] = js.undefined
    
    /** Allows you to hold the filter operand values in the advanced filtering.
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSourceRowsAdvancedFilter {
    
    @scala.inline
    def apply(): DataSourceRowsAdvancedFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRowsAdvancedFilter]
    }
    
    @scala.inline
    implicit class DataSourceRowsAdvancedFilterMutableBuilder[Self <: DataSourceRowsAdvancedFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedFilterType(value: String): Self = StObject.set(x, "advancedFilterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedFilterTypeUndefined: Self = StObject.set(x, "advancedFilterType", js.undefined)
      
      @scala.inline
      def setLabelFilterOperator(value: String): Self = StObject.set(x, "labelFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFilterOperatorUndefined: Self = StObject.set(x, "labelFilterOperator", js.undefined)
      
      @scala.inline
      def setMeasure(value: String): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueFilterOperator(value: String): Self = StObject.set(x, "valueFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFilterOperatorUndefined: Self = StObject.set(x, "valueFilterOperator", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): DataSourceRowsFilterItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceRowsFilterItems]
    }
    
    @scala.inline
    implicit class DataSourceRowsFilterItemsMutableBuilder[Self <: DataSourceRowsFilterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceValue extends StObject {
    
    /** Allows to set the axis name to place the measures items.
      * @Default {rows}
      */
    var axis: js.UndefOr[String] = js.undefined
    
    /** Allows to set the custom theme for the values.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the display caption for an item for the relational data source.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows you to bind the item by using its unique name as field name for the relational data source.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Allows to set the format of the values.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** This property is set to display the formatted values with format types in the pivot grid.
      */
    var formatString: js.UndefOr[String] = js.undefined
    
    /** Allows to set the formula for calculation of members values in the relational data source.
      */
    var formula: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the field is a calculated field or not with the relational data source.
      * @Default {false}
      */
    var isCalculatedField: js.UndefOr[Boolean] = js.undefined
    
    /** This holds the list of unique names of measures to bind them from the OLAP cube.
      * @Default {[]}
      */
    var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
    
    /** Allows to set the type of the pivot grid summary calculation for the value field with the relational data source.
      * @Default {ej.PivotAnalysis.SummaryType.Sum}
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.undefined
  }
  object DataSourceValue {
    
    @scala.inline
    def apply(): DataSourceValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValue]
    }
    
    @scala.inline
    implicit class DataSourceValueMutableBuilder[Self <: DataSourceValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      @scala.inline
      def setIsCalculatedField(value: Boolean): Self = StObject.set(x, "isCalculatedField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCalculatedFieldUndefined: Self = StObject.set(x, "isCalculatedField", js.undefined)
      
      @scala.inline
      def setMeasures(value: js.Array[DataSourceValuesMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
      
      @scala.inline
      def setMeasuresVarargs(value: DataSourceValuesMeasure*): Self = StObject.set(x, "measures", js.Array(value :_*))
      
      @scala.inline
      def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    }
  }
  
  trait DataSourceValuesMeasure extends StObject {
    
    /** Allows you to bind the measure from the OLAP data source by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
  }
  object DataSourceValuesMeasure {
    
    @scala.inline
    def apply(): DataSourceValuesMeasure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceValuesMeasure]
    }
    
    @scala.inline
    implicit class DataSourceValuesMeasureMutableBuilder[Self <: DataSourceValuesMeasure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    }
  }
  
  trait DisplaySettings extends StObject {
    
    /** Allows you to customize the display of the pivot chart and pivot grid widgets in the tabs or tiles.
      * @Default {ej.PivotClient.ControlPlacement.Tab}
      */
    var controlPlacement: js.UndefOr[ControlPlacement | String] = js.undefined
    
    /** Allows you to set either the chart or grid as the start-up widget.
      * @Default {ej.PivotClient.DefaultView.Grid}
      */
    var defaultView: js.UndefOr[DefaultView | String] = js.undefined
    
    /** Allows you to switch to full screen view of the pivot chart and the pivot grid from default view in the pivot client.
      * @Default {false}
      */
    var enableFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /** Enables an option to enhance the space for the pivot grid and pivot chart by hiding the cube browser and the axis element builder.
      * @Default {false}
      */
    var enableTogglePanel: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the display mode (only chart/only grid/both) in the pivot client.
      * @Default {ej.PivotClient.DisplayMode.ChartAndGrid}
      */
    var mode: js.UndefOr[DisplayMode | String] = js.undefined
  }
  object DisplaySettings {
    
    @scala.inline
    def apply(): DisplaySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplaySettings]
    }
    
    @scala.inline
    implicit class DisplaySettingsMutableBuilder[Self <: DisplaySettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlPlacement(value: ControlPlacement | String): Self = StObject.set(x, "controlPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlPlacementUndefined: Self = StObject.set(x, "controlPlacement", js.undefined)
      
      @scala.inline
      def setDefaultView(value: DefaultView | String): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      @scala.inline
      def setEnableFullScreen(value: Boolean): Self = StObject.set(x, "enableFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFullScreenUndefined: Self = StObject.set(x, "enableFullScreen", js.undefined)
      
      @scala.inline
      def setEnableTogglePanel(value: Boolean): Self = StObject.set(x, "enableTogglePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTogglePanelUndefined: Self = StObject.set(x, "enableTogglePanel", js.undefined)
      
      @scala.inline
      def setMode(value: DisplayMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait DrillThroughEventArgs extends StObject {
    
    /** return the JSON records of the generated cells on drill-through operation.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object DrillThroughEventArgs {
    
    @scala.inline
    def apply(): DrillThroughEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillThroughEventArgs]
    }
    
    @scala.inline
    implicit class DrillThroughEventArgsMutableBuilder[Self <: DrillThroughEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait FetchReportEventArgs extends StObject {
    
    /** returns the object which holds the necessary parameters required for fetching the report names stored in database.
      */
    var fetchReportSetting: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current instance of PivotClient control.
      */
    var targetControl: js.UndefOr[js.Any] = js.undefined
  }
  object FetchReportEventArgs {
    
    @scala.inline
    def apply(): FetchReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchReportEventArgs]
    }
    
    @scala.inline
    implicit class FetchReportEventArgsMutableBuilder[Self <: FetchReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchReportSetting(value: js.Any): Self = StObject.set(x, "fetchReportSetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchReportSettingUndefined: Self = StObject.set(x, "fetchReportSetting", js.undefined)
      
      @scala.inline
      def setTargetControl(value: js.Any): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns the custom object bound with PivotTreeMap control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient component.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait LoadReportEventArgs extends StObject {
    
    /** returns the object which holds the necessary parameters required for loading a report collection from database.
      */
    var loadReportSetting: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current instance of PivotClient control.
      */
    var targetControl: js.UndefOr[js.Any] = js.undefined
  }
  object LoadReportEventArgs {
    
    @scala.inline
    def apply(): LoadReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadReportEventArgs]
    }
    
    @scala.inline
    implicit class LoadReportEventArgsMutableBuilder[Self <: LoadReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadReportSetting(value: js.Any): Self = StObject.set(x, "loadReportSetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadReportSettingUndefined: Self = StObject.set(x, "loadReportSetting", js.undefined)
      
      @scala.inline
      def setTargetControl(value: js.Any): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers when it reaches the client-side after any AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Sets the mode for the pivot client widget for binding the OLAP or relational data sources.
      * @Default {ej.Pivot.AnalysisMode.Pivot}
      */
    var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
    
    /** Triggers before the chart label is rendered in the pivot chart.
      */
    var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, Unit]] = js.undefined
    
    /** Triggers before exporting the control.
      */
    var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.undefined
    
    /** Triggers before any AJAX request is passed from the client-side to the service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Triggers when click action is performed over a grid value cell.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
    
    /** Triggers before rendering the pivot chart.
      */
    var chartLoad: js.UndefOr[js.Function1[/* e */ ChartLoadEventArgs, Unit]] = js.undefined
    
    /** Allows you to set the specific chart type for the pivot chart in the pivot client widget.
      * @Default {ej.PivotChart.ChartTypes.Column}
      */
    var chartType: js.UndefOr[ChartTypes | String] = js.undefined
    
    /** Allows you to set the content for exporting the pivot client widget.
      * @Default {ej.PivotClient.ClientExportMode.ChartAndGrid}
      */
    var clientExportMode: js.UndefOr[ClientExportMode | String] = js.undefined
    
    /** Allows you to hide the cube browser and the axis element builder of the pivot client while initiating the widget.
      * @Default {false}
      */
    var collapseCubeBrowserByDefault: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the CSS class to the pivot client for achieving the custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** An object is utilized to pass the additional information between the client-end and the service-end when the control functions are present in the server-mode.
      * @Default {{}}
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** Initializes the data source for the pivot client widget, when it functions completely on the client-side.
      * @Default {{}}
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    
    /** Allows you to customize the layout and appearance of the widget.
      * @Default {{}}
      */
    var displaySettings: js.UndefOr[DisplaySettings] = js.undefined
    
    /** Triggers while clicking the value cells in the pivot grid.
      */
    var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.undefined
    
    /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each dimensions when binding the OLAP data in the server mode.
      * @Default {false}
      */
    var enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to get cell details in JSON format by clicking the value cell.
      * @Default {false}
      */
    var enableCellClick: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to get cell details in JSON format by double-clicking the value cell.
      * @Default {false}
      */
    var enableCellDoubleClick: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to export entire data instead of current page data, while paging option is enabled.
      * @Default {false}
      */
    var enableCompleteDataExport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to refresh the control on-demand and not during the every UI operation.
      * @Default {false}
      */
    var enableDeferUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the drill-through feature which retrieves the raw items that are used to create a specific cell in the pivot grid.
      * @Default {false}
      */
    var enableDrillThrough: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to view the KPI elements in tree-view of the pivot client's cube browser.
      * @Default {false}
      */
    var enableKPI: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to save and load the reports in a customized way with the help of events.
      * @Default {false}
      */
    var enableLocalStorage: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the visibility of measure group selector drop-down in the cube browser.
      * @Default {false}
      */
    var enableMeasureGroups: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables paging in the member editor for viewing the large count of members in the pages.
      * @Default {false}
      */
    var enableMemberEditorPaging: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
      * @Default {false}
      */
    var enableMemberEditorSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable the paging for both the pivot chart and the pivot grid components for viewing the large data.
      * @Default {false}
      */
    var enablePaging: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to include the pivot tree map component as one of the chart types.
      * @Default {false}
      */
    var enablePivotTreeMap: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to view the layout of the pivot client from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the splitter option for resizing the elements in the control.
      * @Default {false}
      */
    var enableSplitter: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable the virtual scrolling for both the pivot chart and pivot grid components for viewing the large data.
      * @Default {false}
      */
    var enableVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
      * @Default {false}
      */
    var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers before fetching the report collection from the storage.
      */
    var fetchReport: js.UndefOr[js.Function1[/* e */ FetchReportEventArgs, Unit]] = js.undefined
    
    /** Sets the summary layout for the pivot grid. Following are the ways in which the summary can be positioned: normal summary (bottom), top summary, no summary, and Microsoft Excel
      * summary.
      * @Default {ej.PivotGrid.Layout.Normal}
      */
    var gridLayout: js.UndefOr[Layout | String] = js.undefined
    
    /** Allows you to enable the pivot clientâ€™s responsiveness in the browser layout.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers while initiating the loading of the widget.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Triggers before loading the saved collection of reports.
      */
    var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.undefined
    
    /** Allows you to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
      * @Default {1000}
      */
    var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.undefined
    
    /** Allows you to set the number of members to be displayed in each page of the member editor on applying the paging in it.
      * @Default {100}
      */
    var memberEditorPageSize: js.UndefOr[Double] = js.undefined
    
    /** Sets the mode for the pivot client widget to bind the data source in the server-side or the client-side.
      * @Default {ej.Pivot.OperationalMode.ClientMode}
      */
    var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
    
    /** Triggers when clicking on any chart series points in the pivot chart.
      */
    var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.undefined
    
    /** Triggers when the pivot client widget completes all operations at client-end after any AJAX request.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when any error is occurred during the AJAX request.
      */
    var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when the pivot client is completely rendered.
      */
    var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
    
    /** Triggers before saving the current collection of reports.
      */
    var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.undefined
    
    /** Triggers before rendering the pivot schema designer.
      */
    var schemaLoad: js.UndefOr[js.Function1[/* e */ SchemaLoadEventArgs, Unit]] = js.undefined
    
    /** Allows you to set the custom name for methods at service-end, and it is communicated during the AJAX post.
      * @Default {{}}
      */
    var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
    
    /** Allows you to load the saved report collection from the database.
      * @Default {false}
      */
    var showReportCollection: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to show a unique name on the pivot button.
      * @Default {false}
      */
    var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.undefined
    
    /** Options to customize the size of the pivot client control.
      * @Default {Example:}
      */
    var size: js.UndefOr[js.Any] = js.undefined
    
    /** Sets the title for the pivot client widget.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the visibility of icons in the toolbar panel.
      * @Default {{}}
      */
    var toolbarIconSettings: js.UndefOr[ToolbarIconSettings] = js.undefined
    
    /** Triggers before rendering the pivot tree map.
      */
    var treeMapLoad: js.UndefOr[js.Function1[/* e */ TreeMapLoadEventArgs, Unit]] = js.undefined
    
    /** Connects the service using the specified URL for any server updates.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /** Triggers when clicking any value cell in the pivot grid.
      */
    var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.undefined
    
    /** Holds the necessary properties for value sorting.
      * @Default {{}}
      */
    var valueSortSettings: js.UndefOr[ValueSortSettings] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.PivotClient.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotClient.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.PivotClient.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      @scala.inline
      def setAnalysisMode(value: AnalysisMode | String): Self = StObject.set(x, "analysisMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisModeUndefined: Self = StObject.set(x, "analysisMode", js.undefined)
      
      @scala.inline
      def setAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => Unit): Self = StObject.set(x, "axesLabelRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxesLabelRenderingUndefined: Self = StObject.set(x, "axesLabelRendering", js.undefined)
      
      @scala.inline
      def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = StObject.set(x, "beforeExport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeExportUndefined: Self = StObject.set(x, "beforeExport", js.undefined)
      
      @scala.inline
      def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
      @scala.inline
      def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setChartLoad(value: /* e */ ChartLoadEventArgs => Unit): Self = StObject.set(x, "chartLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartLoadUndefined: Self = StObject.set(x, "chartLoad", js.undefined)
      
      @scala.inline
      def setChartType(value: ChartTypes | String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
      
      @scala.inline
      def setClientExportMode(value: ClientExportMode | String): Self = StObject.set(x, "clientExportMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientExportModeUndefined: Self = StObject.set(x, "clientExportMode", js.undefined)
      
      @scala.inline
      def setCollapseCubeBrowserByDefault(value: Boolean): Self = StObject.set(x, "collapseCubeBrowserByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseCubeBrowserByDefaultUndefined: Self = StObject.set(x, "collapseCubeBrowserByDefault", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDisplaySettings(value: DisplaySettings): Self = StObject.set(x, "displaySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplaySettingsUndefined: Self = StObject.set(x, "displaySettings", js.undefined)
      
      @scala.inline
      def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = StObject.set(x, "drillThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
      
      @scala.inline
      def setEnableAdvancedFilter(value: Boolean): Self = StObject.set(x, "enableAdvancedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAdvancedFilterUndefined: Self = StObject.set(x, "enableAdvancedFilter", js.undefined)
      
      @scala.inline
      def setEnableCellClick(value: Boolean): Self = StObject.set(x, "enableCellClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellClickUndefined: Self = StObject.set(x, "enableCellClick", js.undefined)
      
      @scala.inline
      def setEnableCellDoubleClick(value: Boolean): Self = StObject.set(x, "enableCellDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCellDoubleClickUndefined: Self = StObject.set(x, "enableCellDoubleClick", js.undefined)
      
      @scala.inline
      def setEnableCompleteDataExport(value: Boolean): Self = StObject.set(x, "enableCompleteDataExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCompleteDataExportUndefined: Self = StObject.set(x, "enableCompleteDataExport", js.undefined)
      
      @scala.inline
      def setEnableDeferUpdate(value: Boolean): Self = StObject.set(x, "enableDeferUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDeferUpdateUndefined: Self = StObject.set(x, "enableDeferUpdate", js.undefined)
      
      @scala.inline
      def setEnableDrillThrough(value: Boolean): Self = StObject.set(x, "enableDrillThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDrillThroughUndefined: Self = StObject.set(x, "enableDrillThrough", js.undefined)
      
      @scala.inline
      def setEnableKPI(value: Boolean): Self = StObject.set(x, "enableKPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKPIUndefined: Self = StObject.set(x, "enableKPI", js.undefined)
      
      @scala.inline
      def setEnableLocalStorage(value: Boolean): Self = StObject.set(x, "enableLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLocalStorageUndefined: Self = StObject.set(x, "enableLocalStorage", js.undefined)
      
      @scala.inline
      def setEnableMeasureGroups(value: Boolean): Self = StObject.set(x, "enableMeasureGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMeasureGroupsUndefined: Self = StObject.set(x, "enableMeasureGroups", js.undefined)
      
      @scala.inline
      def setEnableMemberEditorPaging(value: Boolean): Self = StObject.set(x, "enableMemberEditorPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMemberEditorPagingUndefined: Self = StObject.set(x, "enableMemberEditorPaging", js.undefined)
      
      @scala.inline
      def setEnableMemberEditorSorting(value: Boolean): Self = StObject.set(x, "enableMemberEditorSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMemberEditorSortingUndefined: Self = StObject.set(x, "enableMemberEditorSorting", js.undefined)
      
      @scala.inline
      def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
      
      @scala.inline
      def setEnablePivotTreeMap(value: Boolean): Self = StObject.set(x, "enablePivotTreeMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePivotTreeMapUndefined: Self = StObject.set(x, "enablePivotTreeMap", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableSplitter(value: Boolean): Self = StObject.set(x, "enableSplitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSplitterUndefined: Self = StObject.set(x, "enableSplitter", js.undefined)
      
      @scala.inline
      def setEnableVirtualScrolling(value: Boolean): Self = StObject.set(x, "enableVirtualScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVirtualScrollingUndefined: Self = StObject.set(x, "enableVirtualScrolling", js.undefined)
      
      @scala.inline
      def setEnableXHRCredentials(value: Boolean): Self = StObject.set(x, "enableXHRCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableXHRCredentialsUndefined: Self = StObject.set(x, "enableXHRCredentials", js.undefined)
      
      @scala.inline
      def setFetchReport(value: /* e */ FetchReportEventArgs => Unit): Self = StObject.set(x, "fetchReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchReportUndefined: Self = StObject.set(x, "fetchReport", js.undefined)
      
      @scala.inline
      def setGridLayout(value: Layout | String): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadReport(value: /* e */ LoadReportEventArgs => Unit): Self = StObject.set(x, "loadReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadReportUndefined: Self = StObject.set(x, "loadReport", js.undefined)
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxNodeLimitInMemberEditor(value: Double): Self = StObject.set(x, "maxNodeLimitInMemberEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNodeLimitInMemberEditorUndefined: Self = StObject.set(x, "maxNodeLimitInMemberEditor", js.undefined)
      
      @scala.inline
      def setMemberEditorPageSize(value: Double): Self = StObject.set(x, "memberEditorPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberEditorPageSizeUndefined: Self = StObject.set(x, "memberEditorPageSize", js.undefined)
      
      @scala.inline
      def setOperationalMode(value: OperationalMode | String): Self = StObject.set(x, "operationalMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationalModeUndefined: Self = StObject.set(x, "operationalMode", js.undefined)
      
      @scala.inline
      def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = StObject.set(x, "pointRegionClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionClickUndefined: Self = StObject.set(x, "pointRegionClick", js.undefined)
      
      @scala.inline
      def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      @scala.inline
      def setRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = StObject.set(x, "renderFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderFailureUndefined: Self = StObject.set(x, "renderFailure", js.undefined)
      
      @scala.inline
      def setRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = StObject.set(x, "renderSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSuccessUndefined: Self = StObject.set(x, "renderSuccess", js.undefined)
      
      @scala.inline
      def setSaveReport(value: /* e */ SaveReportEventArgs => Unit): Self = StObject.set(x, "saveReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveReportUndefined: Self = StObject.set(x, "saveReport", js.undefined)
      
      @scala.inline
      def setSchemaLoad(value: /* e */ SchemaLoadEventArgs => Unit): Self = StObject.set(x, "schemaLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSchemaLoadUndefined: Self = StObject.set(x, "schemaLoad", js.undefined)
      
      @scala.inline
      def setServiceMethodSettings(value: ServiceMethodSettings): Self = StObject.set(x, "serviceMethodSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceMethodSettingsUndefined: Self = StObject.set(x, "serviceMethodSettings", js.undefined)
      
      @scala.inline
      def setShowReportCollection(value: Boolean): Self = StObject.set(x, "showReportCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowReportCollectionUndefined: Self = StObject.set(x, "showReportCollection", js.undefined)
      
      @scala.inline
      def setShowUniqueNameOnPivotButton(value: Boolean): Self = StObject.set(x, "showUniqueNameOnPivotButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUniqueNameOnPivotButtonUndefined: Self = StObject.set(x, "showUniqueNameOnPivotButton", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToolbarIconSettings(value: ToolbarIconSettings): Self = StObject.set(x, "toolbarIconSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarIconSettingsUndefined: Self = StObject.set(x, "toolbarIconSettings", js.undefined)
      
      @scala.inline
      def setTreeMapLoad(value: /* e */ TreeMapLoadEventArgs => Unit): Self = StObject.set(x, "treeMapLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeMapLoadUndefined: Self = StObject.set(x, "treeMapLoad", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValueCellHyperlinkClick(value: /* e */ ValueCellHyperlinkClickEventArgs => Unit): Self = StObject.set(x, "valueCellHyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueCellHyperlinkClickUndefined: Self = StObject.set(x, "valueCellHyperlinkClick", js.undefined)
      
      @scala.inline
      def setValueSortSettings(value: ValueSortSettings): Self = StObject.set(x, "valueSortSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSortSettingsUndefined: Self = StObject.set(x, "valueSortSettings", js.undefined)
    }
  }
  
  trait PointRegionClickEventArgs extends StObject {
    
    /** returns the clicked Chart series points information.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** returns the model object bound with PivotClient control.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current action of PivotClient control.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionClickEventArgs {
    
    @scala.inline
    def apply(): PointRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionClickEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionClickEventArgsMutableBuilder[Self <: PointRegionClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the custom object bound with PivotTreeMap control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient component.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object RenderCompleteEventArgs {
    
    @scala.inline
    def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RenderCompleteEventArgsMutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait RenderFailureEventArgs extends StObject {
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotClient control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the error message with error code.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object RenderFailureEventArgs {
    
    @scala.inline
    def apply(): RenderFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderFailureEventArgs]
    }
    
    @scala.inline
    implicit class RenderFailureEventArgsMutableBuilder[Self <: RenderFailureEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait RenderSuccessEventArgs extends StObject {
    
    /** returns the object of PivotClient control at that instant.
      */
    var args: js.UndefOr[js.Any] = js.undefined
  }
  object RenderSuccessEventArgs {
    
    @scala.inline
    def apply(): RenderSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSuccessEventArgs]
    }
    
    @scala.inline
    implicit class RenderSuccessEventArgsMutableBuilder[Self <: RenderSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
  
  trait SaveReportEventArgs extends StObject {
    
    /** returns the object which holds the necessary parameters required for saving the report collection.
      */
    var saveReportSetting: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current instance of PivotClient control.
      */
    var targetControl: js.UndefOr[js.Any] = js.undefined
  }
  object SaveReportEventArgs {
    
    @scala.inline
    def apply(): SaveReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveReportEventArgs]
    }
    
    @scala.inline
    implicit class SaveReportEventArgsMutableBuilder[Self <: SaveReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaveReportSetting(value: js.Any): Self = StObject.set(x, "saveReportSetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveReportSettingUndefined: Self = StObject.set(x, "saveReportSetting", js.undefined)
      
      @scala.inline
      def setTargetControl(value: js.Any): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
    }
  }
  
  trait SchemaLoadEventArgs extends StObject {
    
    /** returns the current action of PivotSchemaDesigner control.
      */
    var action: js.UndefOr[String] = js.undefined
  }
  object SchemaLoadEventArgs {
    
    @scala.inline
    def apply(): SchemaLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaLoadEventArgs]
    }
    
    @scala.inline
    implicit class SchemaLoadEventArgsMutableBuilder[Self <: SchemaLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
  
  trait ServiceMethodSettings extends StObject {
    
    /** Allows you to set the custom name for the service method that is responsible for updating the report with the calculated member.
      * @Default {CalculatedMember}
      */
    var calculatedMember: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for updating the entire report and widget, while changing the cube.
      * @Default {CubeChanged}
      */
    var cubeChanged: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation in the data table.
      * @Default {DrillThroughDataTable}
      */
    var drillThroughDataTable: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
      * @Default {DrillThroughHierarchies}
      */
    var drillThroughHierarchies: js.UndefOr[String] = js.undefined
    
    /** Allows to set the custom name for the service method responsible for exporting.
      * @Default {Export}
      */
    var exportPivotClient: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible to get the members for tree-view in the member-editor dialog.
      * @Default {FetchMemberTreeNodes}
      */
    var fetchMemberTreeNodes: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for fetching the report names from the database.
      * @Default {FetchReportListFromDB}
      */
    var fetchReportList: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for updating the report while filtering the members.
      * @Default {FilterElement}
      */
    var filterElement: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for initializing the pivot client.
      * @Default {InitializeClient}
      */
    var initialize: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for loading a report collection from the database.
      * @Default {LoadReportFromDB}
      */
    var loadReport: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for retrieving the MDX query for the current report.
      * @Default {GetMDXQuery}
      */
    var mdxQuery: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for updating the tree-view in the cube browser, while changing the measure group.
      * @Default {MeasureGroupChanged}
      */
    var measureGroupChanged: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible to get the child members, on tree-view node expansion.
      * @Default {MemberExpanded}
      */
    var memberExpand: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for updating the report while dropping a node/split button in the axis element builder.
      * @Default {NodeDropped}
      */
    var nodeDropped: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method while navigating between the pages in the paged pivot client.
      * @Default {Paging}
      */
    var paging: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible to remove a report collection from the database.
      * @Default {RemoveReportFromDB}
      */
    var removeDBReport: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible to update the report while removing the split button from the axis element builder.
      * @Default {RemoveSplitButton}
      */
    var removeSplitButton: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for renaming the report collection in the database.
      * @Default {RenameReportInDB}
      */
    var renameDBReport: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for saving the report collection in the database.
      * @Default {SaveReportToDB}
      */
    var saveReport: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for toggling the elements in the row and column axes.
      * @Default {ToggleAxis}
      */
    var toggleAxis: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for all the toolbar operations.
      * @Default {ToolbarOperations}
      */
    var toolbarServices: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for updating the report collection.
      * @Default {UpdateReport}
      */
    var updateReport: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotClient.
      * @Default {ValueSorting}
      */
    var valueSorting: js.UndefOr[String] = js.undefined
  }
  object ServiceMethodSettings {
    
    @scala.inline
    def apply(): ServiceMethodSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceMethodSettings]
    }
    
    @scala.inline
    implicit class ServiceMethodSettingsMutableBuilder[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculatedMember(value: String): Self = StObject.set(x, "calculatedMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculatedMemberUndefined: Self = StObject.set(x, "calculatedMember", js.undefined)
      
      @scala.inline
      def setCubeChanged(value: String): Self = StObject.set(x, "cubeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubeChangedUndefined: Self = StObject.set(x, "cubeChanged", js.undefined)
      
      @scala.inline
      def setDrillThroughDataTable(value: String): Self = StObject.set(x, "drillThroughDataTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillThroughDataTableUndefined: Self = StObject.set(x, "drillThroughDataTable", js.undefined)
      
      @scala.inline
      def setDrillThroughHierarchies(value: String): Self = StObject.set(x, "drillThroughHierarchies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillThroughHierarchiesUndefined: Self = StObject.set(x, "drillThroughHierarchies", js.undefined)
      
      @scala.inline
      def setExportPivotClient(value: String): Self = StObject.set(x, "exportPivotClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportPivotClientUndefined: Self = StObject.set(x, "exportPivotClient", js.undefined)
      
      @scala.inline
      def setFetchMemberTreeNodes(value: String): Self = StObject.set(x, "fetchMemberTreeNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchMemberTreeNodesUndefined: Self = StObject.set(x, "fetchMemberTreeNodes", js.undefined)
      
      @scala.inline
      def setFetchReportList(value: String): Self = StObject.set(x, "fetchReportList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchReportListUndefined: Self = StObject.set(x, "fetchReportList", js.undefined)
      
      @scala.inline
      def setFilterElement(value: String): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterElementUndefined: Self = StObject.set(x, "filterElement", js.undefined)
      
      @scala.inline
      def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      @scala.inline
      def setLoadReport(value: String): Self = StObject.set(x, "loadReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadReportUndefined: Self = StObject.set(x, "loadReport", js.undefined)
      
      @scala.inline
      def setMdxQuery(value: String): Self = StObject.set(x, "mdxQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdxQueryUndefined: Self = StObject.set(x, "mdxQuery", js.undefined)
      
      @scala.inline
      def setMeasureGroupChanged(value: String): Self = StObject.set(x, "measureGroupChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureGroupChangedUndefined: Self = StObject.set(x, "measureGroupChanged", js.undefined)
      
      @scala.inline
      def setMemberExpand(value: String): Self = StObject.set(x, "memberExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberExpandUndefined: Self = StObject.set(x, "memberExpand", js.undefined)
      
      @scala.inline
      def setNodeDropped(value: String): Self = StObject.set(x, "nodeDropped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDroppedUndefined: Self = StObject.set(x, "nodeDropped", js.undefined)
      
      @scala.inline
      def setPaging(value: String): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      @scala.inline
      def setRemoveDBReport(value: String): Self = StObject.set(x, "removeDBReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDBReportUndefined: Self = StObject.set(x, "removeDBReport", js.undefined)
      
      @scala.inline
      def setRemoveSplitButton(value: String): Self = StObject.set(x, "removeSplitButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveSplitButtonUndefined: Self = StObject.set(x, "removeSplitButton", js.undefined)
      
      @scala.inline
      def setRenameDBReport(value: String): Self = StObject.set(x, "renameDBReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameDBReportUndefined: Self = StObject.set(x, "renameDBReport", js.undefined)
      
      @scala.inline
      def setSaveReport(value: String): Self = StObject.set(x, "saveReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveReportUndefined: Self = StObject.set(x, "saveReport", js.undefined)
      
      @scala.inline
      def setToggleAxis(value: String): Self = StObject.set(x, "toggleAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleAxisUndefined: Self = StObject.set(x, "toggleAxis", js.undefined)
      
      @scala.inline
      def setToolbarServices(value: String): Self = StObject.set(x, "toolbarServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarServicesUndefined: Self = StObject.set(x, "toolbarServices", js.undefined)
      
      @scala.inline
      def setUpdateReport(value: String): Self = StObject.set(x, "updateReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateReportUndefined: Self = StObject.set(x, "updateReport", js.undefined)
      
      @scala.inline
      def setValueSorting(value: String): Self = StObject.set(x, "valueSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSortingUndefined: Self = StObject.set(x, "valueSorting", js.undefined)
    }
  }
  
  trait ToolbarIconSettings extends StObject {
    
    /** Allows you to set the visibility of Add Report icon in the toolbar panel.
      * @Default {true}
      */
    var enableAddReport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Calculated Member icon in the toolbar panel.
      * @Default {false}
      */
    var enableCalculatedMember: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Chart Types icon in the toolbar panel.
      * @Default {true}
      */
    var enableChartTypes: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of DB Manipulation icon in the toolbar panel.
      * @Default {true}
      */
    var enableDBManipulation: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to set the visibility of Defer Update icon in the toolbar panel.
      * @Default {false}
      */
    var enableDeferUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Excel Export icon in the toolbar panel.
      * @Default {true}
      */
    var enableExcelExport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to set the visibility of Full Screen icon in the toolbar panel.
      * @Default {false}
      */
    var enableFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of MDX Query icon in the toolbar panel.
      * @Default {true}
      */
    var enableMDXQuery: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of New Report icon in the toolbar panel.
      * @Default {true}
      */
    var enableNewReport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of PDF Export icon in the toolbar panel.
      * @Default {true}
      */
    var enablePdfExport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Remove Report icon in the toolbar panel.
      * @Default {true}
      */
    var enableRemoveReport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Rename Report icon in the toolbar panel.
      * @Default {true}
      */
    var enableRenameReport: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Sort/Filter Column icon in the toolbar panel.
      * @Default {true}
      */
    var enableSortOrFilterColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Sort/Filter Row icon in the toolbar panel.
      * @Default {true}
      */
    var enableSortOrFilterRow: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Toggle Axis icon in the toolbar panel.
      * @Default {true}
      */
    var enableToggleAxis: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to set the visibility of Word Export icon in the toolbar panel.
      * @Default {true}
      */
    var enableWordExport: js.UndefOr[Boolean] = js.undefined
  }
  object ToolbarIconSettings {
    
    @scala.inline
    def apply(): ToolbarIconSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarIconSettings]
    }
    
    @scala.inline
    implicit class ToolbarIconSettingsMutableBuilder[Self <: ToolbarIconSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableAddReport(value: Boolean): Self = StObject.set(x, "enableAddReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAddReportUndefined: Self = StObject.set(x, "enableAddReport", js.undefined)
      
      @scala.inline
      def setEnableCalculatedMember(value: Boolean): Self = StObject.set(x, "enableCalculatedMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCalculatedMemberUndefined: Self = StObject.set(x, "enableCalculatedMember", js.undefined)
      
      @scala.inline
      def setEnableChartTypes(value: Boolean): Self = StObject.set(x, "enableChartTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableChartTypesUndefined: Self = StObject.set(x, "enableChartTypes", js.undefined)
      
      @scala.inline
      def setEnableDBManipulation(value: Boolean): Self = StObject.set(x, "enableDBManipulation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDBManipulationUndefined: Self = StObject.set(x, "enableDBManipulation", js.undefined)
      
      @scala.inline
      def setEnableDeferUpdate(value: Boolean): Self = StObject.set(x, "enableDeferUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDeferUpdateUndefined: Self = StObject.set(x, "enableDeferUpdate", js.undefined)
      
      @scala.inline
      def setEnableExcelExport(value: Boolean): Self = StObject.set(x, "enableExcelExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExcelExportUndefined: Self = StObject.set(x, "enableExcelExport", js.undefined)
      
      @scala.inline
      def setEnableFullScreen(value: Boolean): Self = StObject.set(x, "enableFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFullScreenUndefined: Self = StObject.set(x, "enableFullScreen", js.undefined)
      
      @scala.inline
      def setEnableMDXQuery(value: Boolean): Self = StObject.set(x, "enableMDXQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMDXQueryUndefined: Self = StObject.set(x, "enableMDXQuery", js.undefined)
      
      @scala.inline
      def setEnableNewReport(value: Boolean): Self = StObject.set(x, "enableNewReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableNewReportUndefined: Self = StObject.set(x, "enableNewReport", js.undefined)
      
      @scala.inline
      def setEnablePdfExport(value: Boolean): Self = StObject.set(x, "enablePdfExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePdfExportUndefined: Self = StObject.set(x, "enablePdfExport", js.undefined)
      
      @scala.inline
      def setEnableRemoveReport(value: Boolean): Self = StObject.set(x, "enableRemoveReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRemoveReportUndefined: Self = StObject.set(x, "enableRemoveReport", js.undefined)
      
      @scala.inline
      def setEnableRenameReport(value: Boolean): Self = StObject.set(x, "enableRenameReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRenameReportUndefined: Self = StObject.set(x, "enableRenameReport", js.undefined)
      
      @scala.inline
      def setEnableSortOrFilterColumn(value: Boolean): Self = StObject.set(x, "enableSortOrFilterColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSortOrFilterColumnUndefined: Self = StObject.set(x, "enableSortOrFilterColumn", js.undefined)
      
      @scala.inline
      def setEnableSortOrFilterRow(value: Boolean): Self = StObject.set(x, "enableSortOrFilterRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSortOrFilterRowUndefined: Self = StObject.set(x, "enableSortOrFilterRow", js.undefined)
      
      @scala.inline
      def setEnableToggleAxis(value: Boolean): Self = StObject.set(x, "enableToggleAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableToggleAxisUndefined: Self = StObject.set(x, "enableToggleAxis", js.undefined)
      
      @scala.inline
      def setEnableWordExport(value: Boolean): Self = StObject.set(x, "enableWordExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWordExportUndefined: Self = StObject.set(x, "enableWordExport", js.undefined)
    }
  }
  
  trait TreeMapLoadEventArgs extends StObject {
    
    /** returns the current action of PivotTreeMap control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotTreeMap control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotTreeMap control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object TreeMapLoadEventArgs {
    
    @scala.inline
    def apply(): TreeMapLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeMapLoadEventArgs]
    }
    
    @scala.inline
    implicit class TreeMapLoadEventArgsMutableBuilder[Self <: TreeMapLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait ValueCellHyperlinkClickEventArgs extends StObject {
    
    /** returns the clicked cell information.
      */
    var args: js.UndefOr[js.Any] = js.undefined
    
    /** returns the custom object bounds with PivotClient control.
      */
    var customerObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGrid control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the model object bound with PivotClient control.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current action of PivotClient control.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ValueCellHyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): ValueCellHyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueCellHyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class ValueCellHyperlinkClickEventArgsMutableBuilder[Self <: ValueCellHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCustomerObject(value: js.Any): Self = StObject.set(x, "customerObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerObjectUndefined: Self = StObject.set(x, "customerObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ValueSortSettings extends StObject {
    
    /** Allows you to set the string for separating column headers provided in the headerText property.
      */
    var headerDelimiters: js.UndefOr[String] = js.undefined
    
    /** Contains the header of the specific column to which value sorting is applied.
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** Allows you to set the sorting order of values of the field.
      * @Default {ej.PivotAnalysis.SortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  }
  object ValueSortSettings {
    
    @scala.inline
    def apply(): ValueSortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueSortSettings]
    }
    
    @scala.inline
    implicit class ValueSortSettingsMutableBuilder[Self <: ValueSortSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderDelimiters(value: String): Self = StObject.set(x, "headerDelimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderDelimitersUndefined: Self = StObject.set(x, "headerDelimiters", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
}
