package typings.ejDotWebDotAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
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

object ActionCompleteEventArgs {
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
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (query != null) __obj.updateDynamic("query")(query)
    if (request != null) __obj.updateDynamic("request")(request)
    if (result != null) __obj.updateDynamic("result")(result)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

