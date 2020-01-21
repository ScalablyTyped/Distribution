package typings.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSuccessEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns number of times trying to fetch the data
    */
  var count: js.UndefOr[Double] = js.undefined
  /** returns the Autocomplete model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval from the Database
    */
  var request: js.UndefOr[js.Any] = js.undefined
  /** Returns the number of items fetched from remote data
    */
  var result: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Returns the requested data
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object ActionSuccessEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    model: js.Any = null,
    query: js.Any = null,
    request: js.Any = null,
    result: js.Array[_] = null,
    `type`: String = null,
    xhr: js.Any = null
  ): ActionSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSuccessEventArgs]
  }
}

