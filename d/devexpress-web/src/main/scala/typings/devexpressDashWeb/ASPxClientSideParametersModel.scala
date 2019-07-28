package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the report parameters' client-side model.
  */
trait ASPxClientSideParametersModel extends js.Object {
  /**
    * Provides information about the tab for specifying parameter values.
    * Value: An object that provides information about the Parameters tab.
    */
  var tabInfo: ASPxClientDocumentPreviewTab
  /**
    * Serializes report parameters before passing them to the server.
    */
  def serializeParameters(): Unit
  /**
    * Initiates passing parameter values and generating the report document.
    */
  def submit(): Unit
}

object ASPxClientSideParametersModel {
  @scala.inline
  def apply(serializeParameters: () => Unit, submit: () => Unit, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = js.Any.fromFunction0(serializeParameters), submit = js.Any.fromFunction0(submit), tabInfo = tabInfo)
  
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
}

