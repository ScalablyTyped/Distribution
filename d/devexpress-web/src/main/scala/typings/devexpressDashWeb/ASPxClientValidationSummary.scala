package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxValidationSummary control.
  */
@JSGlobal("ASPxClientValidationSummary")
@js.native
class ASPxClientValidationSummary () extends ASPxClientControl {
  /**
    * Occurs on the client side when the validation summary's visibility is changed.
    */
  var VisibilityChanged: ASPxClientEvent[
    ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
  ] = js.native
}

