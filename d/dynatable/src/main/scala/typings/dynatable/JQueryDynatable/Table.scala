package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /**
    * Selector used by dynatable in order to find the table body rows
    *
    * @default 'tbody tr'
    */
  var bodyRowSelector: js.UndefOr[String] = js.undefined
  /** Generated internally by the plugin, will be reset by the DomColumns at init */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /**
    * By default, dynatable converts headings to JSON attribute names using:
    *
    * @enum('camelCase', 'trimDash', 'dashed', 'underscore', 'lowercase')
    * @default 'camelCase'
    * @see http://www.dynatable.com/#converting-attribute-names
    *
    * @example
    * // Given the html `<th>Favorite Music</th>` column header
    * // `camelCase` would translate it to id `favoriteMusic`
    * // `trimDash` would translate it to id `Favorite-Music`
    * // `dashed` would translate it to id `favorite-music`
    * // `underscore` would translate it to id `favorite_music`
    * // `lowercase` would translate it to id `favorite music`
    */
  var defaultColumnIdStyle: js.UndefOr[String] = js.undefined
  /**
    * Optional classname that can be added by dynatable to the header cells
    *
    * @default null
    */
  var headRowClass: js.UndefOr[String] = js.undefined
  /**
    * Selector used by dynatable in order to find the table header row
    *
    * @default 'thead tr'
    */
  var headRowSelector: js.UndefOr[String] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    bodyRowSelector: String = null,
    columns: js.Array[Column] = null,
    defaultColumnIdStyle: String = null,
    headRowClass: String = null,
    headRowSelector: String = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (bodyRowSelector != null) __obj.updateDynamic("bodyRowSelector")(bodyRowSelector)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (defaultColumnIdStyle != null) __obj.updateDynamic("defaultColumnIdStyle")(defaultColumnIdStyle)
    if (headRowClass != null) __obj.updateDynamic("headRowClass")(headRowClass)
    if (headRowSelector != null) __obj.updateDynamic("headRowSelector")(headRowSelector)
    __obj.asInstanceOf[Table]
  }
}

