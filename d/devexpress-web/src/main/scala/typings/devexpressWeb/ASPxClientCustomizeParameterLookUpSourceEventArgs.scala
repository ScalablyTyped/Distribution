package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@js.native
trait ASPxClientCustomizeParameterLookUpSourceEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  var dataSource: js.Any = js.native
  /**
    * Provides access to the collection of look-up parameter values.
    */
  var items: js.Array[ASPxDesignerElementEditorItem] = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor = js.native
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
  @scala.inline
  implicit class ASPxClientCustomizeParameterLookUpSourceEventArgsOps[Self <: ASPxClientCustomizeParameterLookUpSourceEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ASPxDesignerElementEditorItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ASPxDesignerElementEditorItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: ASPxDesignerElementParameterDescriptor): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
  
}

