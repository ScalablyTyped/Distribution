package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientWebDocumentViewerParameter extends js.Object {
  var isMultiValue: Boolean = js.native
  var `type`: js.Any = js.native
  var value: js.Any = js.native
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor = js.native
}

object ASPxClientWebDocumentViewerParameter {
  @scala.inline
  def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: Boolean,
    `type`: js.Any,
    value: js.Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  @scala.inline
  implicit class ASPxClientWebDocumentViewerParameterOps[Self <: ASPxClientWebDocumentViewerParameter] (val x: Self) extends AnyVal {
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
    def setGetParameterDescriptor(value: () => ASPxDesignerElementParameterDescriptor): Self = this.set("getParameterDescriptor", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = this.set("isMultiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

