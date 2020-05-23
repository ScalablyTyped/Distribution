package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
trait ASPxClientCustomizeParameterEditorsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  var info: ASPxDesignerElementSerializationInfo
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor
}

object ASPxClientCustomizeParameterEditorsEventArgs {
  @scala.inline
  def apply(info: ASPxDesignerElementSerializationInfo, parameter: ASPxDesignerElementParameterDescriptor): ASPxClientCustomizeParameterEditorsEventArgs = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeParameterEditorsEventArgs]
  }
}

