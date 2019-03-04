package typings
package devexpressDashWebLib

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
  var displayValue: java.lang.String
  /**
    * Gets an actual property value.
    * Value: A Object value.
    */
  var value: js.Object
}

object ASPxDesignerElementEditorItem {
  @scala.inline
  def apply(displayValue: java.lang.String, value: js.Object): ASPxDesignerElementEditorItem = {
    val __obj = js.Dynamic.literal(displayValue = displayValue, value = value)
  
    __obj.asInstanceOf[ASPxDesignerElementEditorItem]
  }
}

