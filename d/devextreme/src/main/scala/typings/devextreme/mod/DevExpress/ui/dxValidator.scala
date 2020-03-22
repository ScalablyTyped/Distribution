package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidator extends DOMComponent {
  /** Sets focus to the editor associated with the current Validator object. */
  def focus(): Unit = js.native
  /** Resets the value and validation result of the editor associated with the current Validator object. */
  def reset(): Unit = js.native
  /** Validates the value of the editor that is controlled by the current Validator object against the list of the specified validation rules. */
  def validate(): dxValidatorResult = js.native
}

