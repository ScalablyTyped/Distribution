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

