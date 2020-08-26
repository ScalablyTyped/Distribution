package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@JSGlobal("ASPxClientCustomizeParameterEditorsEventArgs")
@js.native
class ASPxClientCustomizeParameterEditorsEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCustomizeParameterEditorsEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientCustomizeParameterEditorsEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object.
    * @param info An ISerializationInfo object.
    */
  def this(
    parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    info: typings.devexpressWeb.ASPxDesignerElementSerializationInfo
  ) = this()
}

