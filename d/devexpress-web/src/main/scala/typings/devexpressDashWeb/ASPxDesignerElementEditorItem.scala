package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about property values.
  */
trait ASPxDesignerElementEditorItem extends js.Object {
  /**
    * Gets a value displayed by a property editor.
    * Value: A String value.
    */
  var displayValue: String
  /**
    * Gets an actual property value.
    * Value: A Object value.
    */
  var value: js.Object
}

object ASPxDesignerElementEditorItem {
  @scala.inline
  def apply(displayValue: String, value: js.Object): ASPxDesignerElementEditorItem = {
    val __obj = js.Dynamic.literal(displayValue = displayValue, value = value)
  
    __obj.asInstanceOf[ASPxDesignerElementEditorItem]
  }
}

