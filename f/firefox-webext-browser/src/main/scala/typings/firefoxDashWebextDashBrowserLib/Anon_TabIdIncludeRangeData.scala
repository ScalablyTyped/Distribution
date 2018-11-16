package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_TabIdIncludeRangeData extends js.Object {
  /** Find only ranges with case sensitive match. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Find only ranges that match entire word. */
  var entireWord: js.UndefOr[scala.Boolean] = js.undefined
  /** Return range data which provides range data in a serializable form. */
  var includeRangeData: js.UndefOr[scala.Boolean] = js.undefined
  /** Return rectangle data which describes visual position of search results. */
  var includeRectData: js.UndefOr[scala.Boolean] = js.undefined
  /** Tab to query. Defaults to the active tab. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

