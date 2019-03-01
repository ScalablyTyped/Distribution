package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PreviewParametersReset events.
  */
trait ASPxClientParametersResetEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to report parameters whose values have been reset.
    * Value: An ASPxClientWebDocumentViewerParameter array.
    */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter]
  /**
    * Provides access to a View Model for report parameters.
    * Value: A View Model object.
    */
  var ParametersViewModel: js.Object
}

object ASPxClientParametersResetEventArgs {
  @scala.inline
  def apply(Parameters: js.Array[ASPxClientWebDocumentViewerParameter], ParametersViewModel: js.Object): ASPxClientParametersResetEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Parameters")(Parameters)
    __obj.updateDynamic("ParametersViewModel")(ParametersViewModel)
    __obj.asInstanceOf[ASPxClientParametersResetEventArgs]
  }
}

