package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a UI element of the Web Report Designer or Web Document Viewer.
  */
@js.native
trait ASPxReportUIElement extends js.Object {
  /**
    * Provides access to an element model.
    */
  var model: js.Any = js.native
  /**
    * Provides access to the name of an HTML template used by an element.
    */
  var templateName: String = js.native
}

object ASPxReportUIElement {
  @scala.inline
  def apply(model: js.Any, templateName: String): ASPxReportUIElement = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxReportUIElement]
  }
  @scala.inline
  implicit class ASPxReportUIElementOps[Self <: ASPxReportUIElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
  }
  
}

