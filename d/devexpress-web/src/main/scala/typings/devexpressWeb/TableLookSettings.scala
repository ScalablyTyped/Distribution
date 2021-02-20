package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the table style settings that modify the table appearance.
  */
@js.native
trait TableLookSettings extends StObject {
  
  /**
    * Specifies whether special formatting is applied to the first column of the table.
    */
  var applyFirstColumn: Boolean = js.native
  
  /**
    * Specifies whether special formatting is applied to the first row of the table.
    */
  var applyFirstRow: Boolean = js.native
  
  /**
    * Specifies whether special formatting is applied to the last column of the table.
    */
  var applyLastColumn: Boolean = js.native
  
  /**
    * Specifies whether special formatting is applied to the last row of the table.
    */
  var applyLastRow: Boolean = js.native
  
  /**
    * Specifies whether column banding formatting is not applied to the table.
    */
  var doNotApplyColumnBanding: Boolean = js.native
  
  /**
    * Specifies whether row banding formatting is not applied to the table.
    */
  var doNotApplyRowBanding: Boolean = js.native
}
object TableLookSettings {
  
  @scala.inline
  def apply(
    applyFirstColumn: Boolean,
    applyFirstRow: Boolean,
    applyLastColumn: Boolean,
    applyLastRow: Boolean,
    doNotApplyColumnBanding: Boolean,
    doNotApplyRowBanding: Boolean
  ): TableLookSettings = {
    val __obj = js.Dynamic.literal(applyFirstColumn = applyFirstColumn.asInstanceOf[js.Any], applyFirstRow = applyFirstRow.asInstanceOf[js.Any], applyLastColumn = applyLastColumn.asInstanceOf[js.Any], applyLastRow = applyLastRow.asInstanceOf[js.Any], doNotApplyColumnBanding = doNotApplyColumnBanding.asInstanceOf[js.Any], doNotApplyRowBanding = doNotApplyRowBanding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLookSettings]
  }
  
  @scala.inline
  implicit class TableLookSettingsMutableBuilder[Self <: TableLookSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyFirstColumn(value: Boolean): Self = StObject.set(x, "applyFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyFirstRow(value: Boolean): Self = StObject.set(x, "applyFirstRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyLastColumn(value: Boolean): Self = StObject.set(x, "applyLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyLastRow(value: Boolean): Self = StObject.set(x, "applyLastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotApplyColumnBanding(value: Boolean): Self = StObject.set(x, "doNotApplyColumnBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotApplyRowBanding(value: Boolean): Self = StObject.set(x, "doNotApplyRowBanding", value.asInstanceOf[js.Any])
  }
}
