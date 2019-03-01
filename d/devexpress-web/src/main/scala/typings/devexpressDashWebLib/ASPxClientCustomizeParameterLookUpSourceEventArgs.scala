package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeParameterLookUpSource events.
  */
trait ASPxClientCustomizeParameterLookUpSourceEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    * Value: An Object specifying the data source that provides look-up values to the parameter editor.
    */
  var dataSource: js.Object
  /**
    * Provides access to the collection of look-up parameter values.
    * Value: An array of ASPxDesignerElementEditorItem objects that store information about look-up parameter values.
    */
  var items: js.Array[ASPxDesignerElementEditorItem]
  /**
    * Provides access to an object that stores information about a parameter.
    * Value: An ASPxDesignerElementParameterDescriptor object that stores information about the parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}

object ASPxClientCustomizeParameterLookUpSourceEventArgs {
  @scala.inline
  def apply(
    dataSource: js.Object,
    items: js.Array[ASPxDesignerElementEditorItem],
    parameter: ASPxDesignerElementParameterDescriptor
  ): ASPxClientCustomizeParameterLookUpSourceEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[ASPxClientCustomizeParameterLookUpSourceEventArgs]
  }
}

