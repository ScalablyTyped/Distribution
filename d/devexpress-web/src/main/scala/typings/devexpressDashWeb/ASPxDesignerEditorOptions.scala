package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a value editor used in the Property Grid.
  */
trait ASPxDesignerEditorOptions extends js.Object {
  /**
    * Provides access to the name of an HTML template used by a complex object's editor.
    * Value: A string that specifies the name of an HTML template.
    */
  var content: String
  /**
    * Provides access to the type of the editor model.
    * Value: An object that specifies the editor type.
    */
  var editorType: js.Object
  /**
    * Provides access to the name of an HTML template specifying the editor and header of a complex object.
    * Value: A string that specifies the HTML template.
    */
  var header: String
}

object ASPxDesignerEditorOptions {
  @scala.inline
  def apply(content: String, editorType: js.Object, header: String): ASPxDesignerEditorOptions = {
    val __obj = js.Dynamic.literal(content = content, editorType = editorType, header = header)
  
    __obj.asInstanceOf[ASPxDesignerEditorOptions]
  }
}

