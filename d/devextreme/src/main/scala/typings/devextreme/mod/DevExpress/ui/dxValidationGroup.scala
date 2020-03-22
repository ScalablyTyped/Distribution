package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidationGroup extends DOMComponent {
  /** Resets the value and validation result of the editors that are included to the current validation group. */
  def reset(): Unit = js.native
  /** Validates rules of the validators that belong to the current validation group. */
  def validate(): dxValidationGroupResult = js.native
}

