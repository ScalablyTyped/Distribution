package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTablePropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTablePropertiesCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorTablePropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTablePropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  
  /**
    * Determines the position of the target table element.
    */
  /* CompleteClass */
  var align: String = js.native
  
  /**
    * Gets or sets a value that is the table caption.
    */
  /* CompleteClass */
  var caption: String = js.native
  
  /**
    * Gets or sets a table cell padding.
    */
  /* CompleteClass */
  var cellPadding: Double = js.native
  
  /**
    * Gets or sets the table cell spacing.
    */
  /* CompleteClass */
  var cellSpacing: Double = js.native
  
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  /* CompleteClass */
  var headers: String = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: js.Any = js.native
  
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  /* CompleteClass */
  var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  
  /**
    * Gets or sets the table's summary.
    */
  /* CompleteClass */
  var summary: String = js.native
}
