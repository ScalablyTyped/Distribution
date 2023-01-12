package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatMap
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_HeatMap: Model = js.native
}
object HeatMap {
  
  @js.native
  sealed trait Associate extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Associate")
  @js.native
  object Associate extends StObject {
    
    //Used to set the associate of tooltip as MouseEnter
    @js.native
    sealed trait MouseEnter
      extends StObject
         with Associate
    
    //Used to set the associate of tooltip as MouseFollow
    @js.native
    sealed trait MouseFollow
      extends StObject
         with Associate
    
    //Used to set the associate of tooltip as Target
    @js.native
    sealed trait Target
      extends StObject
         with Associate
  }
  
  @js.native
  sealed trait CellVisibility extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.CellVisibility")
  @js.native
  object CellVisibility extends StObject {
    
    //Hide the content of the cell
    @js.native
    sealed trait Hidden
      extends StObject
         with CellVisibility
    
    //Display the content of the cell
    @js.native
    sealed trait Visible
      extends StObject
         with CellVisibility
  }
  
  @js.native
  sealed trait Effect extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Effect")
  @js.native
  object Effect extends StObject {
    
    //Sets tooltip animation as Fade
    @js.native
    sealed trait Fade
      extends StObject
         with Effect
    
    //Sets tooltip animation as None
    @js.native
    sealed trait None
      extends StObject
         with Effect
    
    //Sets tooltip animation as Slide
    @js.native
    sealed trait Slide
      extends StObject
         with Effect
  }
  
  @js.native
  sealed trait Horizontal extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Horizontal")
  @js.native
  object Horizontal extends StObject {
    
    //Used to display the tooltip horizontally on center side of rows/columns
    @js.native
    sealed trait Center
      extends StObject
         with Horizontal
    
    //Used to display the tooltip horizontally on left side of rows/columns
    @js.native
    sealed trait Left
      extends StObject
         with Horizontal
    
    //Used to display the tooltip horizontally on right side of rows/columns
    @js.native
    sealed trait Right
      extends StObject
         with Horizontal
  }
  
  @js.native
  sealed trait LegendMode extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.LegendMode")
  @js.native
  object LegendMode extends StObject {
    
    //Scales the graphic content non-uniformly to the width and height of the diagram area
    @js.native
    sealed trait Gradient
      extends StObject
         with LegendMode
    
    //Used to align the image at the top left of diagram area
    @js.native
    sealed trait List
      extends StObject
         with LegendMode
  }
  
  @js.native
  sealed trait LegendOrientation extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
  @js.native
  object LegendOrientation extends StObject {
    
    //Scales the graphic content non-uniformly to the width and height of the diagram area
    @js.native
    sealed trait Horizontal
      extends StObject
         with LegendOrientation
    
    //Used to align the image at the top left of diagram area
    @js.native
    sealed trait Vertical
      extends StObject
         with LegendOrientation
  }
  
  @js.native
  sealed trait TextDecoration extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
  @js.native
  object TextDecoration extends StObject {
    
    //Defines a line through the text
    @js.native
    sealed trait LineThrough
      extends StObject
         with TextDecoration
    
    //Defines a normal text. This is default
    @js.native
    sealed trait None
      extends StObject
         with TextDecoration
    
    //Defines a line above the text
    @js.native
    sealed trait Overline
      extends StObject
         with TextDecoration
    
    //Defines a line below the text
    @js.native
    sealed trait Underline
      extends StObject
         with TextDecoration
  }
  
  @js.native
  sealed trait Trigger extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Trigger")
  @js.native
  object Trigger extends StObject {
    
    //Tooltip can be triggered on mouse click
    @js.native
    sealed trait Click
      extends StObject
         with Trigger
    
    //Tooltip can be triggered on mouse hovers
    @js.native
    sealed trait Hover
      extends StObject
         with Trigger
  }
  
  @js.native
  sealed trait Vertical extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Vertical")
  @js.native
  object Vertical extends StObject {
    
    //Used to display the tooltip horizontally on right side of rows/columns
    @js.native
    sealed trait Bottom
      extends StObject
         with Vertical
    
    //Used to display the tooltip horizontally on center side of rows/columns
    @js.native
    sealed trait Center
      extends StObject
         with Vertical
    
    //Used to display the tooltip horizontally on left side of rows/columns
    @js.native
    sealed trait Top
      extends StObject
         with Vertical
  }
  
  trait CellMouseEnterEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[Any] = js.undefined
  }
  object CellMouseEnterEventArgs {
    
    inline def apply(): CellMouseEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseEnterEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellMouseEnterEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait CellMouseLeaveEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[Any] = js.undefined
  }
  object CellMouseLeaveEventArgs {
    
    inline def apply(): CellMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellMouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait CellMouseOverEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[Any] = js.undefined
  }
  object CellMouseOverEventArgs {
    
    inline def apply(): CellMouseOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseOverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellMouseOverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[Any] = js.undefined
  }
  object CellSelectedEventArgs {
    
    inline def apply(): CellSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait ColorMappingCollection extends StObject {
    
    /** Specifies the color of the heat map column data.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the label properties of the heat map color.
      * @Default {null}
      */
    var label: js.UndefOr[ColorMappingCollectionLabel] = js.undefined
    
    /** Specifies the color values of the heat map column data.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ColorMappingCollection {
    
    inline def apply(): ColorMappingCollection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorMappingCollection] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: ColorMappingCollectionLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ColorMappingCollectionLabel extends StObject {
    
    /** Enables/disables the bold style of the heat map label.
      * @Default {false}
      */
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the font color of the heat map label.
      * @Default {black}
      */
    var fontColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the font family of the heat map label.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font size of the heat map label.
      * @Default {10}
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /** Enables/disables the italic style of the heat map label.
      * @Default {false}
      */
    var italic: js.UndefOr[Boolean] = js.undefined
    
    /** specifies the text value of the heat map label.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the text style of the heat map label.
      * @Default {ej.HeatMap.TextDecoration.None}
      */
    var textDecoration: js.UndefOr[TextDecoration | String] = js.undefined
  }
  object ColorMappingCollectionLabel {
    
    inline def apply(): ColorMappingCollectionLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollectionLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorMappingCollectionLabel] (val x: Self) extends AnyVal {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDecoration(value: TextDecoration | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait DefaultColumnStyle extends StObject {
    
    /** Specifies the template id of the heat map column header.
      */
    var headerTemplateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the template id of all individual cell data of the heat map.
      */
    var templateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment mode of the heat map column.
      * @Default {ej.HeatMap.TextAlign.Center}
      */
    var textAlign: js.UndefOr[Any] = js.undefined
  }
  object DefaultColumnStyle {
    
    inline def apply(): DefaultColumnStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultColumnStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultColumnStyle] (val x: Self) extends AnyVal {
      
      inline def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      inline def setTextAlign(value: Any): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  trait HeatMapCell extends StObject {
    
    /** Specifies whether the cell color can be visible or not.
      * @Default {true}
      */
    var showColor: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the cell content can be visible or not.
      * @Default {ej.HeatMap.CellVisibility.Visible}
      */
    var showContent: js.UndefOr[CellVisibility | String] = js.undefined
  }
  object HeatMapCell {
    
    inline def apply(): HeatMapCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatMapCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeatMapCell] (val x: Self) extends AnyVal {
      
      inline def setShowColor(value: Boolean): Self = StObject.set(x, "showColor", value.asInstanceOf[js.Any])
      
      inline def setShowColorUndefined: Self = StObject.set(x, "showColor", js.undefined)
      
      inline def setShowContent(value: CellVisibility | String): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
      
      inline def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    }
  }
  
  trait ItemsMapping extends StObject {
    
    /** Specifies the property and display value of the column.
      * @Default {null}
      */
    var column: js.UndefOr[ItemsMappingColumn] = js.undefined
    
    /** Specifies the property and display value of the collection of column.
      * @Default {[]}
      */
    var columnMapping: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Column settings for the individual heat map column.
      * @Default {null}
      */
    var columnStyle: js.UndefOr[ItemsMappingColumnStyle] = js.undefined
    
    /** Specifies the property and display value of the header.
      * @Default {null}
      */
    var headerMapping: js.UndefOr[ItemsMappingHeaderMapping] = js.undefined
    
    /** Specifies the row property and display value of the heat map.
      * @Default {null}
      */
    var row: js.UndefOr[ItemsMappingRow] = js.undefined
    
    /** Specifies the property and display value of the column value.
      * @Default {null}
      */
    var value: js.UndefOr[ItemsMappingValue] = js.undefined
  }
  object ItemsMapping {
    
    inline def apply(): ItemsMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMapping] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: ItemsMappingColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnMapping(value: js.Array[Any]): Self = StObject.set(x, "columnMapping", value.asInstanceOf[js.Any])
      
      inline def setColumnMappingUndefined: Self = StObject.set(x, "columnMapping", js.undefined)
      
      inline def setColumnMappingVarargs(value: Any*): Self = StObject.set(x, "columnMapping", js.Array(value*))
      
      inline def setColumnStyle(value: ItemsMappingColumnStyle): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderMapping(value: ItemsMappingHeaderMapping): Self = StObject.set(x, "headerMapping", value.asInstanceOf[js.Any])
      
      inline def setHeaderMappingUndefined: Self = StObject.set(x, "headerMapping", js.undefined)
      
      inline def setRow(value: ItemsMappingRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setValue(value: ItemsMappingValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemsMappingColumn extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.undefined
  }
  object ItemsMappingColumn {
    
    inline def apply(): ItemsMappingColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMappingColumn] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  trait ItemsMappingColumnStyle extends StObject {
    
    /** Specifies the template id of the column header.
      */
    var headerTemplateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the template id of all individual cell data.
      */
    var templateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the text align mode of the heat map column.
      * @Default {ej.HeatMap.TextAlign.Center}
      */
    var textAlign: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the heat map column.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ItemsMappingColumnStyle {
    
    inline def apply(): ItemsMappingColumnStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingColumnStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMappingColumnStyle] (val x: Self) extends AnyVal {
      
      inline def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ItemsMappingHeaderMapping extends StObject {
    
    /** Specifies the property and display value of the header.
      * @Default {null}
      */
    var columnStyle: js.UndefOr[Any] = js.undefined
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.undefined
  }
  object ItemsMappingHeaderMapping {
    
    inline def apply(): ItemsMappingHeaderMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingHeaderMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMappingHeaderMapping] (val x: Self) extends AnyVal {
      
      inline def setColumnStyle(value: Any): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  trait ItemsMappingRow extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.undefined
  }
  object ItemsMappingRow {
    
    inline def apply(): ItemsMappingRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMappingRow] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  trait ItemsMappingValue extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.undefined
  }
  object ItemsMappingValue {
    
    inline def apply(): ItemsMappingValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsMappingValue] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, Unit]] = js.undefined
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, Unit]] = js.undefined
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, Unit]] = js.undefined
    
    /** Triggered when the mouse over on the cell.
      */
    var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
    
    /** Specifies the color values of the heat map column data.
      * @Default {[]}
      */
    var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
    
    /** Specifies the default column properties for all the column style not specified in column properties.
      * @Default {[]}
      */
    var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.undefined
    
    /** Specifies whether the virtualization can be enable or not.
      * @Default {false}
      */
    var enableVirtualization: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the property of the heat map cell.
      * @Default {Null}
      */
    var heatMapCell: js.UndefOr[HeatMapCell] = js.undefined
    
    /** Specifies the width of the heat map.
      * @Default {null}
      */
    var height: js.UndefOr[Any] = js.undefined
    
    /** Specifies the name of the heat map.
      * @Default {null}
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /** Specifies can enable responsive mode or not for heat map.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the property and display value of the heat map column.
      * @Default {[]}
      */
    var itemsMapping: js.UndefOr[ItemsMapping] = js.undefined
    
    /** Specifies the source data of the heat map.
      * @Default {[]}
      */
    var itemsSource: js.UndefOr[Any] = js.undefined
    
    /** Specifies the no of legends can sync with heat map.
      * @Default {[]}
      */
    var legendCollection: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Enables or disables tooltip of heatmap
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
    
    /** Specifies the width of the heat map.
      * @Default {null}
      */
    var width: js.UndefOr[Any] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.HeatMap.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.HeatMap.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.HeatMap.Model] (val x: Self) extends AnyVal {
      
      inline def setCellMouseEnter(value: /* e */ CellMouseEnterEventArgs => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction1(value))
      
      inline def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      inline def setCellMouseLeave(value: /* e */ CellMouseLeaveEventArgs => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction1(value))
      
      inline def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      inline def setCellMouseOver(value: /* e */ CellMouseOverEventArgs => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction1(value))
      
      inline def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      inline def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = StObject.set(x, "cellSelected", js.Any.fromFunction1(value))
      
      inline def setCellSelectedUndefined: Self = StObject.set(x, "cellSelected", js.undefined)
      
      inline def setColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = StObject.set(x, "colorMappingCollection", value.asInstanceOf[js.Any])
      
      inline def setColorMappingCollectionUndefined: Self = StObject.set(x, "colorMappingCollection", js.undefined)
      
      inline def setColorMappingCollectionVarargs(value: ColorMappingCollection*): Self = StObject.set(x, "colorMappingCollection", js.Array(value*))
      
      inline def setDefaultColumnStyle(value: DefaultColumnStyle): Self = StObject.set(x, "defaultColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultColumnStyleUndefined: Self = StObject.set(x, "defaultColumnStyle", js.undefined)
      
      inline def setEnableVirtualization(value: Boolean): Self = StObject.set(x, "enableVirtualization", value.asInstanceOf[js.Any])
      
      inline def setEnableVirtualizationUndefined: Self = StObject.set(x, "enableVirtualization", js.undefined)
      
      inline def setHeatMapCell(value: HeatMapCell): Self = StObject.set(x, "heatMapCell", value.asInstanceOf[js.Any])
      
      inline def setHeatMapCellUndefined: Self = StObject.set(x, "heatMapCell", js.undefined)
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setItemsMapping(value: ItemsMapping): Self = StObject.set(x, "itemsMapping", value.asInstanceOf[js.Any])
      
      inline def setItemsMappingUndefined: Self = StObject.set(x, "itemsMapping", js.undefined)
      
      inline def setItemsSource(value: Any): Self = StObject.set(x, "itemsSource", value.asInstanceOf[js.Any])
      
      inline def setItemsSourceUndefined: Self = StObject.set(x, "itemsSource", js.undefined)
      
      inline def setLegendCollection(value: js.Array[Any]): Self = StObject.set(x, "legendCollection", value.asInstanceOf[js.Any])
      
      inline def setLegendCollectionUndefined: Self = StObject.set(x, "legendCollection", js.undefined)
      
      inline def setLegendCollectionVarargs(value: Any*): Self = StObject.set(x, "legendCollection", js.Array(value*))
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TooltipSettings extends StObject {
    
    /** Defines the animation for the tooltip that should be shown when the mouse hovers over rows/columns.
      */
    var animation: js.UndefOr[TooltipSettingsAnimation] = js.undefined
    
    /** Defines the tooltip of associate that should be shown when the mouse hovers over rows/columns.
      * @Default {mouseFollow}
      */
    var associate: js.UndefOr[Associate | String] = js.undefined
    
    /** Enables/ disables the balloon for the tooltip to be shown
      * @Default {true}
      */
    var isBalloon: js.UndefOr[Boolean] = js.undefined
    
    /** Defines various attributes of the Tooltip position
      */
    var position: js.UndefOr[TooltipSettingsPosition] = js.undefined
    
    /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {null}
      */
    var templateId: js.UndefOr[String] = js.undefined
    
    /** Defines the tooltip to be triggered.
      * @Default {hover}
      */
    var trigger: js.UndefOr[Trigger | String] = js.undefined
  }
  object TooltipSettings {
    
    inline def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: TooltipSettingsAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAssociate(value: Associate | String): Self = StObject.set(x, "associate", value.asInstanceOf[js.Any])
      
      inline def setAssociateUndefined: Self = StObject.set(x, "associate", js.undefined)
      
      inline def setIsBalloon(value: Boolean): Self = StObject.set(x, "isBalloon", value.asInstanceOf[js.Any])
      
      inline def setIsBalloonUndefined: Self = StObject.set(x, "isBalloon", js.undefined)
      
      inline def setPosition(value: TooltipSettingsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      inline def setTrigger(value: Trigger | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait TooltipSettingsAnimation extends StObject {
    
    /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {none}
      */
    var effect: js.UndefOr[Effect | String] = js.undefined
    
    /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {0}
      */
    var speed: js.UndefOr[Double] = js.undefined
  }
  object TooltipSettingsAnimation {
    
    inline def apply(): TooltipSettingsAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsAnimation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettingsAnimation] (val x: Self) extends AnyVal {
      
      inline def setEffect(value: Effect | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait TooltipSettingsPosition extends StObject {
    
    /** Sets the arrow position again popup.
      */
    var stem: js.UndefOr[TooltipSettingsPositionStem] = js.undefined
    
    /** Sets the Tooltip position against target.
      */
    var target: js.UndefOr[TooltipSettingsPositionTarget] = js.undefined
  }
  object TooltipSettingsPosition {
    
    inline def apply(): TooltipSettingsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettingsPosition] (val x: Self) extends AnyVal {
      
      inline def setStem(value: TooltipSettingsPositionStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      inline def setTarget(value: TooltipSettingsPositionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TooltipSettingsPositionStem extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[Horizontal | String] = js.undefined
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {bottom}
      */
    var vertical: js.UndefOr[Vertical | String] = js.undefined
  }
  object TooltipSettingsPositionStem {
    
    inline def apply(): TooltipSettingsPositionStem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPositionStem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettingsPositionStem] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: Horizontal | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Vertical | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait TooltipSettingsPositionTarget extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[Horizontal | String] = js.undefined
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {top}
      */
    var vertical: js.UndefOr[Vertical | String] = js.undefined
  }
  object TooltipSettingsPositionTarget {
    
    inline def apply(): TooltipSettingsPositionTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPositionTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettingsPositionTarget] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: Horizontal | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Vertical | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
