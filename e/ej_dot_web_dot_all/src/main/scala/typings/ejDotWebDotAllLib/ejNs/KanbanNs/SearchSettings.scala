package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSettings extends js.Object {
  /** To customize the fields the searching operation can be perform.
    * @Default {Array}
    */
  var fields: js.UndefOr[js.Array[_]] = js.undefined
  /** To customize the ignore case based on searching.
    * @Default {true}
    */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /** To customize the searching string.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** To customize the operator based on searching.
    * @Default {contains}
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    fields: js.Array[_] = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    operator: java.lang.String = null
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (key != null) __obj.updateDynamic("key")(key)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[SearchSettings]
  }
}

