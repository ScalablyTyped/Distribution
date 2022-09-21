package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings to format a table.
  */
@JSGlobal("TableFormattingSettings")
@js.native
open class TableFormattingSettings ()
  extends StObject
     with typings.devexpressWeb.TableFormattingSettings {
  
  /**
    * Gets or sets the alignment of table rows.
    */
  /* CompleteClass */
  var alignment: typings.devexpressWeb.TableRowAlignment = js.native
  
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    */
  /* CompleteClass */
  var allowSpacingBetweenCells: Boolean = js.native
  
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    */
  /* CompleteClass */
  var defaultCellMarginBottom: Double = js.native
  
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    */
  /* CompleteClass */
  var defaultCellMarginLeft: Double = js.native
  
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    */
  /* CompleteClass */
  var defaultCellMarginRight: Double = js.native
  
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    */
  /* CompleteClass */
  var defaultCellMarginTop: Double = js.native
  
  /**
    * Gets or sets the table's left indent in twips.
    */
  /* CompleteClass */
  var indent: Double = js.native
  
  /**
    * Gets or sets the preferred width of cells in the table.
    */
  /* CompleteClass */
  var preferredWidth: typings.devexpressWeb.TableWidthUnit = js.native
  
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    */
  /* CompleteClass */
  var resizeToFitContent: Boolean = js.native
  
  /**
    * Gets or sets the spacing between table cells in twips.
    */
  /* CompleteClass */
  var spacingBetweenCells: Double = js.native
}
