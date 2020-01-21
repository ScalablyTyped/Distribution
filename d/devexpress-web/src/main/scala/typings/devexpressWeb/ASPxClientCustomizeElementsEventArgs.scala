package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeElements, ASPxClientReportDesigner.PreviewCustomizeElements and ASPxClientWebDocumentViewer.CustomizeElements events.
  */
@JSGlobal("ASPxClientCustomizeElementsEventArgs")
@js.native
class ASPxClientCustomizeElementsEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeElementsEventArgs class with the specified settings.
    * @param elements An array of ASPxReportUIElement objects. This value is assigned to the ASPxClientCustomizeElementsEventArgs.Elements property.
    */
  def this(elements: js.Array[ASPxReportUIElement]) = this()
  /**
    * Provides access to the collection of UI elements.
    */
  var Elements: js.Array[ASPxReportUIElement] = js.native
  /**
    * Returns UI elements with the specified ID. An array of ASPxReportUIElement objects.
    * @param templateId A string that specifies the element ID.
    */
  def GetById(templateId: String): js.Array[ASPxReportUIElement] = js.native
}

