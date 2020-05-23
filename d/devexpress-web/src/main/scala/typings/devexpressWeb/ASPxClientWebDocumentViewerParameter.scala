package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientWebDocumentViewerParameter extends js.Object {
  var isMultiValue: Boolean
  var `type`: js.Any
  var value: js.Any
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor
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
}

