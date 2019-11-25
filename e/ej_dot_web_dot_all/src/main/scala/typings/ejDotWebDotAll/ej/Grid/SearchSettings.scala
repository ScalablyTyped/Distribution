package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSettings extends js.Object {
  /** This specify the grid to search for the value in particular columns that is mentioned in the field.
    * @Default {[]}
    */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** It enables or disables case-sensitivity while searching the search key in grid.
    * @Default {true}
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  /** This specifies the grid to search the particular data that is mentioned in the key.
    */
  var key: js.UndefOr[String] = js.undefined
  /** It specifies the grid to search the records based on operator.
    * @Default {contains}
    */
  var operator: js.UndefOr[String] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    fields: js.Any = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    operator: String = null
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSettings]
  }
}

