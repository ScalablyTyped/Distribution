package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableColumnPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableColumnPropertiesCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableColumnPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: js.Any = js.native
  
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  /* CompleteClass */
  var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}
