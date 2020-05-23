package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientSideParametersModel extends js.Object {
  var tabInfo: ASPxClientDocumentPreviewTab
  def serializeParameters(): Unit
  def submit(): Unit
}

object ASPxClientSideParametersModel {
  @scala.inline
  def apply(serializeParameters: () => Unit, submit: () => Unit, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = js.Any.fromFunction0(serializeParameters), submit = js.Any.fromFunction0(submit), tabInfo = tabInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
}

