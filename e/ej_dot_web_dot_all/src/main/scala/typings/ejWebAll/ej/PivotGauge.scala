package typings.ejWebAll.ej

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import typings.ejWebAll.ej.PivotAnalysis.FilterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGauge
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Returns the JSON records required to render the PivotGauge on performing any action with OLAP data source.
    * @returns {void}
    */
  def getJSONData(): Unit = js.native
  
  /** Returns the JSON records formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[js.Any] = js.native
  
  /** Returns the OlapReport string maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  @JSName("model")
  var model_PivotGauge: Model = js.native
  
  /** This function is used to refresh the PivotGauge at client-side itself.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** This function removes the KPI related images from PivotGauge on binding OLAP datasource.
    * @returns {void}
    */
  def removeImg(): Unit = js.native
  
  /** This function receives the JSON formatted datasource and renders the PivotGauge control.
    * @returns {void}
    */
  def renderControlFromJSON(): Unit = js.native
  
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
object PivotGauge {
  
  @js.native
  sealed trait NumberFormat extends StObject
  @JSGlobal("ej.PivotGauge.NumberFormat")
  @js.native
  object NumberFormat extends StObject {
    
    ///To set currency format for label values.
    @js.native
    sealed trait Currency
      extends StObject
         with NumberFormat
    
    ///To set default format for label values.
    @js.native
    sealed trait Default
      extends StObject
         with NumberFormat
    
    ///To set fraction format for label values.
    @js.native
    sealed trait Fraction
      extends StObject
         with NumberFormat
    
    ///To set notation format for label values.
    @js.native
    sealed trait Notation
      extends StObject
         with NumberFormat
    
    ///To set percentage format for label values.
    @js.native
    sealed trait Percentage
      extends StObject
         with NumberFormat
    
    ///To set scientific format for label values.
    @js.native
    sealed trait Scientific
      extends StObject
         with NumberFormat
    
    ///To set text format for label values.
    @js.native
    sealed trait Text
      extends StObject
         with NumberFormat
  }
  
  trait AfterServiceInvokeEventArgs extends StObject {
    
    /** returns the custom object bound with PivotGauge control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGauge control.
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
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait BeforePivotEnginePopulateEventArgs extends StObject {
    
    /** returns the current instance of PivotGauge control.
      */
    var gaugeObject: js.UndefOr[js.Any] = js.undefined
  }
  object BeforePivotEnginePopulateEventArgs {
    
    @scala.inline
    def apply(): BeforePivotEnginePopulateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
    }
    
    @scala.inline
    implicit class BeforePivotEnginePopulateEventArgsMutableBuilder[Self <: BeforePivotEnginePopulateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGaugeObject(value: js.Any): Self = StObject.set(x, "gaugeObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaugeObjectUndefined: Self = StObject.set(x, "gaugeObject", js.undefined)
    }
  }
  
  trait BeforeServiceInvokeEventArgs extends StObject {
    
    /** returns the custom object bound with PivotGauge control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGauge control.
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
    
    /** Lists out the items to bind in columns section.
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
    
    /** Contains the respective cube name from OLAP database as string type.
      * @Default {â€œâ€}
      */
    var cube: js.UndefOr[String] = js.undefined
    
    /** Provides the raw data source for the PivotGauge.
      * @Default {null}
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Lists out the items which supports filtering of values without displaying the members in UI in PivotGauge.
      * @Default {[]}
      */
    var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
    
    /** Set the provider name for PivotGauge to identify whether the provider is SSAS or Mondrian.
      * @Default {ssas}
      */
    var providerName: js.UndefOr[String] = js.undefined
    
    /** Lists out the items to bind in rows section.
      * @Default {[]}
      */
    var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
    
    /** To set the data source name to fetch data from that.
      * @Default {â€œâ€}
      */
    var sourceInfo: js.UndefOr[String] = js.undefined
    
    /** Lists out the items supports calculation in PivotGauge.
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
  
  trait DataSourceRow extends StObject {
    
    /** Allows the user to bind the item by using its unique name as field name.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Applies filter to the field members.
      * @Default {null}
      */
    var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
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
    
    /** Allows the user to set the display caption for an item for Relational datasource.
      */
    var fieldCaption: js.UndefOr[String] = js.undefined
    
    /** Allows the user to bind the item by using its unique name as field name for Relational datasource.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** Allows to set the formula for calculation of values for calculated members in Relational datasource.
      */
    var formula: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the field is a calculated field or not with Relational datasource.
      * @Default {false}
      */
    var isCalculatedField: js.UndefOr[Boolean] = js.undefined
    
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
      def setFieldCaption(value: String): Self = StObject.set(x, "fieldCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCaptionUndefined: Self = StObject.set(x, "fieldCaption", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
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
  
  trait Frame extends StObject {
    
    /** Specifies the frame type of PivotGauge.
      * @Default {fullcircle}
      */
    var frameType: js.UndefOr[String] = js.undefined
    
    /** Specifies the end angle for the half circular frame.
      * @Default {360}
      */
    var halfCircleFrameEndAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the start angle for the half circular frame.
      * @Default {180}
      */
    var halfCircleFrameStartAngle: js.UndefOr[Double] = js.undefined
  }
  object Frame {
    
    @scala.inline
    def apply(): Frame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameType(value: String): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameTypeUndefined: Self = StObject.set(x, "frameType", js.undefined)
      
      @scala.inline
      def setHalfCircleFrameEndAngle(value: Double): Self = StObject.set(x, "halfCircleFrameEndAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCircleFrameEndAngleUndefined: Self = StObject.set(x, "halfCircleFrameEndAngle", js.undefined)
      
      @scala.inline
      def setHalfCircleFrameStartAngle(value: Double): Self = StObject.set(x, "halfCircleFrameStartAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCircleFrameStartAngleUndefined: Self = StObject.set(x, "halfCircleFrameStartAngle", js.undefined)
    }
  }
  
  trait LabelFormatSettings extends StObject {
    
    /** Allows you to set the number of digits displayed after decimal point.
      * @Default {5}
      */
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    /** Allows the user to change the number format of the label values in PivotGauge.
      * @Default {ej.PivotGauge.NumberFormat.Default}
      */
    var numberFormat: js.UndefOr[NumberFormat | String] = js.undefined
    
    /** Allows you to add a text at the beginning of the label.
      */
    var prefixText: js.UndefOr[String] = js.undefined
    
    /** Allows you to add text at the end of the label.
      */
    var suffixText: js.UndefOr[String] = js.undefined
  }
  object LabelFormatSettings {
    
    @scala.inline
    def apply(): LabelFormatSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelFormatSettings]
    }
    
    @scala.inline
    implicit class LabelFormatSettingsMutableBuilder[Self <: LabelFormatSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      @scala.inline
      def setNumberFormat(value: NumberFormat | String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
      
      @scala.inline
      def setPrefixText(value: String): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
      
      @scala.inline
      def setSuffixText(value: String): Self = StObject.set(x, "suffixText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixTextUndefined: Self = StObject.set(x, "suffixText", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns the current action of PivotGauge control.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** returns the custom object bound to the control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of the widget.
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the model of PivotGauge control.
      */
    var model: js.UndefOr[js.Any] = js.undefined
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
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers when it reaches client-side after any AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Sets the mode for the PivotGauge widget for binding either OLAP or Relational data source.
      * @Default {ej.Pivot.AnalysisMode.Pivot}
      */
    var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
    
    /** Triggers before populating the pivot engine on operating in client mode.
      */
    var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.undefined
    
    /** Triggers before any AJAX request is passed from PivotGauge to service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
    
    /** Sets the number of columns to arrange the Pivot Gauges.
      * @Default {0}
      */
    var columnsCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the CSS class to PivotGauge to achieve custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Object utilized to pass additional information between client-end and service-end on operating in server mode.
      * @Default {{}}
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** Initializes the data source for the PivotGauge widget, when it functions completely on client-side.
      * @Default {{}}
      */
    var dataSource: js.UndefOr[DataSource] = js.undefined
    
    /** Enables/disables the animation of pointer in PivotGauge.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the user to view PivotGauge from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables tooltip visibility in PivotGauge.
      * @Default {false}
      */
    var enableTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
      * @Default {false}
      */
    var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the frame details of PivotGauge here.
      * @Default {Object}
      */
    var frame: js.UndefOr[Frame] = js.undefined
    
    /** Allows the user to enable PivotGaugeâ€™s responsiveness in the browser layout.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the user to change the format of the label values in PivotGauge.
      * @Default {null}
      */
    var labelFormatSettings: js.UndefOr[LabelFormatSettings] = js.undefined
    
    /** Triggers when PivotGauge started loading at client-side.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Allows the user to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the mode for the PivotGauge widget for binding data source either in server-side or client-side.
      * @Default {ej.Pivot.OperationalMode.ClientMode}
      */
    var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
    
    /** Triggers when PivotGauge widget completes all operations at client-side after any AJAX request.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when any error occurred during AJAX request.
      */
    var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when PivotGauge successfully reaches client-side after any AJAX request.
      */
    var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
    
    /** Sets the number of rows to arrange the Pivot Gauges.
      * @Default {0}
      */
    var rowsCount: js.UndefOr[Double] = js.undefined
    
    /** Sets the scale values such as pointers, indicators, etc... for PivotGauge.
      * @Default {{}}
      */
    var scales: js.UndefOr[js.Any] = js.undefined
    
    /** Allows the user to set the custom name for the methods at service-end, communicated during AJAX post.
      * @Default {{}}
      */
    var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
    
    /** Enables/disables the header labels in PivotGauge.
      * @Default {true}
      */
    var showHeaderLabel: js.UndefOr[Boolean] = js.undefined
    
    /** Connects the service using the specified URL for any server updates on server mode operation.
      * @Default {â€œâ€}
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.PivotGauge.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotGauge.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.PivotGauge.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      @scala.inline
      def setAnalysisMode(value: AnalysisMode | String): Self = StObject.set(x, "analysisMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisModeUndefined: Self = StObject.set(x, "analysisMode", js.undefined)
      
      @scala.inline
      def setBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = StObject.set(x, "beforePivotEnginePopulate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforePivotEnginePopulateUndefined: Self = StObject.set(x, "beforePivotEnginePopulate", js.undefined)
      
      @scala.inline
      def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
      @scala.inline
      def setColumnsCount(value: Double): Self = StObject.set(x, "columnsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsCountUndefined: Self = StObject.set(x, "columnsCount", js.undefined)
      
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
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableTooltip(value: Boolean): Self = StObject.set(x, "enableTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTooltipUndefined: Self = StObject.set(x, "enableTooltip", js.undefined)
      
      @scala.inline
      def setEnableXHRCredentials(value: Boolean): Self = StObject.set(x, "enableXHRCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableXHRCredentialsUndefined: Self = StObject.set(x, "enableXHRCredentials", js.undefined)
      
      @scala.inline
      def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLabelFormatSettings(value: LabelFormatSettings): Self = StObject.set(x, "labelFormatSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFormatSettingsUndefined: Self = StObject.set(x, "labelFormatSettings", js.undefined)
      
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
      def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsCountUndefined: Self = StObject.set(x, "rowsCount", js.undefined)
      
      @scala.inline
      def setScales(value: js.Any): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setServiceMethodSettings(value: ServiceMethodSettings): Self = StObject.set(x, "serviceMethodSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceMethodSettingsUndefined: Self = StObject.set(x, "serviceMethodSettings", js.undefined)
      
      @scala.inline
      def setShowHeaderLabel(value: Boolean): Self = StObject.set(x, "showHeaderLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderLabelUndefined: Self = StObject.set(x, "showHeaderLabel", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the custom object bound with PivotGauge control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGauge control.
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
    
    /** returns the HTML element of PivotGauge control.
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
    
    /** returns the custom object bound with the control.
      */
    var customObject: js.UndefOr[js.Any] = js.undefined
    
    /** returns the HTML element of PivotGauge control.
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
    
    /** Allows the user to set the custom name for the service method responsible for initializing PivotGauge.
      * @Default {InitializeGauge}
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
      def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    }
  }
}
