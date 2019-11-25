package typings.dojo.dijit.form._FormSelectWidget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormSelectWidget.__SelectOption.html
  *
  * 
  */
trait __SelectOption extends js.Object {
  /**
    * Whether or not this specific option is disabled
    * 
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The label for our option.  It can contain html tags.
    * 
    */
  var label: String
  /**
    * Whether or not we are a selected option
    * 
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the option.  Setting to empty (or missing) will
    * place a separator at that location
    * 
    */
  var value: String
}

object __SelectOption {
  @scala.inline
  def apply(
    label: String,
    value: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): __SelectOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[__SelectOption]
  }
}

