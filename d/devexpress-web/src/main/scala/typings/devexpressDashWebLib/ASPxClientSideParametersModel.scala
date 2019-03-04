package typings
package devexpressDashWebLib

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
  def serializeParameters(): scala.Unit
  /**
    * Initiates passing parameter values and generating the report document.
    */
  def submit(): scala.Unit
}

object ASPxClientSideParametersModel {
  @scala.inline
  def apply(
    serializeParameters: js.Function0[scala.Unit],
    submit: js.Function0[scala.Unit],
    tabInfo: ASPxClientDocumentPreviewTab
  ): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = serializeParameters, submit = submit, tabInfo = tabInfo)
  
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
}

