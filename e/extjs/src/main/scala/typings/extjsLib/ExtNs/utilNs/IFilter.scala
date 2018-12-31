package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Changes the filtering function which this Filter uses to choose items to include
  		* @param filterFn Function A function which returns true or false to either include or exclude the passed object.
  		*/
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Changes the value that this filter tests its configured  link cfg property with
  		* @param value Mixed The new value to compare the property with.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

