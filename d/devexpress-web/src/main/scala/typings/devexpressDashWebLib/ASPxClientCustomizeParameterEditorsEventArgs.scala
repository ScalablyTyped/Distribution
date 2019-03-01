package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeParameterEditors events.
  */
trait ASPxClientCustomizeParameterEditorsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    * Value: An ASPxDesignerElementSerializationInfo object.
    */
  var info: ASPxDesignerElementSerializationInfo
  /**
    * Provides access to an object that stores information about a parameter.
    * Value: An ASPxDesignerElementParameterDescriptor object.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}

object ASPxClientCustomizeParameterEditorsEventArgs {
  @scala.inline
  def apply(info: ASPxDesignerElementSerializationInfo, parameter: ASPxDesignerElementParameterDescriptor): ASPxClientCustomizeParameterEditorsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[ASPxClientCustomizeParameterEditorsEventArgs]
  }
}

