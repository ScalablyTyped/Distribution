package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeElements, ASPxClientReportDesigner.PreviewCustomizeElements and ASPxClientWebDocumentViewer.CustomizeElements events.
  */
@JSGlobal("ASPxClientCustomizeElementsEventArgs")
@js.native
open class ASPxClientCustomizeElementsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomizeElementsEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeElementsEventArgs class with the specified settings.
    * @param elements An array of ASPxReportUIElement objects. This value is assigned to the ASPxClientCustomizeElementsEventArgs.Elements property.
    */
  def this(elements: js.Array[typings.devexpressWeb.ASPxReportUIElement]) = this()
  
  /**
    * Provides access to the collection of UI elements.
    */
  /* CompleteClass */
  var Elements: js.Array[typings.devexpressWeb.ASPxReportUIElement] = js.native
  
  /**
    * Returns UI elements with the specified ID. An array of ASPxReportUIElement objects.
    * @param templateId A string that specifies the element ID.
    */
  /* CompleteClass */
  override def GetById(templateId: String): js.Array[typings.devexpressWeb.ASPxReportUIElement] = js.native
}
