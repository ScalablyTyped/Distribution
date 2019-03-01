package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCollapseEventArgs extends js.Object {
  /** returns the format asynchronous or synchronous
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of currently clicked node
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns the child nodes are loaded or not
    */
  var isChildLoaded: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parent id of currently clicked node
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeCollapseEventArgs {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentElement: js.Any = null,
    id: java.lang.String = null,
    isChildLoaded: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    parentId: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): BeforeCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isChildLoaded)) __obj.updateDynamic("isChildLoaded")(isChildLoaded)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BeforeCollapseEventArgs]
  }
}

