package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@JSGlobal("ASPxClientCustomizeParameterEditorsEventArgs")
@js.native
class ASPxClientCustomizeParameterEditorsEventArgs protected () extends ASPxClientEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientCustomizeParameterEditorsEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object.
    * @param info An ISerializationInfo object.
    */
  def this(parameter: ASPxDesignerElementParameterDescriptor, info: ASPxDesignerElementSerializationInfo) = this()
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  var info: ASPxDesignerElementSerializationInfo = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  var parameter: ASPxDesignerElementParameterDescriptor = js.native
}

