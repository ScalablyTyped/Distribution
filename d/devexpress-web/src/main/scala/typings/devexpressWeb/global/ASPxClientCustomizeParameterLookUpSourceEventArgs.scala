package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@JSGlobal("ASPxClientCustomizeParameterLookUpSourceEventArgs")
@js.native
class ASPxClientCustomizeParameterLookUpSourceEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCustomizeParameterLookUpSourceEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeParameterLookUpSourceEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object that stores information about a parameter. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.parameter property.
    * @param items An array of IDisplayedValue objects that stores information about look-up parameter values. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.items property.
    */
  def this(
    parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    items: js.Array[typings.devexpressWeb.ASPxDesignerElementEditorItem]
  ) = this()
}
