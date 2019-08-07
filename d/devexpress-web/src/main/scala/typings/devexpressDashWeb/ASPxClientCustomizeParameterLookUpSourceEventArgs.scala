package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@JSGlobal("ASPxClientCustomizeParameterLookUpSourceEventArgs")
@js.native
class ASPxClientCustomizeParameterLookUpSourceEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeParameterLookUpSourceEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object that stores information about a parameter. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.parameter property.
    * @param items An array of IDisplayedValue objects that stores information about look-up parameter values. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.items property.
    */
  def this(parameter: ASPxDesignerElementParameterDescriptor, items: js.Array[ASPxDesignerElementEditorItem]) = this()
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

