package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeElements, ASPxClientReportDesigner.PreviewCustomizeElements and ASPxClientWebDocumentViewer.CustomizeElements events.
  */
@js.native
trait ASPxClientCustomizeElementsEventArgs extends ASPxClientEventArgs {
  
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
object ASPxClientCustomizeElementsEventArgs {
  
  @scala.inline
  def apply(Elements: js.Array[ASPxReportUIElement], GetById: String => js.Array[ASPxReportUIElement]): ASPxClientCustomizeElementsEventArgs = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeElementsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCustomizeElementsEventArgsOps[Self <: ASPxClientCustomizeElementsEventArgs] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: ASPxReportUIElement*): Self = this.set("Elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[ASPxReportUIElement]): Self = this.set("Elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetById(value: String => js.Array[ASPxReportUIElement]): Self = this.set("GetById", js.Any.fromFunction1(value))
  }
}
