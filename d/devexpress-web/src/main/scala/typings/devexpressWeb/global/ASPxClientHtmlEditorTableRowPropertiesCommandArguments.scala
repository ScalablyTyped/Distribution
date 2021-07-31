package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEROWPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableRowPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableRowPropertiesCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorTableRowPropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableRowPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The html editor in which the target element is located.
    * @param selectedElement The element currently selected in the HTML editor.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: js.Any = js.native
  
  /**
    * Contains the style settings specifying the appearance of the specified table row.
    */
  /* CompleteClass */
  var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}
