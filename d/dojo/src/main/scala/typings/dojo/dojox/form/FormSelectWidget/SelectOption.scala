package typings.dojo.dojox.form.FormSelectWidget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/_FormSelectWidget.__SelectOption.html
  *
  *
  */
trait SelectOption extends js.Object {
  /**
    * Whether or not this specific option is disabled
    *
    */
  var disabled: Boolean
  /**
    * The label for our option.  It can contain html tags.
    *
    */
  var label: String
  /**
    * Whether or not we are a selected option
    *
    */
  var selected: Boolean
  /**
    * The value of the option.  Setting to empty (or missing) will
    * place a separator at that location
    *
    */
  var value: String
}

object SelectOption {
  @scala.inline
  def apply(disabled: Boolean, label: String, selected: Boolean, value: String): SelectOption = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
}

