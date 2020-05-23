package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
trait ASPxClientCustomizeParameterLookUpSourceEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  var dataSource: js.Any
  /**
    * Provides access to the collection of look-up parameter values.
    */
  var items: js.Array[ASPxDesignerElementEditorItem]
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}

object ASPxClientCustomizeParameterLookUpSourceEventArgs {
  @scala.inline
  def apply(
    dataSource: js.Any,
    items: js.Array[ASPxDesignerElementEditorItem],
    parameter: ASPxDesignerElementParameterDescriptor
  ): ASPxClientCustomizeParameterLookUpSourceEventArgs = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterLookUpSourceEventArgs]
  }
}

