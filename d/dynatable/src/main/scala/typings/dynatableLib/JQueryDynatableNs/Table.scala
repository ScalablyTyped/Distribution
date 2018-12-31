package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /**
    * Selector used by dynatable in order to find the table body rows
    *
    * @default 'tbody tr'
    */
  var bodyRowSelector: js.UndefOr[java.lang.String] = js.undefined
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
  var defaultColumnIdStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional classname that can be added by dynatable to the header cells
    *
    * @default null
    */
  var headRowClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selector used by dynatable in order to find the table header row
    *
    * @default 'thead tr'
    */
  var headRowSelector: js.UndefOr[java.lang.String] = js.undefined
}

