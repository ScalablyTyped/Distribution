package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides general information about a report parameter.
  */
trait ASPxDesignerElementParameterDescriptor extends js.Object {
  /**
    * Provides access to the parameter description.
    * Value: A String value, specifying the parameter description.
    */
  var description: String
  /**
    * Provides access to the parameter name.
    * Value: A String value, specifying the parameter name.
    */
  var name: String
  /**
    * Provides access to the parameter type.
    * Value: A String value, specifying the parameter type.
    */
  var `type`: String
  /**
    * Provides access to the parameter value.
    * Value: A Object, specifying the parameter value.
    */
  var value: js.Object
  /**
    * Provides access to the parameter visibility state.
    * Value: true if the parameter is visible; otherwise false.
    */
  var visible: Boolean
}

object ASPxDesignerElementParameterDescriptor {
  @scala.inline
  def apply(description: String, name: String, `type`: String, value: js.Object, visible: Boolean): ASPxDesignerElementParameterDescriptor = {
    val __obj = js.Dynamic.literal(description = description, name = name, value = value, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ASPxDesignerElementParameterDescriptor]
  }
}

