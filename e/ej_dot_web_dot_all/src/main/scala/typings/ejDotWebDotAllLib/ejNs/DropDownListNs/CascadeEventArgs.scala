package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cascading dropdown model.
    */
  var cascadeModel: js.UndefOr[js.Any] = js.undefined
  /** returns the current selected value in first dropdown.
    */
  var cascadeValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the default filter action for second dropdown data should happen or not.
    */
  var requiresDefaultFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CascadeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cascadeModel: js.Any = null,
    cascadeValue: java.lang.String = null,
    model: js.Any = null,
    requiresDefaultFilter: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): CascadeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cascadeModel != null) __obj.updateDynamic("cascadeModel")(cascadeModel)
    if (cascadeValue != null) __obj.updateDynamic("cascadeValue")(cascadeValue)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(requiresDefaultFilter)) __obj.updateDynamic("requiresDefaultFilter")(requiresDefaultFilter)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CascadeEventArgs]
  }
}

