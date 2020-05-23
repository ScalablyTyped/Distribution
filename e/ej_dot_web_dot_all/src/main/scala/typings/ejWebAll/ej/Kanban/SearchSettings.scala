package typings.ejWebAll.ej.Kanban

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
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  /** To customize the searching string.
    */
  var key: js.UndefOr[String] = js.undefined
  /** To customize the operator based on searching.
    * @Default {contains}
    */
  var operator: js.UndefOr[String] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    fields: js.Array[_] = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    operator: String = null
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSettings]
  }
}

