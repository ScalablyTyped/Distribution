package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorTableCellPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    */
  var applyForAll: Boolean = js.native
  
  /**
    * Contains the style settings defining the appearance of the target cell element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}
object ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  
  @scala.inline
  def apply(
    applyForAll: Boolean,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorTableCellPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(applyForAll = applyForAll.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorTableCellPropertiesCommandArgumentsMutableBuilder[Self <: ASPxClientHtmlEditorTableCellPropertiesCommandArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyForAll(value: Boolean): Self = StObject.set(x, "applyForAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = StObject.set(x, "styleSettings", value.asInstanceOf[js.Any])
  }
}
