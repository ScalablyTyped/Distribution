package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeElements events.
  */
trait ASPxClientCustomizeElementsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the collection of UI elements.
    * Value: An array of the ASPxReportUIElement objects.
    */
  var Elements: js.Array[ASPxReportUIElement]
  /**
    * Returns UI elements with the specified ID.
    * @param templateId A string that specifies the element ID.
    */
  def GetById(templateId: java.lang.String): js.Array[ASPxReportUIElement]
}

object ASPxClientCustomizeElementsEventArgs {
  @scala.inline
  def apply(
    Elements: js.Array[ASPxReportUIElement],
    GetById: java.lang.String => js.Array[ASPxReportUIElement]
  ): ASPxClientCustomizeElementsEventArgs = {
    val __obj = js.Dynamic.literal(Elements = Elements, GetById = js.Any.fromFunction1(GetById))
  
    __obj.asInstanceOf[ASPxClientCustomizeElementsEventArgs]
  }
}

