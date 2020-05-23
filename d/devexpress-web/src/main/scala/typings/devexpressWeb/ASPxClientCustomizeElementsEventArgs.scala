package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeElements, ASPxClientReportDesigner.PreviewCustomizeElements and ASPxClientWebDocumentViewer.CustomizeElements events.
  */
trait ASPxClientCustomizeElementsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the collection of UI elements.
    */
  var Elements: js.Array[ASPxReportUIElement]
  /**
    * Returns UI elements with the specified ID. An array of ASPxReportUIElement objects.
    * @param templateId A string that specifies the element ID.
    */
  def GetById(templateId: String): js.Array[ASPxReportUIElement]
}

object ASPxClientCustomizeElementsEventArgs {
  @scala.inline
  def apply(Elements: js.Array[ASPxReportUIElement], GetById: String => js.Array[ASPxReportUIElement]): ASPxClientCustomizeElementsEventArgs = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeElementsEventArgs]
  }
}

