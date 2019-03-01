package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFailureEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the error message
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /** returns the Autocomplete model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    model: js.Any = null,
    query: js.Any = null,
    `type`: java.lang.String = null
  ): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (error != null) __obj.updateDynamic("error")(error)
    if (model != null) __obj.updateDynamic("model")(model)
    if (query != null) __obj.updateDynamic("query")(query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
}

