package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@JSGlobal("ASPxClientCustomizeParameterLookUpSourceEventArgs")
@js.native
open class ASPxClientCustomizeParameterLookUpSourceEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomizeParameterLookUpSourceEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeParameterLookUpSourceEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object that stores information about a parameter. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.parameter property.
    * @param items An array of IDisplayedValue objects that stores information about look-up parameter values. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.items property.
    */
  def this(
    parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    items: js.Array[typings.devexpressWeb.ASPxDesignerElementEditorItem]
  ) = this()
  
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  /* CompleteClass */
  var dataSource: Any = js.native
  
  /**
    * Provides access to the collection of look-up parameter values.
    */
  /* CompleteClass */
  var items: js.Array[typings.devexpressWeb.ASPxDesignerElementEditorItem] = js.native
  
  /**
    * Provides access to an object that stores information about a parameter.
    */
  /* CompleteClass */
  var parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor = js.native
}
