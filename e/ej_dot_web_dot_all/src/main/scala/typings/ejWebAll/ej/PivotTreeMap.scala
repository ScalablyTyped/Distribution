package typings.ejWebAll.ej

import typings.ejWebAll.ej.Pivot.OperationalMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTreeMap
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** Renders the control with the pivot engine obtained from OLAP cube.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  
  /** Returns the JSON records formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[js.Any] = js.native
  
  /** Returns the OlapReport string maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  @JSName("model")
  var model_PivotTreeMap: Model = js.native
  
  /** This function receives the update from service-end, which would be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): Unit = js.native
  
  /** This function receives the JSON formatted datasource to render the PivotTreeMap control.
    * @returns {void}
    */
  def renderTreeMapFromJSON(): Unit = js.native
  
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
object PivotTreeMap {
  
  trait AfterServiceInvokeEventArgs extends StObject {
    
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
  
  trait BeforeServiceInvokeEventArgs extends StObject {
    
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
  
  trait DataSource extends StObject {
    
    /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
      * @Default {â€œâ€}
      */
    var catalog: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be displayed as series of PivotTreeMap.
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
    
    /** Contains the respective cube name from OLAP database as string type.
      * @Default {â€œâ€}
      */
    var cube: js.UndefOr[String] = js.undefined
    
    /** Provides the raw data source for the PivotTreeMap.
      * @Default {null}
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Lists out the items which supports filtering of values without displaying the members in UI in PivotTreeMap.
      * @Default {[]}
      */
    var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
    
    /** Set the provider name for PivotTreeMap to identify whether the provider is SSAS or Mondrian.
      * @Default {ssas}
      */
    var providerName: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to be displayed as segments of PivotTreeMap.
      * @Default {[]}
      */
    var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
    
    /** To set the data source name to fetch data from that.
      * @Default {â€œâ€}
      */
    var sourceInfo: js.UndefOr[String] = js.undefined
    
    /** Lists out the items supports calculation in PivotTreeMap.
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
      def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
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
    
    /** Allows the user to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to the field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.undefined
    
    /** Allows the user to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
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
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceColumnsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
    }
  }
  
  trait DataSourceColumnsFilterItems extends StObject {
    
    /** Contains the collection of items to be excluded among the field members.
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
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceFilter extends StObject {
    
    /** Allows the user to bind the item by using its unique name as field name.
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
    
    /** Contains the collection of items to be excluded among the field members.
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
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait DataSourceRow extends StObject {
    
    /** Allows the user to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to the field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
    
    /** Allows the user to indicate whether the added item is a named set or not.
      * @Default {false}
      */
    var isNamedSets: js.UndefOr[Boolean] = js.undefined
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
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterItems(value: DataSourceRowsFilterItems): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setIsNamedSets(value: Boolean): Self = StObject.set(x, "isNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNamedSetsUndefined: Self = StObject.set(x, "isNamedSets", js.undefined)
    }
  }
  
  trait DataSourceRowsFilterItems extends StObject {
    
    /** Contains the collection of items to be excluded among the field members.
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
    
    /** This holds the list of unique names of measures to bind them from the OLAP cube.
      * @Default {[]}
      */
    var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
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
      def setMeasures(value: js.Array[DataSourceValuesMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
      
      @scala.inline
      def setMeasuresVarargs(value: DataSourceValuesMeasure*): Self = StObject.set(x, "measures", js.Array(value :_*))
    }
  }
  
  trait DataSourceValuesMeasure extends StObject {
    
    /** Allows the user to bind the measure from OLAP datasource by using its unique name as field name.
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
  
  trait DrillSuccessEventArgs extends StObject {
    
    /** return the HTML element of PivotTreeMap control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object DrillSuccessEventArgs {
    
    @scala.inline
    def apply(): DrillSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillSuccessEventArgs]
    }
    
    @scala.inline
    implicit class DrillSuccessEventArgsMutableBuilder[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
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
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Model extends StObject {
    
    /** Triggers when it reaches client-side after any AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Triggers before any AJAX request is passed from PivotTreeMap to service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Specifies the CSS class to PivotTreeMap to achieve custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Object utilized to pass additional information between client-end and service-end.
      * @Default {{}}
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** Initializes the data source for the PivotTreeMap widget, when it functions completely on client-side.
      * @Default {{}}
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    
    /** Triggers when drill up/down happens in PivotTreeMap control. And it returns the outer HTML of PivotTreeMap control.
      */
    var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.undefined
    
    /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
      * @Default {false}
      */
    var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the user to enable PivotTreeMapâ€™s responsiveness in the browser layout.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when PivotTreeMap starts to render.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Allows the user to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the mode for the PivotTreeMap widget for binding data source either in server-side or client-side.
      * @Default {ej.Pivot.OperationalMode.ClientMode}
      */
    var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
    
    /** Triggers when PivotTreeMap widget completes all operations at client-side after any AJAX request.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when any error occurred during AJAX request.
      */
    var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when PivotTreeMap successfully reaches client-side after any AJAX request.
      */
    var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
    
    /** Allows the user to set custom name for the methods at service-end, communicated on AJAX post.
      * @Default {{}}
      */
    var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
    
    /** Connects the service using the specified URL for any server updates.
      * @Default {â€œâ€}
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.PivotTreeMap.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotTreeMap.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.PivotTreeMap.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      @scala.inline
      def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
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
      def setDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = StObject.set(x, "drillSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillSuccessUndefined: Self = StObject.set(x, "drillSuccess", js.undefined)
      
      @scala.inline
      def setEnableXHRCredentials(value: Boolean): Self = StObject.set(x, "enableXHRCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableXHRCredentialsUndefined: Self = StObject.set(x, "enableXHRCredentials", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOperationalMode(value: OperationalMode | String): Self = StObject.set(x, "operationalMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationalModeUndefined: Self = StObject.set(x, "operationalMode", js.undefined)
      
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
      def setServiceMethodSettings(value: ServiceMethodSettings): Self = StObject.set(x, "serviceMethodSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceMethodSettingsUndefined: Self = StObject.set(x, "serviceMethodSettings", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
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
  object RenderCompleteEventArgs {
    
    @scala.inline
    def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RenderCompleteEventArgsMutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait RenderFailureEventArgs extends StObject {
    
    /** returns the current action of PivotTreeMap control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound with PivotTreeMap control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotTreeMap control.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the error stack trace of the original exception.
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
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait RenderSuccessEventArgs extends StObject {
    
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
  object RenderSuccessEventArgs {
    
    @scala.inline
    def apply(): RenderSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSuccessEventArgs]
    }
    
    @scala.inline
    implicit class RenderSuccessEventArgsMutableBuilder[Self <: RenderSuccessEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ServiceMethodSettings extends StObject {
    
    /** Allows the user to set the custom name for the service method responsible for drilling up/down operation in PivotTreeMap.
      * @Default {DrillTreeMap}
      */
    var drillDown: js.UndefOr[String] = js.undefined
    
    /** Allows the user to set the custom name for the service method responsible for initializing PivotTreeMap.
      * @Default {InitializeTreemap}
      */
    var initialize: js.UndefOr[String] = js.undefined
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
      def setDrillDown(value: String): Self = StObject.set(x, "drillDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownUndefined: Self = StObject.set(x, "drillDown", js.undefined)
      
      @scala.inline
      def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    }
  }
}
