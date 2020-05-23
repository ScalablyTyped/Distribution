package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a UI element of the Web Report Designer or Web Document Viewer.
  */
trait ASPxReportUIElement extends js.Object {
  /**
    * Provides access to an element model.
    */
  var model: js.Any
  /**
    * Provides access to the name of an HTML template used by an element.
    */
  var templateName: String
}

object ASPxReportUIElement {
  @scala.inline
  def apply(model: js.Any, templateName: String): ASPxReportUIElement = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxReportUIElement]
  }
}

