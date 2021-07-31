package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@JSGlobal("ASPxClientCustomizeParameterEditorsEventArgs")
@js.native
class ASPxClientCustomizeParameterEditorsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomizeParameterEditorsEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientCustomizeParameterEditorsEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object.
    * @param info An ISerializationInfo object.
    */
  def this(
    parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    info: typings.devexpressWeb.ASPxDesignerElementSerializationInfo
  ) = this()
  
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  /* CompleteClass */
  var info: typings.devexpressWeb.ASPxDesignerElementSerializationInfo = js.native
  
  /**
    * Provides access to an object that stores information about a parameter.
    */
  /* CompleteClass */
  var parameter: typings.devexpressWeb.ASPxDesignerElementParameterDescriptor = js.native
}
